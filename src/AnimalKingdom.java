public class AnimalKingdom {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, "Bark", "Meat", "Labrador");
        Cat cat = new Cat("Whiskers", 2, "Meow", "Fish", true);

        dog.newsound("Howl");
        dog.newfood("Bones");

        cat.newsound("Purr");
        cat.newfood("Milk");

        printAnimalInfo(dog);
        printAnimalInfo(cat);
    }

    public static void printAnimalInfo(Animal animal) {
        System.out.print(animal.name + ", " + animal.age + " years, Sounds: ");
        for (int i = 0; i < animal.soundCount; i++) {
            System.out.print(animal.sound[i] + " ");
        }
        System.out.print(", Eats: ");
        for (int i = 0; i < animal.eatCount; i++) {
            System.out.print(animal.eat[i] + " ");
        }
        System.out.println();
    }
}

class Animal {
    String name;
    int age;
    String[] sound;
    String[] eat;
    int soundCount = 1;
    int eatCount = 1;

    public Animal(String name, int age, String sound, String eat) {
        this.name = name;
        this.age = age;
        this.sound = new String[10];
        this.eat = new String[10];
        this.sound[0] = sound;
        this.eat[0] = eat;
    }

    public void newsound(String newSound) {
        if (soundCount < sound.length) {
            sound[soundCount] = newSound;
            soundCount++;
        }
    }

    public void newfood(String newFood) {
        if (eatCount < eat.length) {
            eat[eatCount] = newFood;
            eatCount++;
        }
    }
}

class Dog extends Animal {
    String breed;

    public Dog(String name, int age, String sound, String eat, String breed) {
        super(name, age, sound, eat);
        this.breed = breed;
    }
}

class Cat extends Animal {
    boolean hasfur;

    public Cat(String name, int age, String sound, String eat, boolean hasfur) {
        super(name, age, sound, eat);
        this.hasfur = hasfur;
    }
}
