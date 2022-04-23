package model;

public abstract class Users {
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    //metodo constructor paa diferenciar al usuario y al doctor

    public Users(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 8){
            System.out.println("Debes asignar el numero telefonico de 8 digitps");
        }else if (phoneNumber.length()==8){

        }
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "model.Users: " + //que me traiga los Atributos de los model.Users
                "\nname='" + name +   //('\'')= Un salto de linea
                "\nemail='" + email +
                "\naddress='" + address +
                "\nphoneNumber='" + phoneNumber +
                '\n';
    }

    //si un metodo se esta heredando por defecto debe ser publiCO
    public abstract void showDataUser();




}
