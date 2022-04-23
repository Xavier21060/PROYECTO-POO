package model;

public class Patien extends Users {

    //Atributos de la clase empleado
    private String birthday;
    private String blood;
    private double weight; //solo va a ser accesible o modificable desde esta clases
    private double height; //solo va a ser accesible o modificable desde esta clases

    //metodo constructor
    public Patien (String name, String email) {
        super(name, email); // heredo los atributos de la clase padre(model.Users)

    }

    //creacion de un metodo getter y setters
    public String getWeight(){ // siempre que tenga un valor de retorno que asignarle la palabra return
        return this.weight + " kg ";
    }
    public void setWeight(double weight){
        this.weight = weight;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getHeight() {
        return this.height + "metros";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + "model.Patien: " +
                "\nbirthday=" + birthday + "\nblood=" + blood +
                "\nweight=" + getWeight() +
                "\nheight=" + getHeight() + '\n';
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciete");
        System.out.println("Historial clinico");


    }


}

