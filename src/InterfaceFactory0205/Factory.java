package InterfaceFactory0205;

public abstract class Factory {
    private int openHour;
    private int closeHour;
    private String name;

    public int getCloseHour() {
        return closeHour;
    }

    public void setCloseHour(int closeHour) {
        this.closeHour = closeHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOpenHour() {
        return openHour;
    }

    public void setOpenHour(int openHour) {
        this.openHour = openHour;
    }

    Factory(){}

    Factory(String name, int openHour, int closeHour){
        this.name = name;
        this.openHour = openHour;
        this.closeHour = closeHour;
    }

    public String getFactoryName(){// 공장 이름을 리턴
        return name;

    }

    public int getWorkingTime(){// 실제 공장 운행 시간 리턴 closehour-openhour
        return closeHour-openHour;

    }

    abstract int makeProducts(char skill);



}
