package mypack;

public class OuterClass {
    int x = 5000;

    class InnerClass {

        int y = 15;

        public int myInnerClassMethodCanAccessOuterClass(){
            return x;
        }

    }

    //static inner class. which means that you can access it without creating an object of the outer class:
    static class InnerClassTwo {
        int z = 40;
    }
}
