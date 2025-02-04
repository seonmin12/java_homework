package Homework0203.polymorphismEx1;

public abstract class Shape { //모델클래스
    protected double area;
    private String name;
    public Shape(){

    }

    public Shape(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public abstract void calculationArea();

    public void print(){
        System.out.printf("%s의 면적은 %f",name,area);
    }


    }


