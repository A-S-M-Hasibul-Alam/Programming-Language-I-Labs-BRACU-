import java.util.Scanner;
public class T9{
  public static void main (String args[]){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter a number");
    double num1 = sc.nextDouble();
    System.out.println("Enter another number");
    double num2 = sc.nextDouble();
    System.out.println("Enter another number");
    double num3 = sc.nextDouble();
    if(num1>num2){
      if(num1>num3){
        System.out.println("num1 is the largest");
      }
      else{
        System.out.println("num3 is the largest");
      }
    }
      else{
        if(num2>num3){
          System.out.println("num2 is the largest");
        }
        else{
          System.out.println("num3 is the largest");
        }
      }
    } 
  }


