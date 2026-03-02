package com.maven;
    class Vehicle{
      void start() {
        System.out.println("vechile is running");
      }
      }
    class Car extends Vehicle {
        void fuelType() {
            System.out.println("Car uses fuel or electricity");
        }
    }
    class ElectricCar extends Car {
        void batteryStatus() {
            System.out.println("Electric car battery is fully charged");
        }
    }
    public class multilevel {
        public static void main(String[] args) {
            ElectricCar ec = new ElectricCar();
            ec.start();          
            ec.fuelType();       
            ec.batteryStatus();  
        }
    }