import java.util.Scanner;

public class codesWithLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter an inter value: ");

        int num = sc.nextInt();

        while (num != 0) //check the condition for the lines from here until the condition become false the programs after that will be excuted
            num = sc.nextInt();
        System.out.println("\n program closed");
            
        
    }

}
