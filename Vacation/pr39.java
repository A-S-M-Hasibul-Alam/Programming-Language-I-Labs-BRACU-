import java.util.Scanner;
public class pr39{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array length");
    int n = sc.nextInt();
    int a[] = new int[n];
    System.out.println("Enter numbers");
    for(int i=0; i<a.length; i++){
      a[i] = sc.nextInt();
    }
    for(int j=0; j<a.length; j++){
      int min = a[j];
      int minl = j;
      for(int k=j+1; k<a.length; k++){
        if(a[k]<min){
          min = a[k];
          minl = k;
        }
      }
      int temp = a[j];
      a[j] = min;
      a[minl] = temp;
    }
    if(n%2==1){
      int med = n/2;
      System.out.println("Median is "+a[med]);
    }
    else{
      int q = n/2;
      System.out.println("Median is "+((a[q]+a[q-1])/2));
    }
  }
}