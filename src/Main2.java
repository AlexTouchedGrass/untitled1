import java.util.ArrayList;
import java.util.Arrays;


public class Main2 {
    public static void main(String[] args) {
        ArrayList <String> names = new ArrayList<String>();

        names.addAll(Arrays.asList("Alex","Alexander","Alyx","Alejandro","Al"));

        System.out.println("Original: " + names);

        for (int i = 1;i<names.size();i++) {
            names.add(0,names.remove(i));
        }
        System.out.println("Reversed: " + names);
    }
}
