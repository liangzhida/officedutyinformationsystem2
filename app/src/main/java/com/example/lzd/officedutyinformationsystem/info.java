package com.example.lzd.officedutyinformationsystem;

public class info {
    String name;
    String password;

    @Override
    public String toString() {
        return "info{" + "name='" + name + '\'' + ", password='" + password + '\'' + '}';
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword( String password ) {
        this.password = password;
    }
}
