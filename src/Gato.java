public class Gato extends Animal implements Mascota{
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
    public String toString(){
        return "Gato con código "+ this.getCodigo();
    }
    public void cortarPelo(){
        setPelo_largo(false);
    }
    @Override
    public void jugar(){
        System.out.println("Rasca la cuerda");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("El codigo de este gato es "+ this.getCodigo());
        System.out.println("Este animal tiene "+this.getPatas()+" patas");
        System.out.println("Este animal tiene "+this.getEdad()+" años");
        System.out.println("La fecha de nacimiento es: "+this.getFecha_nacimiento());
        System.out.println("La raza es: "+this.getRaza());
        System.out.println("Pelo largo?: "+this.isPelo_largo());
    }
}
