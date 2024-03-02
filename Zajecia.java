import java.util.Scanner;

class Zajecia {
    public static void main(String[] args) {
        exSix();
    }

    public static void exOne() {
        double a = 36.0;
        double b = 15.0;

        System.out.println("a+b = " + (a+b));
        System.out.println("a-b = " + (a-b));
        System.out.println("a*b = " + (a*b));
        System.out.println("a/b = " + (a/b));
    }

    public static void exTwo() {
        int[] array = {5, 7, 8, 11};
        double sum = (array[0]+array[1]+array[2]+array[3]);
        double average = sum / 4;

        System.out.println("średnia = " + average);
    }

    public static void exThree() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź liczbę:");
        double number = scan.nextDouble();

        String info;

        if(number%2 == 0)
            info = "parzysta";
        else
            info = "nieparzysta";

        System.out.println("Wprowadzona liczba jest: " + info);
    }

    public static void exFour() {
        double height;
        double weight;
        double bmi;

        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź wzrost (w metrach):");
        height = scan.nextDouble();
        System.out.println("Wprowadź wagę (w kilogramach):");
        weight = scan.nextDouble();

        bmi = weight / (height * height);

        System.out.println("BMI wynosi: " + bmi);
    }

    public static void exFive() {
        int[] marks = {5, 2, 4, 2, 2};
        double sum = (marks[0]+marks[1]+marks[2]+marks[3]+marks[4]);
        double average = sum / 5;

        String info;

        if(average > 4.5)
            info = "A";
        else if(average > 3.5)
            info = "B";
        else if(average > 2.5)
            info = "C";
        else
            info = "D";
        
        System.out.println("Średnia: " + average);
        System.out.println("Ocena końcowa: " + info);
    }

    public static void exSix() {
        String textA;
        String textB;

        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź słowo:");
        textA = scan.nextLine();
        char[] chars = textA.toCharArray();

        StringBuilder stringB = new StringBuilder("");

        int element;
        for(int i = chars.length; i > 0; i--) {
            element = i - 1;
            stringB.append(chars[element]);
        }

        textB = stringB.toString();

        String info;

        if(textA.equals(textB))
            info = "Podany wyraz jest palindronem.";
        else
            info = "Podany wyraz nie jest palindronem.";

        System.out.println(info);
    }
}
