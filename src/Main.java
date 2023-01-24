public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        //task4();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
        // написал иначе для разнообразия и проверки работоспособности
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        // Пишем код для задачи 3 (вычитаю из значений задачи 1)
        var dog = 8.0;
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        paper = paper - 7639;
        System.out.println(paper);
    }
}