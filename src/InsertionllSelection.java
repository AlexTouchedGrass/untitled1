import java.util.ArrayList;
import java.util.Arrays;

public class InsertionllSelection {
    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<Integer>();
        nums.addAll(Arrays.asList(3,7,5,1,12,15,2));

        System.out.println("Original: " + nums);
        //Outer is beginning to end
        for (int i = 0;i < nums.size();i++) {
            int minIndex = i;
            //Inner is for finding smallest
            for (int j = i + 1;j < nums.size();j++) {
                if (nums.get(j) < nums.get(minIndex)) {
                    minIndex = j;
                }
            }
            //Swaps Values at i and minIndex (switches starting variable and bigger number)
            int temp = nums.get(i);
            nums.set(i,nums.get(minIndex));
            nums.set(minIndex, temp);
        }
        System.out.println("Sorted: " + nums);
    }
}
