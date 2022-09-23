public class CatRunner {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Ben", 2, 6.5, "Black");
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Barnaby", 7, 4.0, "Brown");
        cat2.introduce();
        cat2.printCatInfo();

    }
}
