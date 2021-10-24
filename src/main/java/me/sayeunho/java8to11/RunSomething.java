package me.sayeunho.java8to11;

@FunctionalInterface
public interface RunSomething {
//추상메서드가 하나만 있으면 그게 함수형 인터페이스임 (다른메서드는 여러개 정의 되어도 상관없다)
    abstract int doIt(int number);

   // void doItAgain();
    public static void printName() {
        System.out.printf("eunho");
    }
    default void printAge() {
        System.out.println("30");
    }

}
