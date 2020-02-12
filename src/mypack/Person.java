package mypack;
import static mypack.myFirstJava.prln;

public abstract class Person {
    public String fname;
    protected int age;
    public abstract void study();
}

class Student extends Person{

    public Student(int age, String fname){
        this.fname = fname;
        this.age = age;
    }

    @Override
    public void study() {
        prln("From Study");
    }
}
