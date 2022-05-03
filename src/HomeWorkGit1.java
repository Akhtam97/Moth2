public class HomeWorkGit1 {
}

 class Student {
    String name;
    int age;
    int height;


    public static void main(String[] args) {
        Student studentOne = new Student();
        studentOne.name = "Володя";
        studentOne.age = 18;
        studentOne.height = 55;
        System.out.println("Первый Студент \nИмя " + studentOne.name + "\n" + "Возраст " + studentOne.age + "\n" + "Вес " + studentOne.height);
    }
}