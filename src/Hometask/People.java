package Hometask;

public class People {

    public static void main(String[] args) {
        Human person = new Human();
        person.emptyConstructor();
        person.firstHumanConstructor(10, "Olga", "Malinova", "Box" );
        person.secondHumanConstruction(20, "Max", "Pain" );
    }

    public static class Human{
        private int age;
        private String name;
        private String secondName;
        private String favoriteSport;

        public void emptyConstructor(){
        }

        public void firstHumanConstructor(int age, String name, String secondName, String favoriteSport){
            this.age = age;
            this.name = name;
            this.secondName = secondName;
            this.favoriteSport = favoriteSport;
            System.out.println(age +" "+ name +" "+ secondName +" "+ favoriteSport);
        }

        public void secondHumanConstruction(int age, String name, String secondName){
            this.age = age;
            this.name = name;
            this.secondName = secondName;
            System.out.println(age +" "+ name +" "+ secondName);
        }

    }

}





