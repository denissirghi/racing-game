package org.example;


public class App 
{
     public static void main(String[] args)
     {
        Car carReference= new Car();
        carReference.name=" Ferrari";
        carReference.maxSpeed= 300;
        carReference.fuelLevel= 60;
        carReference.mileage= 12.5;
        carReference.doorCount=4;
        carReference.totalTraveledDistance=0;
        carReference.damaged=true;
        carReference.color="red";


         System.out.println("Properties of car " + carReference.name);
         System.out.println("Max speed:"+carReference.maxSpeed);
         System.out.println("Fuel lever:" + carReference.fuelLevel);
         System.out.println("Mileage: "+ carReference.mileage);
         System.out.println("Total Traveled Distance: "+ carReference.totalTraveledDistance);
         System.out.println("Damaged: "+ carReference.damaged);
         System.out.println("Color: "+ carReference.color);
         System.out.println("Door Count: "+ carReference.doorCount);

         Car car2= new Car();
         car2.name=" Renault";
         car2.maxSpeed= 250;
         car2.fuelLevel= 70;
         car2.mileage= 12.5;
         car2.doorCount=4;
         car2.totalTraveledDistance=100;


         System.out.println("Properties of car " + car2.name);
         System.out.println("Max speed:"+car2.maxSpeed);
         System.out.println("Fuel lever:" + car2.fuelLevel);
         System.out.println("Mileage: "+ car2.mileage);
         System.out.println("Total Traveled Distance: "+ car2.totalTraveledDistance);
         System.out.println("Damaged: "+ car2.damaged);
         System.out.println("Color: "+ car2.color);
         System.out.println("Door Count: "+ car2.doorCount);

         System.out.println("Initial name of car "+ carReference.name);
         carReference.name= "Audi";
         System.out.println("Changed name of car "+ carReference.name);

         carReference = new Car();
         System.out.println("Name of new car: " + carReference.name);
         carReference.name="BMW";

     }
}
