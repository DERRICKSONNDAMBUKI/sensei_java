import java.util.Scanner;
public class arithmetic{
    public static void main(String[] args){
        
        System.out.println("Enter value_1: ");
        Scanner a=new Scanner(System.in);
        int val1=a.nextInt();
        
        System.out.println("Enter value_2: ");
        Scanner b=new Scanner(System.in);
        int val2=b.nextInt();
        
        int add=val1+val2;
        float div=val1/val2;
        int rem=val1%val2;

        System.out.println("Sum="+add);
        System.out.println("Division="+div+"rem"+rem);
        System.out.println("max number="+(int)Math.max(val1,val2));
    }
}