package by.katyagolovko;

public class Dog {

    private String name;
    private int age;
    private String color;
    private boolean isBig;

    public Dog(String name, int age, String color, boolean isBig){
        this.name = name;
        this.age = age;
        this.color = color;
        this.isBig = isBig;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public boolean isBig() {
        return isBig;
    }

    public void bark(int number){
        for(int i = 0; i<number; i++){
            System.out.println(name + " is barking.");
        }
    }

    public void checkForMuzzle(){
        if(isBig){
            System.out.println("Please check you put a muzzle on your dog " + name + ".");
        }
        else {
            System.out.println("Your dog " + name + " can be without a muzzle.");
        }
    }

}
