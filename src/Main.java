import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слова одной строкой через пробел");

        int count = 0;
        String input = scanner.nextLine();

        if(input.length() != 0)
            count++;
            for (int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == ' '){
                    count++;
                }
            }
        System.out.println("Колличество слов в предлжений: " + count);
    }
}
