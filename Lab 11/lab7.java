import java.util.Scanner;
public class lab7{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a[]=new int[10];
    System.out.println("Enter numbers");
    for(int i=0; i<a.length; i++){
      a[i]=sc.nextInt();
    }
    for(int j=0; j<a.length; j+=2){
      if(j==a.length-1){
        System.out.print(a[j]+".");
      }
      else{
        System.out.print(a[j]+", ");
      }
    }
    for(int k=1; k<a.length; k+=2){
      if(k==a.length-1){
        System.out.print(a[k]+".");
      }
      else{
        System.out.print(a[k]+", ");
      }
    }
  }
}
