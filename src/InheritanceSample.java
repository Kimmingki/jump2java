public class InheritanceSample {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("poppy");
        System.out.println(dog.name);
        dog.sleep();

        HouseDog houseDog = new HouseDog();
        houseDog.setName("happy");
        houseDog.sleep();
        houseDog.sleep(3);
    }
}

class InheritanceAnimal {

    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog extends InheritanceAnimal {  // Animal 클래스를 상혹한다.

    void sleep() {
        System.out.println(this.name + " zzz");
    }
}

class HouseDog extends Dog {

    void sleep() {
        System.out.println(this.name + " zzz in house");
    }

    void sleep(int hour) {
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }
}