import java.util.Comparator;

public class CompararMulti implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        int var;
        var = o1.getClass().getName().compareTo(o2.getClass().getName());
        if (var==0){
            return o1.getCodigo().compareTo(o2.getCodigo());
        }
        return var;
    }
}
