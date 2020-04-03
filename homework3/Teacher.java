package homework3;

public class Teacher extends Lesson implements CanTeach {
    public Teacher(String name, int age, String lessonTitle) {
         super(name, age, lessonTitle);
    }

    @Override
    public void setAge(int age) {
        if (age > 25) {
            super.setAge(age);
        }
    }

    @Override
    public void teach(CanLearn chield) {
        chield.learn();
    }
}
