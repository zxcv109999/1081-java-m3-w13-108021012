import java.util.Scanner;

public class M3Q1 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        char data[]=scn.nextLine().toCharArray();
        for (int i=data.length-1;i>=0;i--) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}