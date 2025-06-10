package Training_1;

public class Types {
    public static void main(String[] args){
        indicateSomething();



    }

    public static void indicateData(){
        byte age=23;
        short height=187; // Рост
        int year=2001;
        long favorite=1231321345235123L;
        char letter=65;
        letter=77;
        String name="Ilya";
        String city="Minsk";
        System.out.println("Hello! My name is " + name);
        System.out.println("I am from the city of " + city);
        System.out.println("I am " + age + " years old");
        System.out.println("My height " + height);
        System.out.println("I was born in " + year);
        System.out.println("My favorite number " + favorite);
        System.out.println("My favorite letter is " + letter);

    }

   public static void indicateSomething(){
        String myCat="Mars";
        int ageCate=1+2;
        byte numberOne=(byte) ageCate;
        System.out.println("My cat's name is " + myCat);
        System.out.println("He is " + numberOne + " years old");
   }

}
