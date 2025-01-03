import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Simple Calculator");

    System.out.println("Choose Your Operator");
    System.out.println("1.Addition \n2.Subtraction\n3.Multiplication\n4.Division");

    System.out.println("Enter Your Choice");
    int Choice= scanner.nextInt();

    System.out.println("Enter First Number");
    float First_Number = scanner.nextInt();

    System.out.println("Enter Second Number");
    float Second_Number = scanner.nextInt();
    
    float Result=0;
    switch(Choice){
      case 1:
          Result=First_Number+Second_Number;
          break;
      case 2:
          Result=First_Number-Second_Number;
          break;
      case 3:
          Result=First_Number*Second_Number;
          break;
      case 4:
          Result=First_Number/Second_Number;
          break;
          
    }

    System.out.println("Result: "+Result);


  }
}
