package HomeTask3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        while (true)
        {
            String s = scanner.next();
            if (s.equals("break")) break;
            numbers.add(Integer.parseInt(s));
        }
        int count = 1;
        for (Integer i=0; i < numbers.size(); i++) {
            for (Integer j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i) != i)
                    count++;
                break;
            }
        }

        Collections.sort(numbers, new ReverseSorting());
        System.out.println(numbers);
        System.out.println("Уникальных чисел: " + count);
    }

}
