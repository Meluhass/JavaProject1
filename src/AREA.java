import java.util.Scanner;

public class AREA {

    public static void main(String[] args) {
        int area,length,breadth,radius ;
        int choice;
        String type= null;
        Scanner s= new Scanner(System.in);
        do {

            System.out.println(" 1.square\n 2.rectangle\n 3.circle\n 5. exit");
            System.out.println("please select your desired shape");
            choice = s.nextInt();

           breadth = s.nextInt();
            length = s.nextInt();
           radius = s.nextInt();


            switch (choice) {
                case 1:
                    area = square(length);
                    System.out.println("your area of square is " + area);
                    break;
                case 2:
                    area = rectangle(length,breadth);
                    System.out.println("your area of rectangle is " + area);
                    break;
                case 3:
                    area = circle(radius);
                    System.out.println("your area of circle is " + area);
                    break;


                case 5:
                    type= "stop";
                    break;
            }
        }while (type != "stop");





    }

    private static int circle(int radius) {
        int area= 0;
        area=22/7*(radius*radius);
        return area;
    }

    private static int rectangle(int length, int breadth) {
        int area= 0;
        area= length*breadth;
        return area;

    }


    private static int square (int length) {
        int area=01;
        area= length*length*length*length;
        return area;
    }


}

