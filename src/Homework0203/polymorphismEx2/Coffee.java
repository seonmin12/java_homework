package Homework0203.polymorphismEx2;

public class Coffee extends Beverage {
    public static int amount; //static 이라 리셋이 되지 않고 계속 저장

    public static int getAmount() {

        return amount;
    }

    public static void setAmount(int amount) {

        Coffee.amount = amount;
    }

    public Coffee(String name){
        super(name);
        amount++;
    }





    @Override
    public void calcPrice() {
        switch(getName()){
            case "Americano" : setPrice(1500);
            break;
            case "CafeLatte" : setPrice(2500);
            break;
            case "Cappuccino" :setPrice(3000);
            break;
            default: setPrice(0);

        }



    }
}
