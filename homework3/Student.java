package homework3;

public class Student extends Lesson implements CanLearn {

    protected int knowelegeLvl;

    public Student(String name, int age, String lessonTitle, int knowelegeLvl) {
        super(name, age, lessonTitle);
        setKnowelegeLvl(knowelegeLvl);
    }


    public void setKnowelegeLvl(int knowelegeLvl) {
        if (knowelegeLvl >= 0)
            this.knowelegeLvl = knowelegeLvl;
    }


    @Override
    public void learn() {
        knowelegeLvl += 2;
    }
}



