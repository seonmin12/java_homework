package inheritancePractice.Ex1;

public class TV implements Remocon {
    @Override
    public void powerOn() {
        System.out.println("TV를 켰습니다.");
    }

    public static void main(String[] args) {
        Remocon r = new TV(); // Remocon 인터페이스 변수인 r에 TV 객체를 연결
        r.powerOn();
    }
}
