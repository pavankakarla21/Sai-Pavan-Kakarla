
import java.util.*;
public class Main{
    static int minDiff(int array[], int N, int M)
    {
        int output = Integer.MAX_VALUE;
        for (int i=0; i<= N-M;i++)
            output = Math.min(output, array[i + M - 1] - array[i]);
        return output;
    }
    static int findelements(int res,int array[], int N, int M)
    {
        int result = Integer.MAX_VALUE;
        for(int i=0; i<=N; i++)
        {
            result = Math.min(result, array[i + M - 1] - array[i]);
            if (res==result)
                return i;
        }
        return 0;
    }
    public static void main(String[] args) {
        int array[]={999,2195,2799,4999,7980,9800,9999,11101,22349,229900};
        String items[]={ "MI Band: 999","Sandwich Toaster: 2195" ,"Cult Pass: 2799","Scale: 4999","Fitbit Plus: 7980","Microwave Oven: 9800"  ,"Alexa: 9999","Digital Camera: 11101", "IPods: 22349","Macbook Pro: 229900" };
        Scanner s = new Scanner(System.in);
        int N = array.length;
        System.out.println("Enter the number of employees:");
        int M=s.nextInt();
        int result=minDiff(array, N, M);
        int output=findelements(result,array,N,M);
        System.out.println("Here the goodies that are selected for distribution are:");
        for(int i=output;i<output+M;i++)
            System.out.println(items[i]);
        System.out.println("\n");
        System.out.println("And the difference between the chosen goodies with highest price and the lowest price is:"+result);
    }
}