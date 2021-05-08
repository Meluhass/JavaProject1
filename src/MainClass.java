import java.sql.SQLOutput;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        float a, b, c ;
        int cho;
        String type= null;
        Scanner s= new Scanner(System.in);
        do {



            System.out.println("Enter two variables");


            a = s.nextFloat();
            b = s.nextFloat();
            System.out.println(a + "," + b);
            System.out.println("1.add\n 2.sub\n 3.mul\n 4.div\n 5. exit");
            System.out.println("please select your operator");
            cho = s.nextInt();
            switch (cho) {
                case 1:
                    c = add(a, b);
                    System.out.println("your sum is " + c);
                    break;
                case 2:
                    c = sub(a, b);
                    System.out.println("your subtraction is " + c);
                    break;
                case 3:
                    c = mul(a, b);
                    System.out.println("your multiplication is " + c);
                    break;
                case 4:
                    c = div(a, b);

                    System.out.println("your division is " + c);
                    break;

                case 5:
                    type= "stop";
                    break;
            }
        }while (type != "stop");





    }

    private static float div(float a, float b) {
        float c=0.0F;
        c= a/b;
        return c;
    }

    private static float mul(float a, float b) {
        float c=0.0F;
        c= a*b;
        return c;

    }

    private static float sub(float a, float b) {
        float c= 0.0F;
        c= a-b;
        return c;
    }

    private static float add(float a, float b) {
        float c = 0.0F;
        c = a + b;
        return c;
    }
}
