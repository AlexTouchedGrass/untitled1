import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println("Original: "+nums);

        for (int i = 1;i < nums.size();i++) {
            nums.add(0,nums.remove(i));
        }
        System.out.println("Reversed: "+nums);
    }
}

