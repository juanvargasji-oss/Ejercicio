import java.awt.*;
import java.util.ArrayList;

public class DemoList {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        nums.add(60);

        int sum = 0;
        for (int i : nums) {
            sum += i;
            System.out.println(sum);
        }

        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Diana");
        names.add("Eve");
        names.add("Frank");

        for(String name : names) {
            System.out.println(name);
        }
        for(int x = 0; x < names.size(); x++) {
            System.out.println(names.get(x));
        }
        int l = 0;
        while(l < names.size()) {
            System.out.println(names.get(l));
            l++;
        }
    }
}

