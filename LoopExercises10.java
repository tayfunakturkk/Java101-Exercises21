package Loops.Exercises10;
import java.util.Scanner;
public class LoopExercises10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the n1 value:");
        int n1=input.nextInt();
        System.out.print("Enter the n2 value:");
        int n2=input.nextInt();
        int hightestValue,ebob=1,ekok=1;
        if(n1>n2){
            hightestValue=n1;
        }else{
            hightestValue=n2;
        }
        int i=1;
        while(i<=hightestValue){
            i++;
            if(n1%i==0 && n2%i==0){
                ebob=i;
            }
            
        }
        System.out.println("Ebob is:"+ebob);

        int j=1;
        while(j<=(n1*n2)){
            j++;
            if(j%n1==0 && j%n2==0){
             ekok=j;
             break;//If we don't write break it choose the greatest common multiple
            }
            
        }
        System.out.println("Ekok is:"+ekok);





    }
}
