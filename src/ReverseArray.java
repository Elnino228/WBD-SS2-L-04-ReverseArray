import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size;
        do {
            System.out.println("Enter size: ");
            size=scanner.nextInt();
            if (size>20)
                System.out.println("Size should not exceed 20");
        }while (size>20);
        int[] array=new int[size];
        int i=0;
        while (i<array.length){
            System.out.println("Enter element "+(i+1)+" : ");
            array[i]=scanner.nextInt();
            i++;
        }
        System.out.println("Property list: ");
        for (int j=0;j<array.length;j++){
            System.out.println(array[j]+"\t");
        }
        //reverse array
        for (int j=0;j<array.length/2;j++){
            int temp=array[j];
            array[j]=array[size-1-j];
            array[size-1-j]=temp;
        }
        System.out.println("Array after be reversed: ");
        for (int j=0;j< array.length;j++){
            System.out.println(array[j]+"\t");
        }
    }
}
