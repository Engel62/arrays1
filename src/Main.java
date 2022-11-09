public class Main {
    public static void main(String[] args) {
        /// задание 1,2
        System.out.println("Задание 1,2");
        int [] integerArray = new int[3];
        integerArray[0] = 1;
        integerArray[1] = 2;
        integerArray[2] = 3;
        for (int i = 0; i < integerArray.length; i++)
            System.out.print(integerArray[i]+ ",");
        System.out.print("\n");

        double [] arrayOfFractionalNumbers = {1.57, 7.654, 9.986};
        for (int d = 0; d < arrayOfFractionalNumbers.length; d++)
            System.out.print(arrayOfFractionalNumbers[d]+ ",");
        System.out.print("\n");

        int [] arbitraryArray = {1, 2 ,3 ,4 ,5 ,6 ,7 ,8,};
        for (int f = 0; f < arbitraryArray.length; f++)
            System.out.print(arbitraryArray[f] + "," );
        System.out.print("\n");
        /// Задание 3
        System.out.println("Задание 3");
        for (int i = integerArray.length - 1; i >= 0; i--)
            System.out.print(integerArray[i]+ ",");
        System.out.print("\n");

        for (int d = arrayOfFractionalNumbers.length - 1; d >= 0; d--)
            System.out.print(arrayOfFractionalNumbers[d]+ ",");
        System.out.print("\n");

        for (int f = arbitraryArray.length - 1; f >= 0; f--)
            System.out.print(arbitraryArray[f] + "," );
        System.out.print("\n");
        /// Задание 4
        System.out.println("Задание 4");
            for (int i = 0; i < integerArray.length; i++){
                if (integerArray[i] % 2 != 0)
            integerArray[i] = integerArray[i] + 1;
                System.out.print(integerArray[i] + ",");
            }
    }
}



