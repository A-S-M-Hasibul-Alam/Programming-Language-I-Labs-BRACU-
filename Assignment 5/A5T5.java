//import java.util.Scanner;
public class A5T5{
  public static void main (String[] args){
    //Scanner sc=new Scanner(System.in);
    int [] marks = new int[]{50,30,20,10,40};
    int max=marks[1];
    int LargestLocation=1;
    for(int i=2;i<=4;i++){
      if(marks[i]>max){
        max=marks[i];
        LargestLocation=i;
      }
    }
    int backup=marks[1];
    marks[1]=max;
    marks[LargestLocation]=backup;
    for(int i =0;i<marks.length;i++){
      System.out.print(marks[i]+", ");
    }
  }
}
