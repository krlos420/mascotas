public class Perro extends Animal{
    private String raza;
    private boolean desparasitado;
    private int num_vacunas;

    //Constructors
    public Perro(String codigo, int patas, int edad, String fecha_nacimiento, String raza, boolean desparasitado, int num_vacunas) {
        super(codigo, patas, edad, fecha_nacimiento);
        this.raza = raza;
        this.desparasitado = desparasitado;
        this.num_vacunas = num_vacunas;
    }
    public Perro() {
    }
    //Getters i setters
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isDesparasitado() {
        return desparasitado;
    }

    public void setDesparasitado(boolean desparasitado) {
        this.desparasitado = desparasitado;
    }

    public int getNum_vacunas() {
        return num_vacunas;
    }

    public void setNum_vacunas(int num_vacunas) {
        this.num_vacunas = num_vacunas;
    }
    //Metodos
    public void habla(){
        System.out.println("GUAU, GUAU!");
    }
    public void aniversario(){
        int edad = this.getEdad()+1;
        setEdad(edad);
        System.out.println("La edad del perro es "+this.getEdad()+" años humanos o "+this.getEdad()*7+ " en años de perro");
    }
}
