package homework_8;

public class MyHomeWorkEight {
    public static void main(String[] args) {
        getFigure();
        employees();

    }

    public static void getFigure(){
        Figure[] figures = new Figure[5];
        figures[0] = new Triangle(11, 13, 14);
        figures[1] = new Rectangle(9, 5);
        figures[2] = new Circle(21);
        figures[3] = new Rectangle(24, 12);
        figures[4] = new Circle(12);


        double allPerimeter = 0;
        for (Figure i : figures) {
            allPerimeter += i.getPerimeter();
        }

        System.out.println("Сумма периметров всех фигур: " + allPerimeter);

    }

    public static void employees(){
        JobTitle director = new Director();
        JobTitle accountant = new Accountant();
        JobTitle worker = new Worker();


        director.printJobTitle();
        accountant.printJobTitle();
        worker.printJobTitle();
    }

}


