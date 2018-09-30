package com.example.mohamedalasklany.les6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private Button view_supp,add_supp;
    private EditText supp_name,supp_phone,supp_address,supp_mail;
    private List<String> id_list;
    private List<SupplierInfo> Database;
    private  Long ID;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=findViewById(R.id.spinner);
        view_supp=findViewById(R.id.view_supp);
        add_supp=findViewById(R.id.add_supp);
        supp_name=findViewById(R.id.supp_name);
        supp_phone=findViewById(R.id.supp_phone);
        supp_address=findViewById(R.id.supp_address);
        supp_mail=findViewById(R.id.supp_mail);
        id_list= new ArrayList<String>();
        Database=new ArrayList<SupplierInfo>();
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,id_list);
        spinner.setAdapter(adapter);
        ID=Long.valueOf( 0);
        id_list.add(String.valueOf(ID));
        String [] m=getResources().getStringArray(R.array.mohamed);
        SupplierInfo obj=new SupplierInfo(m[0],m[1],m[2],m[3],ID++);
        Database.add(obj);
        id_list.add(String.valueOf(ID));
         m=getResources().getStringArray(R.array.Omar);
         obj=new SupplierInfo(m[0],m[1],m[2],m[3],ID++);
        Database.add(obj);
        id_list.add(String.valueOf(ID));
         m=getResources().getStringArray(R.array.helmy);
         obj=new SupplierInfo(m[0],m[1],m[2],m[3],ID++);
        Database.add(obj);
        view_supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                try {
                    Intent intent = new Intent(getApplicationContext(), Supplier.class);
                    Toast.makeText(getApplicationContext(), String.valueOf(spinner.getSelectedItem()), Toast.LENGTH_SHORT).show();
                    intent.putExtra("name", Database.get(  Integer.valueOf(spinner.getSelectedItem().toString())).getName());
                    intent.putExtra("phone", Database.get( Integer.valueOf(spinner.getSelectedItem().toString())).getPhone());
                    intent.putExtra("mail", Database.get( Integer.valueOf(spinner.getSelectedItem().toString())).getEmail());
                    intent.putExtra("address", Database.get( Integer.valueOf(spinner.getSelectedItem().toString())).getAddress());
                    startActivity(intent);
                }catch (Exception ex){}
            }
        });
        add_supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                acquire_supp_profile();
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(),"start",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(),"stop",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"destroy",Toast.LENGTH_SHORT).show();
    }
    void acquire_supp_profile()
    {
        try{
                id_list.add(String.valueOf(ID));
            SupplierInfo obj=new SupplierInfo(supp_name.getText().toString(),supp_phone.getText().toString(),supp_mail.getText().toString(),supp_address.getText().toString(),ID++);
             Database.add(obj);
            supp_name.setText("");
            supp_phone.setText("");
            supp_mail.setText("");
            supp_address.setText("");


        }catch (Exception ex)
        {
            Toast.makeText(getApplicationContext(),ex.getMessage(),Toast.LENGTH_LONG).show();
        }
    }
}
