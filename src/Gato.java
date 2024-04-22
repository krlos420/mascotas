public class Gato extends Animal{
    private String raza;
    private boolean pelo_largo;

    //Constructors
    public Gato(String codigo, int patas, int edad, String fecha_nacimiento, String raza, boolean pelo_largo) {
        super(codigo, patas, edad, fecha_nacimiento);
        this.raza = raza;
        this.pelo_largo = pelo_largo;
    }
    public Gato() {
    }
    //Getters i setters
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isPelo_largo() {
        return pelo_largo;
    }

    public void setPelo_largo(boolean pelo_largo) {
        this.pelo_largo = pelo_largo;
    }
    //Metodos
    public void habla(){
        System.out.println("MIAU MIAU");
    }
    public void aniversario(){
        int edad = this.getEdad()+1;
        setEdad(edad);
        System.out.println("La edad del gato es "+this.getEdad()+" años humanos o "+this.getEdad()*5+ " en años de gato");
    }
}
