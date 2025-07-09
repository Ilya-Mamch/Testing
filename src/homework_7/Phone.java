package homework_7;

public class Phone {
    private long number;
    private int model;
    private  int weight;

    public Phone (long number, int model, int weight){
        this.number=number;
        this.model=model;
        this.weight=weight;
    }

    public Phone (long number, int model){
        this.number=number;
        this.model=model;
        this.weight=0;
    }

    public Phone (){
        this.number= 0;
        this.model= 0;
        this.weight= 0;
    }



    public void displayInfoPhone(){
        System.out.println("Ваш номер: " + number);
        System.out.println("Модель телефона: " + model);
        System.out.println("Вес телефона: " + weight + " грамм");
    }

    public void receiveCall(String name){
        System.out.println("Звонит: " + name);

    }

    public long  getNumber(){
        return number;
    }

    public void receiveCall(String nameCall, long numberCall){
        System.out.println("Звонит: " + nameCall + ", Номер телефона: " + numberCall);
    }


    public void sendMessage(long... numbers){
        System.out.println("Сообщение отправлено на номера: ");
        for (long nums : numbers){
            System.out.println(nums);
        }
    }




}
