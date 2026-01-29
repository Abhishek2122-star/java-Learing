class Animal{
    public void animalsound(){
        System.out.println("the animal makes sound");
    }
}

class Dog extends Animal{
    public void animalsound(){
        super.animalsound();
        System.out.println("dogs are sounding bow bow");
    }
}

public class inheritance{
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.animalsound();
    }
}