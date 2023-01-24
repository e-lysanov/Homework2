public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
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
    public static void task4 () {
        System.out.println("Задача 4");
        // Пишем код для задачи 4
        var friend = 19.0;
        System.out.println(friend);
        friend = friend + 2.0;
        System.out.println(friend);
        friend = friend / 7.0;
        System.out.println(friend);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        // Пишем код для задачи 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10.0;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4.0;
        System.out.println(frog);
    }
    public static void task6 () {
        System.out.println("Задача 6");
        // Пишем код для задачи 6
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var generalWeight = firstBoxer + secondBoxer;
        System.out.println("Общий вес спортсменов " + generalWeight + " кг");
        var weightDifference = secondBoxer - firstBoxer;
        System.out.println("Весовая разница спортсменов " + weightDifference + " кг");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        // Пишем код для задачи 7
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        // метод вычитания
        var weightDifference = secondBoxer - firstBoxer;
        System.out.println("Весовая разница спортсменов " + weightDifference + " кг");
        //метод остаточного деления
        var weightDifferenceSecondWay = secondBoxer % firstBoxer;
        System.out.println("Весовая разница спортсменов " + weightDifferenceSecondWay + " кг");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        // Пишем код для задачи 8
        var generalWorkHours = 640.0;
        var individualWorkHours = 8.0;
        var staff = generalWorkHours / individualWorkHours;
        System.out.println("Всего работников в компании — " + staff + " человек");
        //увеличили штат на 94 сотрудника:
        var newStaff = staff + 94;
        var newGeneralHours = individualWorkHours * newStaff;
        System.out.println("Если в компании работает " + newStaff + " человек, то всего " + newGeneralHours + " часов работы может быть поделено между сотрудниками");
    }
}
