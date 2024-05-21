import java.util.Scanner;

public class add {

  public static void main(String[] args) {
    int num1,num2 ,result;

    Scanner sc = new Scanner(System.in);

    System.out.println("enter first Number: ");
    num1 = sc.nextInt();
    System.out.println("Enter seconds number: ");
    num2 = sc.nextInt();

    result = num1 + num2;

    System.out.println("the result is "+ add(num2, num1)); //calling the function
  }
  //creating the function for handling addition
  public static float add(float x, float y){
    return x+y;
  }
}

  