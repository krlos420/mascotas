public class Gallina extends Ave{
    private boolean ponedora;
    //Constructors
    public Gallina(String codigo, int patas, int edad, String fecha_nacimiento, boolean pico, boolean vuela, boolean ponedora) {
        super(codigo, patas, edad, fecha_nacimiento, pico, vuela);
        this.ponedora = ponedora;
    }
    public Gallina() {
    }
    //Getter i setter
    public boolean isPonedora() {
        return ponedora;
    }

    public void setPonedora(boolean ponedora) {
        this.ponedora = ponedora;
    }

    //Metodos
    public void habla(){
        System.out.println("Coc, coc");
    }
    public void volar(){
        System.out.println("Las gallinas saltan metro y medio");
    }
    public void aniversario(){
        int edad = this.getEdad()+1;
        setEdad(edad);
        System.out.println("La edad de la gallina es "+this.getEdad()+" años humanos o "+this.getEdad()*8+ " en años de gallina");
    }
    public String toString(){
        return "Gallina con código "+ this.getCodigo();
    }

    @Override
    public void mostrarInfo() {
        System.out.println("El codigo de esta gallina es "+ this.getCodigo());
        System.out.println("Este animal tiene "+this.getPatas()+" patas");
        System.out.println("Este animal tiene "+this.getEdad()+" años");
        System.out.println("La fecha de nacimiento es: "+this.getFecha_nacimiento());
        System.out.println("Ponedora?: "+this.isPonedora());
    }
}
