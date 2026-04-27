import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Replace 'd' with 'f'
        String newStr = str.replace('d', 'f');

        System.out.println("Modified string: " + newStr);

        sc.close();
    }
}
