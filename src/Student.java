public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) throws MyException {
        this.name = name;
        this.age = age;
        if(age<0){
            throw new MyException("возраст меньше нуля!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws MyException {
        this.name = name;
        if(age<0) {
            throw new MyException("возраст меньше нуля!");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
