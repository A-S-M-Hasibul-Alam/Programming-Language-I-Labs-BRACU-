import java.util.Scanner;
public class lab11a4{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[5];
    for(int i=0; i<=a.length-1; i++){
      a[i] = sc.nextInt();
    }
    for(int j=0; j<a.length;j++){
      for(int k=j+1; k<a.length; k++){
        if(a[j]>a[k]){
          int temp = a[j];
          a[k] = a[j];
          a[k] = temp;
        }
      }
    }
      for(int w=0; w<=a.length-1; w++){
        System.out.println(a[w]);
      }
  }
}
    
    