import java.util.Scanner;

public class massiv {

    public static void print() {

        System.out.println("Enter number a  ");
//      Console input in1 from Scanner class
        Scanner in1 = new Scanner(System.in);
        float a = in1.nextFloat();

        System.out.println("Enter number b  ");
//      Console input in1 from Scanner class
        Scanner in2 = new Scanner(System.in);
        float b = in2.nextFloat();
        float c = a + b;
        System.out.println("Result is " + c);

//      call the next method with c variable
        cycle(c);
    }

    public static  void cycle(float c) {

        int i;
        int gg = (int) c;
        double sum = 0;
//      make array of gg-size
        double[] massiv = new double[gg];

//      Put gg elements to massiv. Each element is i*sin(i)
        for (i = 1; i < gg; i++) {
            massiv[i] = i * Math.sin(i);
//      show elements
            System.out.println("i = " + i + " value = " + massiv[i]);
//      Calculate summ of elements
            sum = sum + massiv[i];
        }
        System.out.println("Sum of massive elements is " + sum);

    }

    public static void main(String[] args) {
        print();
    }
}