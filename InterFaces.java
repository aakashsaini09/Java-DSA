interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound(){
        System.out.println("Dog says: Woof!");
    }
}

class Cat implements Animal{
    public void sound(){
        System.out.println("Cat says: meow!");
    }
}
class Cow implements Animal{
    public void sound(){
        System.out.println("Cat says: MOo!");
    }
}


public class InterFaces {
    public static void main(String[] args) {
        Animal[] animals = { new Dog(), new Cat(), new Cow()};
        for(Animal a: animals){
            a.sound();
        }
    }
}
