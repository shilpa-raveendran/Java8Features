package com.shilpa;

public class MethodReferenceDemo {
    public static void main(String[] args) {

        FunctionalInterfaceDemo fi = Test::testImplementation;
        fi.abstractMethod();

        //If no existing code is available then we can use below code
        // to give our own implementation for the abstarct method

//        FunctionalInterfaceDemo fi=() -> System.out.println("Implementation data");
//        fi.abstractMethod();
    }

    class Test{

        public static  void testImplementation(){
            System.out.println("Implementation of abstract methods");
        }
    }
}
