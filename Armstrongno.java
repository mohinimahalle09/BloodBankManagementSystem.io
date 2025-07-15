import java.util.*;

public class Armstrongno {

    public static void main(String[] args) {
    	System.out.println("Mohini Mahalle");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s=0;
        int count =0;
        int temp1 = n;
        while(n!=0)
        {
            count++;
            n = n/10;
        }
        int temp2 =temp1;
        while(temp1!=0)
        {
            int d = temp1%10;
             s = s + (int)Math.pow(d, count);
            temp1 = temp1/10;
        }
        if(s==temp2)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}