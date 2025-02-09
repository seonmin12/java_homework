package InterfaceFactory0205;

public class TVFactory extends Factory implements IWorkingTogether {
    TVFactory(String name, int openHour, int closeHour) {
        super(name, openHour, closeHour);

    }

    //skill이 ’A’인 경우 8, ’B’인 경우 5, ’C’인 경우 3,
    //그 외는 1로 간주하여 실제 공장운행시간과 곱한 값을 결과로 리턴
    @Override
    int makeProducts(char skill) {
        switch (skill) {
            case 'A':
                return 8 * getWorkingTime();
            case 'B':
                return 5 * getWorkingTime();
            case 'c':
                return 3 * getWorkingTime();
            default:
                return 0;
        }

    }

    @Override
    public int workTogether(IWorkingTogether partner) {

        if (partner instanceof TVFactory B) {
            return B.makeProducts('c');
        }if(partner instanceof CarFactory A) {
            return A.makeProducts('C');
        }else{
            return 0;
        }

    }
}

