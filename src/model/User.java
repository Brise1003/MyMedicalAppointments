package model;

public abstract class User {
    //Atributos
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    // Constructo
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
    // Inheritance
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
        if(phoneNumber.length() > 10){
            System.out.println("El número telefonico debe ser 10 digitos máximo.");
        } else if (phoneNumber.length() == 10) {
            this.phoneNumber = phoneNumber;
        }
    }

    @Override
    public String toString() {
        return "model.User: " + name + ", Email: " + email +
                "\nAddress: " + address + ". Phone: " + phoneNumber;
    }
    // Método declarado como abstracto sin llaves
    public abstract void showDataUser();
}
