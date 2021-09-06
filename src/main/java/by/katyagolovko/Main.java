package by.katyagolovko;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Tim", 4, "orange", true);
        Dog dog2 = new Dog("Miya", 2, "white", false);
        Dog dog3 = new Dog("Dari", 6, "grey", true);

        dog1.bark(1);
        dog1.checkForMuzzle();
        dog2.bark(2);
        dog2.checkForMuzzle();
        System.out.println("Color of " + dog3.getName() + " is " + dog3.getColor() + ".");
        dog3.bark(1);

        Dog[] allDogs = {dog1, dog2, dog3};
        for (Dog dog : allDogs) {
            String size;
            if(dog.isBig()){
                size = "big";
            }
            else {
                size = "small";
            }
            System.out.println("Dog name is " + dog.getName() + ", color is " + dog.getColor() + ", age is " + dog.getAge() + " and Dog is " + size + ".");
        }
    }
}
