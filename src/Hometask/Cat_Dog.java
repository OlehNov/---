package Hometask;

public class Cat_Dog {
    public static void main(String[] args) {
        Dog.catchCat();
    }

    public static class Cat {
        private static String text = "Кошка поймана";
        public static void sayHello(){
            System.out.println("Мяу!");
        }
    }

    public static class Dog {
        public static void sayHello(){
            System.out.println("Гав!");
        }

        public static void catchCat(){
            System.out.println(Cat.text);
            Cat.sayHello();
            Dog.sayHello();

        }

    }
}
