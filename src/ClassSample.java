public class ClassSample {

    public static void main(String[] args) {
        Animal cat = new Animal();
        Animal dog = new Animal();
        Animal horse = new Animal();

        cat.setName("boby");
        dog.setName("happy");

        System.out.println(cat.name);
        System.out.println(dog.name);
    }
}

class Animal {

    String name;

    public void setName(String name) {
        this.name = name;
    }
}
