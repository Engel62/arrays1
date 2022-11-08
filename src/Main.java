public class Main {
    public static void main(String[] args) {
        /// задание 1,2
        System.out.println("Задание 1,2");
        int [] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i]+ ",");
        System.out.print("\n");

        double [] b = {1.57, 7.654, 9.986};
        for (int d = 0; d < b.length; d++)
            System.out.print(b[d]+ ",");
        System.out.print("\n");

        int [] c = {1, 2 ,3 ,4 ,5 ,6 ,7 ,8,};
        for (int f = 0; f < c.length; f++)
            System.out.print(c[f] + "," );
        System.out.print("\n");
        /// Задание 3
        System.out.println("Задание 3");
        for (int i = a.length - 1; i >= 0; i--)
            System.out.print(a[i]+ ",");
        System.out.print("\n");

        for (int d = b.length - 1; d >= 0; d--)
            System.out.print(b[d]+ ",");
        System.out.print("\n");

        for (int f = c.length - 1; f >= 0; f--)
            System.out.print(c[f] + "," );
        System.out.print("\n");
        /// Задание 4
        System.out.println("Задание 4");





    }
    }
