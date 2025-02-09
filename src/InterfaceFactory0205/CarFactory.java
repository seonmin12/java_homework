package InterfaceFactory0205;

public class CarFactory extends Factory implements IWorkingTogether {

    CarFactory(String name, int openHour, int closeHour){
        super(name, openHour, closeHour);
    }

    //skill이 ’A’인 경우 3, ’B’인 경우 2, ’C’인 경우 1,
    //그 외는 0으로 간주하여 실제 공장운행시간과 곱한 값을 결과로 리턴
    @Override
    int makeProducts(char skill) {
        switch(skill){
            case 'A': return 3 * getWorkingTime();
            case 'B' : return 2 * getWorkingTime();
            case 'c' : return 1 * getWorkingTime();
            default: return 0;
        }

    }

    //파트너 공장의 기술력 ’B’에 대한 하루 생산량을 리턴
    @Override
    public int workTogether(IWorkingTogether partner) {
        // 파트너는 IWorkingtogether 자료형 makeProducts는 carFactory, TVFactory에도 있음

        if (partner instanceof TVFactory B) {
            return B.makeProducts('B');
        }
        if (partner instanceof CarFactory A) {
            return A.makeProducts('B');
        } else {
            return 0;
        }
    }
}
