import java.util.Scanner;

public class Main {

    public static int lengthValid(String s) {
        int l;
        if (s == null) l = 0;
        else l = s.length();
        return l;
    }

    public static int longestChain(String checkedString) {
        if (lengthValid(checkedString) == 0)return 0;
        int count = 1;
        int temp = 1;
        for (int i = 0; i < checkedString.length() - 1; i++) {
            if (checkedString.charAt(i) == checkedString.charAt(i + 1)){
                temp++;
            }
            else{
                temp = 1;
            }
            if (temp > count){
                count = temp;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Provide a string: ");
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        String ciag = scanner.nextLine();
        System.out.println("The length of given string's repeated chars in a row is: "+ longestChain(ciag));
    }

}
