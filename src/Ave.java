public abstract class Ave extends Animal {
    private boolean pico;
    private boolean vuela;

    //Constructors
    public Ave(String codigo, int patas, int edad, String fecha_nacimiento, boolean pico, boolean vuela) {
        super(codigo, patas, edad, fecha_nacimiento);
        this.pico = pico;
        this.vuela = vuela;
    }
    public Ave() {
    }
    //Getters i setters
    public boolean isPico() {
        return pico;
    }

    public void setPico(boolean pico) {
        this.pico = pico;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }
    public abstract void volar();
}
