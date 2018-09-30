package com.example.mohamedalasklany.les6;

import com.example.mohamedalasklany.les6.Supplier;

public class SupplierInfo
{
    private String name;
    private String email;
    private String phone;
    private String address;
    private long ID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }
    SupplierInfo ()
    {

    }
    SupplierInfo (String name,String phone,String email,String address ,Long ID)
    {
        this.address=address;
        this.name=name;
        this.phone=phone;
        this.email=email;
        this.ID=ID;
    }

}
