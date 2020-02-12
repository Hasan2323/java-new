package samples;

public class Vehicles {

    private String name = "Sunny";

//    public Vehicles(){
//        this.setName("Ashik");
//    }

//    public Vehicles(String fname){
//        this.name = fname;
//    }

    public void start() {
        System.out.println("Vehicle starts!");
    }

//    public String getName() {
//        return name;
//    }

}//

class Cars extends Vehicles {
    @Override
    public void start() {
        //super.start();
        System.out.println("Car starts!");
    }
}
