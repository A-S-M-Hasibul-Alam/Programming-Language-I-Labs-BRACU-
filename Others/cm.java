import java.util.Scanner;
public class cm{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[5];
    for(int c=0; c<a.length; c++){
      a[c] = sc.nextInt();
    }
    int back=a[0];
    for(int b=0; b<a.length; b++){
      back = a[b];
      for(int w=b+1; w<a.length; w++){
        if(a[w]<a[b]){
          a[b] = a[w];
          a[w] = back;
          back = a[w];
        }
      }
    }
    for(int r=0; r<a.length; r++){
      System.out.println(a[r]);
    }
  }
}
    
    
  
    