package be.ucll.spring.domain;

public class Triangle {
    private String type;

/*
    private int height;
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
*/

    // need to have an empty Ctor for Spring to use!!!
    // since we use it in the first xml bean
    public Triangle() {}

    public Triangle(String type) {
        this.type = type;
    }

/*    public Triangle(int height) {
        this.height = height;
    }

    public Triangle(String type, int height) {
        this.type = type;
        this.height = height;
    }
*/

    public void draw(){
        System.out.println("Triangle drawn!");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
