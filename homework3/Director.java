package homework3;

public class Director extends Information {
    public Director(String name, int age) {
        super(name, age);
    }
    public void letTheLessonBegin() {
        System.out.println("Начало занятий");
    }
    public void letTheLessonEnd() {
        System.out.println("Конец занятий");
    }

    @Override
    public void setAge(int age) {
        if (age > 35) {
            super.setAge(age);
        }
    }

}
