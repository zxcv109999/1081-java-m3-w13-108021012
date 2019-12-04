import java.util.Scanner;
public class M3Q8 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int v1=0;
        String str =scn.nextLine();
        String strArr[]=str.split("");
        for(int i=0;i<strArr.length;i++)
        {
            v1=Integer.parseInt(strArr[i]);
            System.out.println(v1*v1+"\t");
        }


    }
}