public class Perro extends Animal implements Mascota{
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
    public String toString(){
        return "Perro con código "+ this.getCodigo();
    }
    public void vacunar(){
        int vacunes = this.getNum_vacunas()+1;
        setDesparasitado(true);
    }
    @Override
    public void jugar(){
        System.out.println("Dame la pata");
        System.out.println("Coge el palo");
    }
    public void mostrarInfo(){
        System.out.println("El codigo de este perro es "+ this.getCodigo());
        System.out.println("Este animal tiene "+this.getPatas()+" patas");
        System.out.println("Este animal tiene "+this.getEdad()+" años");
        System.out.println("La fecha de nacimiento es: "+this.getFecha_nacimiento());
        System.out.println("La raza es: "+this.getRaza());
        System.out.println("Desparasitado?: "+this.isDesparasitado());
        System.out.println("Tiene "+this.getNum_vacunas()+" vacunas");
    }
}
