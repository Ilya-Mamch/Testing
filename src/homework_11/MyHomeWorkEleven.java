package homework_11;

public class MyHomeWorkEleven {
    public static void main(String[] args) {
        getCollection();
    }


    public static void getCollection(){
        Collection<Object> col = new Collection<>();

        col.add(111);
        col.add("Кот");
        col.add(121.2);

        System.out.println(col);

        System.out.println("Есть слово 'Кот'? " + col.contains("Кот"));
        System.out.println("Есть слово 'Собака'? " + col.contains("Собака"));

        System.out.println("Элемент под индексом 2: " + col.get(2));

        col.remove(2);
        System.out.println("Элементы после удаления: " + col);

        col.clear();
        System.out.println("Элементы после очистки: " + col);


        for(int i=0; i<9; i++) {
            col.add(i);
            }
        System.out.println(col);
    }
}
