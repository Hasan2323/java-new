package mypack;

import static mypack.myFirstJava.prln;

enum Animal {
    CAT,
    DOG,
    COW

}//end of Animal

class combined {
    public static void main(String[] args){

        Animal a = Animal.CAT;
        switch (a){
            case CAT:
                prln("Meow");
                break;
            case DOG:
                prln("Ghew");
                break;
            case COW:
                prln("Hamba");
                break;
            default:
                prln("No item found!");
        }

    }


}
