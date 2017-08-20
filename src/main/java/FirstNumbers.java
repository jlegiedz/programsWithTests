import java.util.Optional;
import java.util.Scanner;

/**
 * Created by asia on 19/08/17.
 */
public class FirstNumbers {

    public static void main(String[] args) {
        System.out.println("Enter an integer grater than 1:");
        Scanner scanner = new Scanner(System.in);
        FirstNumbers f = new FirstNumbers();
        String numString = scanner.nextLine();
        Optional<Boolean> first = f.isFirst(numString);
        first.isPresent();
    }

    public Optional<Boolean> isFirst(String num) {
        double doubleNum;
        if ((num == null) || (num.isEmpty())) {
            return Optional.empty();
        }
        boolean isOk;
        try {
            doubleNum = Double.parseDouble(num);
            int number = (int) doubleNum;
            if (number == 0 || number == 1) {
                System.out.println(number + " is not a prime number nor a composite number.");
                isOk = false;
            }

            if (number > 1) {
                int count = 0;
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) count++;
                }
                if (count > 0) {
                    System.out.println(number + " is not a prime number.");
                    isOk = false;
                } else {
                    System.out.println(number + " is a prime number.");
                    isOk = true;
                }
            } else {
                System.out.println("The entry has to be a number larger than 1.");
                isOk = false;
            }
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
            return Optional.empty();
        }
        return Optional.of(isOk);
    }

}
