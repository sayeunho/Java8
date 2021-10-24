package me.sayeunho.java8to11;

public class Foo {

    public static void main(String[] args) {

        /*
        RunSomething runSomething = new RunSomething() {
            @Override
            public void doIt() {

            }
        };*/

       /* RunSomething runSomething = () -> {
            System.out.println("hello");
        };
        runSomething.doIt();*/

        RunSomething runSomething = new RunSomething() {

            int baseNumber = 10;

            @Override
            public int doIt(int number) {
                baseNumber++;
                return number + baseNumber;
            }
        };

        //함수형프로그램을 안하더라도 람다표현식은 사용가능이다. 함수형 프로그램을 하려면 퓨어 함수라던가 불변성을 고려해야한다.
        

    }
}
