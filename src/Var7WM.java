import java.util.Scanner;
import java.util.*;
public class Var7WM{
    public static byte[]Input() throws InputMismatchException,ArrayIndexOutOfBoundsException
    {
        int n;
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите размер массива");
        n=scan.nextInt();
        byte []a=new byte[n];
        System.out.println("Введите элементы массива");
        for(int i=0;i<n;i++)
        {
            System.out.print("A["+(i+1)+"]=");
            a[i]=scan.nextByte();
        }
        return a;
    }
    public static void maxIndex(byte[]a) throws ArrayIndexOutOfBoundsException,Exception
    {
        byte max=-1;
        int nom=-1;
        for(int i=0;i<a.length;i++)
            if(a[i]>0 && a[i]>max )
            {
                max=a[i];
                nom=i;
            }
        if(max==-1)
            throw new Exception ();
        System.out.println("Максимальный элемент массива: "+max);
        System.out.println("Номер Максимального элемента массива: "+(nom+1));
    }
    public static void main(String[] args)
    {
        try
        {

            byte []a=Input();
            maxIndex(a);
        }
        catch(InputMismatchException e)
        {
            System.out.println("Введено некорректное число");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Индекс находитсявне границ массива");
        }
        catch(Exception e)
        {
            System.out.println("В массиве нет положительных элементов");
        }

    }
}
