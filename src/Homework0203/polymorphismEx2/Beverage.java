package Homework0203.polymorphismEx2;

public abstract class Beverage {
    private String name;
    protected int price; //가격이 바뀔 수 있어서 protected 로 접근하기 편하게 함



    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getPrice() {

        return price;
    }

    public void setPrice(int price) {

        this.price = price;
    }

    public Beverage(String name){

        this.name = name;
        calcPrice();
    }

    public abstract void calcPrice();

    public void print(int index){
        System.out.println(index + "번째 판매 음료는"+ " "+ name + "이며, 가격은" + price );

    }


}
