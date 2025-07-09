package homework_7;

public class MyHomeWorkSeven {
    public static void main(String[] args) {
        getPhone();
        getMessage();

    }

    public static void getPhone() {
        Phone phoneOne = new Phone(80294567836L, 8, 20);
        Phone phoneTwo = new Phone(80294567837L, 9, 18);
        Phone phoneThree = new Phone(80294567838L, 8, 20);
        Phone phoneFour = new Phone();
        Phone phoneFive = new Phone(80297891425L, 11);

        phoneOne.displayInfoPhone();
        phoneOne.receiveCall("Илья");
        System.out.println("Ваш номер телефона: " + phoneOne.getNumber());
        System.out.println(" ");

        phoneTwo.displayInfoPhone();
        phoneTwo.receiveCall("Жора");
        System.out.println("Ваш номер телефона: " + phoneTwo.getNumber());
        System.out.println(" ");

        phoneThree.displayInfoPhone();
        phoneThree.receiveCall("Гена", 80297894156L);
        System.out.println("Ваш номер телефона: " + phoneThree.getNumber());
        System.out.println(" ");
    }

    public static void getMessage(){
        Phone phoneTen = new Phone(80297893614L, 12, 140);
        phoneTen.sendMessage(80293697845L, 80337894102L, 80449514736L);
    }

}
