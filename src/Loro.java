public class Loro extends Ave{
    private String tipo;
    private boolean habla;

    //Constructors
    public Loro(String codigo, int patas, int edad, String fecha_nacimiento, boolean pico, boolean vuela, String tipo, boolean habla) {
        super(codigo, patas, edad, fecha_nacimiento, pico, vuela);
        this.tipo = tipo;
        this.habla = habla;
    }
    public Loro() {
    }
    //Getters i setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isHabla() {
        return habla;
    }

    public void setHabla(boolean habla) {
        this.habla = habla;
    }

    //Métodos
    public void habla(){
        System.out.println("Siuuuu");
    }
    public void volar(){
        System.out.println("Los loros se desplazan 3 metros");
    }
    public void aniversario(){
        int edad = this.getEdad()+1;
        setEdad(edad);
        System.out.println("La edad del loro es "+this.getEdad()+" años humanos o "+this.getEdad()*10+ " en años de loro");
    }
}
