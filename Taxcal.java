import java.util.Scanner;
class Taxcal{
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Max Length:");
        int length=sc.nextInt();
        int [] a= new int[length];
        System.out.print("Enter Tax Numbers:");
        for(int i=0;i<length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Total Tax:"+tax(length,a));

    }
    static int tax(int l,int [] a)
    {
        int sum=0;
        int diff=0;
        int key=a[0];
       
        for(int i=0;i<l;i++)
        {
         diff=a[i]-key;
        sum+=diff/10;

        }
        return sum;
    }
}