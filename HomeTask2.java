package One;

import java.util.Scanner;

public class HomeTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите числовую последовательность: ");

            int sequence = scanner.nextInt();
            String s = Integer.toString(sequence);
            int[] arr = new int[s.length()];
            for (int i = s.length() - 1; i >= 0; i--) {
                arr[i] = sequence % 10;
                sequence /= 10;
            }
            boolean flag = true;

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] <= arr[i - 1])
                    flag = false;

            }
            if (flag == true)
                System.out.println("Последовательность является строго возрастающей");
            else   System.out.println("Последовательность не является строго возрастающей");

        }

    }
}




