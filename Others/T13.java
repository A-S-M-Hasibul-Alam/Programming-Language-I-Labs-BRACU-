import java.util.Scanner;
public class T13{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    System.out.println("Enter another number");
    int b = sc.nextInt();
    System.out.println("Enter another number");
    int c = sc.nextInt();
    System.out.println("Enter another number");
    int d = sc.nextInt();
    a = a+b+c+d;
    d = a-b-c-d;
    c = a-b-c-d;
    b = a-b-c-d;
    a = a-b-c-d;
    System.out.println(c);
    System.out.println(b);
    System.out.println(a);
    System.out.println(d);
  }
}