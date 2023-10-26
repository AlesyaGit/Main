

import java.util.Scanner;


 class RectangleArea{

         int a;
         int b;
         int area;

         void getData(){

         Scanner scanner = new Scanner(System.in);

         System.out.println("Enter a:");

         a = scanner.nextInt();

         System.out.println("Enter b:");

         b = scanner.nextInt();

         }

         void computeField(){

          area = a * b;

         }

         void fieldDisplay(){

          System.out.println("A is " + a);
          System.out.println("B is " + b);
          System.out.println("Area is " + area);
         }

 }


         class Task{
          public static void main(String[] args) {

           RectangleArea ra = new RectangleArea();

           ra.getData();
           ra.computeField();
           ra.fieldDisplay();

          }
 }