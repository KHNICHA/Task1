import java.util.Scanner;

class RectangleArea{
    static float a;
    static float b;
    static float sum;
    static void getData(){
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter the length of the side a:\n");
        a = myObj.nextFloat();
        System.out.println("Enter the length of the side b:\n");
        b = myObj.nextFloat();
        computeField();

    }
    static float computeField(){
        sum = a*b;
        return sum;




    }
    static void fieldDisplay(){
        System.out.println("The RectangleArea of the Rectangle with side a "+a+" and side b "+b+" is : "+sum);


    }

}

public class Main {

    public static void main(String[] args) {
        RectangleArea ra = new RectangleArea();
        ra.getData();
        ra.computeField();
        ra.fieldDisplay();


    }
}