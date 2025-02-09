package inheritancePractice.Ex2;

public class SoundableExample {

    public static void printSound(Soundable soundable){
        System.out.println(soundable.sound()); // 야옹 혹은 멍멍

    }

    public static void main(String[] args) {
        printSound(new Cat()); //야옹
        printSound(new Dog()); //멍멍
    }
}
