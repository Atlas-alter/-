package world.demo;
import java.util.Scanner;
public class triangle {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt(),b= s.nextInt(),c= s.nextInt();
        if(a+b>c&&a-b<c) System.out.println("Yes!");
        else System.out.println("No!");
        s.close();
    }
}
