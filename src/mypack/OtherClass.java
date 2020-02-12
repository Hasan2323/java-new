package mypack;
import static mypack.myFirstJava.prln;

public class OtherClass {

    int id;
    private String name = "Abid";

    public OtherClass(int n, String name){
        this.id = n;
        this.name = name;
    }

    public void getName(){

        prln(this.name);
    }


}
