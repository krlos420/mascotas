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
}
