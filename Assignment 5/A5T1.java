public class A5T1{
  public static void main (String[]args){
    int[] marks = new int[] {10, 30, 20, 50,40};
    int max=marks[0],min=marks[0];
    double sum=marks[0];
    for(int i=1;i<marks.length;i++){
      if(marks[i]>max){
        max=marks[i];
      }
      else{ 
        if(marks[i]<min){
          min=marks[i];
        }
      }
      sum+=marks[i];
    }
    double avrg=sum/5;
    System.out.println("Maximum number is "+max);
    System.out.println("Minimum number is "+min);
    System.out.println("Average is "+avrg);
  }
}