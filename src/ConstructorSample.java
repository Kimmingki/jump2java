public class ConstructorSample {

    public static void main(String[] args) {
        ConstructorHouseDog happy = new ConstructorHouseDog("happy");
        ConstructorHouseDog yorkshire = new ConstructorHouseDog(1);

        System.out.println(happy.name);
        System.out.println(yorkshire.name);
    }
}

class ConstructorAnimal {

    String name;

    void setName(String name) {
        this.name = name;
    }
}

class ConstructorDog extends ConstructorAnimal {

    void sleep() {
        System.out.println(this.name + " zzz");
    }
}

class ConstructorHouseDog extends ConstructorDog {
    public ConstructorHouseDog(String name) {
        this.setName(name);
    }

    public ConstructorHouseDog(int type) {
        if (type == 1) {
            this.setName("yorkshire");
        } else if (type == 2) {
            this.setName("bulldog");
        }
    }

    void sleep() {
        System.out.println(this.name + " zzz in house");
    }

    void sleep(int hour) {
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }
}