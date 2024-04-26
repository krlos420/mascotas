public abstract class Animal implements Comparable<Animal>{
    private String codigo;
    private int patas;
    private int edad;
    private String fecha_nacimiento;

    //Constructors
    public Animal(String codigo, int patas, int edad, String fecha_nacimiento) throws ExcepcioEdat{
        this.codigo = codigo;
        this.patas = patas;
        if (edad<0){
            throw new ExcepcioEdat("La edad no pot ser negativa");
        }
        this.edad = edad;
        this.fecha_nacimiento = fecha_nacimiento;
    }
    public Animal() {
    }
    //Getters i setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    public abstract void habla();
    public abstract void aniversario();
    public abstract void mostrarInfo();
    public abstract String toString();

    @Override
    public int compareTo(Animal o) {
        return this.codigo.compareTo(o.codigo);
    }
}
