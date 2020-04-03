package homework3;

public class Information {
    protected String name;
    protected int age;

    public void setName(String name) {
        if (name != null && name.length() >2)
        this.name = name;
    }

    public void setAge(int age) {
        if (age >10)
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Information(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
