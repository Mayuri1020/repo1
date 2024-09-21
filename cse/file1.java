import java.util.Scanner;
class Test{
  public static void main(String args[]){
      int n;
      int count=0;
      Scanner sc=new Scanner(System.in);
      System.out.print("enter the number of rows...");
      n=sc.nextInt();
      for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
        for(int k=0;k<2*i+1;k++){
            count++;
            System.out.print(count);
         }
        System.out.println("");
      }
   }
}