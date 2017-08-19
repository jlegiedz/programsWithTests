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
        try {
            f.isFirst(numString);
        }
        catch(NumberFormatException ex){
            System.out.println("The entry is not a number.");
        }

    }

    public boolean isFirst(String num) {
        double doubleNum = Double.parseDouble(num);
        int number = (int)doubleNum;
        boolean isFirst;
        if(number == 0 || number == 1){
            System.out.println(number + " is not a prime number nor a composite number.");
            return false;
        }
        if(number > 1){
            int count = 0;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) count++;
            }
            if (count > 0) {
                System.out.println(number + " is not a prime number.");
                isFirst = false;
            } else {
                System.out.println(number + " is a prime number.");
                isFirst = true;
            }
        }
        else{
            System.out.println("The entry has to be a number larger than 1.");
            isFirst = false;
        }
        return isFirst;
    }

}
