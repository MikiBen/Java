import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
       List<Integer> lista = new ArrayList<>();
       lista.add(11);
        lista.add(-1);

        for (int i=0; i< lista.size();i++)
        {
            System.out.println(lista.get(i));
        }

    }
}