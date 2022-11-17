public class Student{
    String name;
    int age;
    public Student(String s, int i) {
        this.name=s; this.age=i;
    }

    @Override
    public String toString() {
        return name + " ," + age;
    }

    public int compareTo(Student student) {
        return this.name.compareTo(student.name);
    }

}