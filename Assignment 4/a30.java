import java.util.Scanner;
public class a30{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Ask for a range");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int prime=0;
    int perfect=0;
    for(int n=a; n<=b; n++){
      int div=0;
      int sum=0;
      for(int count=1; count<a; a++){
        if(a%count==0){
          div++;
          sum=sum+count;
        }
      }
      if(div==1){
        prime++;
      }
      if(sum==a){
        perfect++;
      }
    }
    System.out.println(prime);
    System.out.println(perfect);
  }
}