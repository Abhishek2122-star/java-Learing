// abstract  class Animal {
//     public abstract void animalsound();
//     public void sleep(){
//         System.out.println("zzz");
//     }
    
// }
// class dog extends Animal{
//     public void animalsound(){
//         System.out.println("bow bow");
//     }
// }
// class main{
//     public static void main(String[] args) {
//         dog myDog = new dog();
//         myDog.animalsound();
//         myDog.sleep();
//     }
// }


// Abstract class
abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
}

class main {
  public static void main(String[] args) {
    Pig myPig = new Pig(); // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}
 
 
 

