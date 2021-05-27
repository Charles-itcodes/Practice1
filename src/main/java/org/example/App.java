package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Hello ");
        System.out.println("Charles");
        System.out.println("below is  my age,my first and lastName");
        int age =32;
        System.out.println(age);

        String firstName ="Charles";
        System.out.println(firstName);
        String lastName = "Rudahusha";

        // Summation of two variables with assigned values.
        System.out.println(lastName);
        int num1=10;
        int num2=5;
        int summ =num1+num2;
        System.out.println(summ);

        // Summation of two variables with decimal values.

        float balance1 =20.95F;
        float balance2= 79.05F;
        float result= balance1+balance2;
        System.out.println(result);

        Car car=new Car();
        car.carBrand="Nissan";

        System.out.println(car.carBrand);




    }
}
