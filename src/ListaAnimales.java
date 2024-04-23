import java.util.ArrayList;
public class ListaAnimales {
    private static ArrayList<Animal> animales = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("---MENU---");
        System.out.println("1. Mostrar la lista de animales");
        System.out.println("2. Ordenar la lista por un criterio");
        System.out.println("3. Mostrar todos los datos de un animal");
        System.out.println("4. Insertar nuevo animal");
        System.out.println("5. Eliminar un animal");
        int opc = Leer.leerEntero("Que quieres hacer");
        if (opc ==1){
            for (int i =0; i<animales.size(); i++){
                System.out.println(animales.get(i));
            }
        }
        if (opc == 3){
            for (int i =0; i<animales.size(); i++){
                System.out.println(i+"-"+animales.get(i));
            }
            int an = Leer.leerEntero("De que animal quieres ver todos los datos? ");
            animales.get(an).mostrarInfo();
        }
        if (opc == 4){
            String seguir = "s";
            while (seguir.equalsIgnoreCase("s")){
                int tipoAni = Leer.leerEntero("Que tipo de animal quieres registrar? ");
                System.out.println("1. Perro");
                System.out.println("2. Gato");
                System.out.println("3. Loro");
                System.out.println("4. Gallina");
                if (tipoAni == 1) {
                    String codigo, fecha_nacimiento, raza;
                    int patas, edad, num_vacunas;
                    boolean desparasitado;
                    Perro p1;
                    codigo = Leer.leerTexto("Que código tiene el animal? ");
                    patas = Leer.leerEntero("Cuantas patas tiene? ");
                    edad = Leer.leerEntero("Que edad tiene? ");
                    fecha_nacimiento = Leer.leerTexto("Cual es su fecha de nacimiento? ");
                    raza = Leer.leerTexto("Que raza es?");
                    desparasitado = Leer.leerBoolean("Esta desparasitado? true/false ");
                    num_vacunas = Leer.leerEntero("Cuantas vacunas tiene? ");
                    p1 = new Perro(codigo, patas, edad, fecha_nacimiento, raza, desparasitado, num_vacunas);
                    animales.add(p1);
                    seguir = Leer.leerTexto("Quieres añadir otro animal?(s/n) ");
                }
                if (tipoAni == 2){
                    String codigo, fecha_nacimiento, raza;
                    int patas, edad;
                    boolean pelo_largo;
                    Gato g1;
                    codigo = Leer.leerTexto("Que código tiene el animal? ");
                    patas = Leer.leerEntero("Cuantas patas tiene? ");
                    edad = Leer.leerEntero("Que edad tiene? ");
                    fecha_nacimiento = Leer.leerTexto("Cual es su fecha de nacimiento? ");
                    raza = Leer.leerTexto("Que raza es?");
                    pelo_largo = Leer.leerBoolean("Tiene el pelo largo? true/false ");
                    g1 = new Gato (codigo, patas, edad, fecha_nacimiento, raza, pelo_largo);
                    animales.add(g1);
                    seguir = Leer.leerTexto("Quieres añadir otro animal?(s/n) ");
                }
                if (tipoAni == 3){
                    String codigo, fecha_nacimiento, tipo;
                    int patas, edad;
                    boolean pico, vuela, habla;
                    Loro l1;
                    codigo = Leer.leerTexto("Que código tiene el animal? ");
                    patas = Leer.leerEntero("Cuantas patas tiene? ");
                    edad = Leer.leerEntero("Que edad tiene? ");
                    fecha_nacimiento = Leer.leerTexto("Cual es su fecha de nacimiento? ");
                    pico = Leer.leerBoolean("Tiene pico? true/false ");
                    vuela = Leer.leerBoolean("Vuela? true/false ");
                    tipo = Leer.leerTexto("Que tipo es? ");
                    habla = Leer.leerBoolean("Habla? true/false ");
                    l1 = new Loro(codigo, patas, edad, fecha_nacimiento, pico, vuela, tipo, habla);
                    animales.add(l1);
                    seguir = Leer.leerTexto("Quieres añadir otro animal?(s/n) ");
                }
                if (tipoAni ==4){
                    String codigo, fecha_nacimiento;
                    int patas, edad;
                    boolean pico, vuela, ponedora;
                    Gallina ga1;
                    codigo = Leer.leerTexto("Que código tiene el animal? ");
                    patas = Leer.leerEntero("Cuantas patas tiene? ");
                    edad = Leer.leerEntero("Que edad tiene? ");
                    fecha_nacimiento = Leer.leerTexto("Cual es su fecha de nacimiento? ");
                    pico = Leer.leerBoolean("Tiene pico? true/false ");
                    vuela = Leer.leerBoolean("Vuela? true/false ");
                    ponedora = Leer.leerBoolean("Es ponedora? true/false ");
                    ga1 = new Gallina(codigo, patas, edad, fecha_nacimiento, pico, vuela, ponedora);
                    animales.add(ga1);
                    seguir = Leer.leerTexto("Quieres añadir otro animal?(s/n) ");
                }


            }
        }
        if (opc ==5){
            int eliminar = Leer.leerEntero("Que animal quieres eliminar? ");
            for (int i =0; i<animales.size(); i++){
                System.out.println(i+"-"+animales.get(i));
            }
            animales.remove(eliminar);
        }
    }
}