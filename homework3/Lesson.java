package homework3;

public class Lesson extends Information {
    protected String lessonTitle;
    String [] lessons = {"математика", "физика", "химия","информатика"};

    public String getLessonTitle() {
        return lessonTitle;
    }

    public void setLessonTitle(String lessonTitle) {
        this.lessonTitle = lessons[(int)(Math.random()*4)];
    }


    public  Lesson(String name, int age, String lessonTitle) {
        super(name, age);
        setLessonTitle(lessonTitle);
    }
}
