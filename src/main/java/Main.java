public class Main {
    public static void main(String[] args) {
        MyPerson man = new MyPerson("George");
        MyDog dog = new MyDog("Alex", 2);
        System.out.printf("Человек - > %s, ", man.getName());
        System.out.printf("Собака -> %s\n", dog.getName());
        System.out.println(man);
        System.out.println(dog);
        man.call(dog);
        dog.goRoom(MyHouse.balcony);
        man.call(dog);
        System.out.println(dog);
        dog.goRoom(MyHouse.kitchen);
        System.out.println(dog);
        man.feed(dog);
        man.goRoom(MyHouse.kitchen);
        man.feed(dog);
        man.feed(dog);
        System.out.printf("\n%s и %s - Рады быть вместе ", man.getName(), dog.getName());

    }
}