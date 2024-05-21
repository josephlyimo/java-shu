import java.util.Scanner;

public class inputs {
    public static void main(String[] args) {
        int num;

        //for accepting intergers from the user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an interger value: ");
        num = sc.nextInt();

        System.out.println("\n You've entered " + num);
    }

}
