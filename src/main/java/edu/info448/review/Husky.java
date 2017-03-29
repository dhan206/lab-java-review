package edu.info448.review;

public class Husky extends Dog implements Huggable {
    public Husky(String name) {
        super(name, "Husky");
    }

    public void pullSled() {
        System.out.println("Pulling a sled");
    }

    public void bark() {
        System.out.println("Woof from a Husky");
    }

    public void hug() {
        System.out.println("Hug from a Husky");
    }
}