package mypack;

import samples.Vehicles;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

//import static sun.util.calendar.ZoneInfoFile.ZoneOffsetTransitionRule.isLeapYear;

public class myFirstJava {


    public static void main(String[] args) {

//        float floatNum = 5.99476f;
//        String fName = "Saimon ";
//        String lName = "Uddin";
//        String fullName = fName + " " + lName;
//        prln("Full Name: "+fullName);
//        float d1 = 59.87f;
//        int f1 = (int)d1;
//        prln(f1);
//        prln(d1);
//
//        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        prln("Length: "+txt.length());
//        prln("UpperCase: "+txt.toUpperCase());
//        prln("LowerCase: "+txt.toLowerCase());
//
//        String txt2 = "Please, Locate locate where \"locate\" occurs!";
//        prln("text 2: "+txt2);
//        prln("Locate starts at "+txt2.indexOf("locate")+" position!");
//
//        //concatenation
//        prln(fName.concat(lName));
//
//        //Math
//        prln("Max between 5 & 8: "+Math.max(5,8));
//        prln("Min between 5 & 8: "+Math.min(5,8));
//        prln("Square root of 64: "+Math.sqrt(64));
//        prln("Absolute value of -4.8: "+Math.abs(-4.8));
//
//        Student stObj = new Student(22, "Abid");
//        prln(stObj.fname);
//        stObj.study();
//        prln(stObj.age);
//
//        /*Scanner sc = new Scanner(System.in);
//        prln("Insert your name: ");
//        String userName = sc.nextLine();
//        prln("Input Username: "+userName);*/
//
//        //OuterClass & InnerClass
//        OuterClass myOut = new OuterClass();
//        OuterClass.InnerClass myIn = myOut.new InnerClass();
//        prln(myOut.x + myIn.y);
//        prln(myIn.myInnerClassMethodCanAccessOuterClass());
//
//        // you don't need to create an object of OuterClass cause this InnerClass is static.
//        OuterClass.InnerClassTwo myIn2 = new OuterClass.InnerClassTwo();
//        prln(" "+myIn2.z);
//
////        Scanner input = new Scanner(System.in);
////        String day = input.nextLine();
////
////        switch (day){
////            case "Saturday":
////                prln("1");
////                break;
////            case "Sunday":
////                prln("2");
////                break;
////            default:
////                prln("lol");
////        }
//
//
//        // ArrayList<>
//        ArrayList<String> cars = new ArrayList<String>();
//
//        cars.add("BMW");
//        cars.add("AUDI");
//        cars.add("Toyota");
//        cars.add("Mercedes");
//
//        prln(cars);
//
//        prln(cars.get(1));
//
//        cars.set(2,"Porshe");
//        prln(cars);
//        prln(cars.size());
//        Collections.sort(cars);
//        prln(cars);
//
//        cars.remove(3);
//        //cars.clear();
//        prln(cars);
//        prln(cars.size());
//
//        // HashMap
//        HashMap<Integer, String> student = new HashMap<Integer, String>();
//
//        student.put(1, "Misbah");
//        student.put(2, "Miraj");
//        student.put(3, "Minhaj");
//        student.put(4, "Abeer");
//
//        prln(student);
//
//        prln(student.get(2));
//        prln(student.keySet());
//        prln(student.values());
//
////        student.remove(3);
////        student.clear();
////        prln(student.values());
//
//        for (String name:student.values()){
//            prln(name);
//        }
//
//        for (int id:student.keySet()){
//            prln("Key: "+id+" and Value: "+student.get(id));
//        }
//
//        // try catch
//        try {
//            int[] myNumbers = {1, 2, 3};
//            System.out.println(myNumbers[10]);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        } finally {
//            prln("Try catch finished (from Finally)");
//        }
//
//        checkAge(27);
//
//        //File System
//
//        // File myFileObj = new File("/home/saimon/filename.txt");
//        File myFileObj = new File("filename.txt");
//        try {
//            if(myFileObj.createNewFile()){
//                prln("File created : "+myFileObj.getName()+" and Path: "+myFileObj.getAbsolutePath());
//            }else {
//                prln("File already exists! Path: "+myFileObj.getAbsolutePath());
//            }
//        } catch (IOException e){
//            prln("An error occurs!");
//            e.printStackTrace();
//        }
//
////        //file write
////        FileWriter myWritter = new FileWriter("filename.txt");
////        try {
////            myWritter.write("This is the first line that I write in this file. Chill bro!" +
////                    "This is the Second line that I write in this file. Chill bro!" +
////                    "This is the Third line that I write in this file. Chill bro!");
////            myWritter.close();
////            prln("Successfully wrote in the file!");
////        } catch (IOException e){
////            prln("An error occurs!");
////            e.printStackTrace();
////        }
//
//        //Read file
//        try {
//            Scanner myReader = new Scanner(myFileObj);
//            while (myReader.hasNextLine()){
//                String data = myReader.nextLine();
//                prln(data);
//            }
//        } catch (IOException e){
//            prln("An error occurs!");
//            e.printStackTrace();
//        }
//
//        // delete a file
//        myFileObj.delete();
//        prln(myFileObj.getName()+" is deleted! Lou Thela");
//
//        // delete a folder
//        File anotherFileObj = new File("/home/saimon/workspace/js");
//        if (anotherFileObj.delete()){
//            prln(anotherFileObj.getName()+" folder is deleted!");
//        }else {
//            prln(anotherFileObj.getName()+" folder failed to delete! or Folder doesn't exist");
//        }
//
//        String inflack = "     Welcome to Inflack. It's a family.      ";
//        char[] charArray = inflack.toCharArray();
//        for(char c:charArray){
//            pr(c);
//            if(c == 'k') break;
//        }
//
//        prln("\n"+inflack.trim());
//
//        double sal = 27.68;
//        prln(Math.floor(sal));
//        prln(Math.round(sal));
//
//        char[] helloArray = {'S','A','I','M','O','N'};
//        String helloStr = new String(helloArray);
//        prln(helloStr);
//
//        prln("-----------Data Time-----------");
//
//        LocalDate myDateObj = LocalDate.now();
//        prln(myDateObj);
//
//        LocalTime myTimeObj = LocalTime.now();
//        prln(myTimeObj);
//
//        LocalDateTime myDateTimeObj = LocalDateTime.now();
//        prln("Before formatting: "+myDateTimeObj);
//
//        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, dd MMM, yyyy HH:mm:ss a");
//        String formattedDateTime = myDateTimeObj.format(myFormatObj);
//        prln("After formatting: "+formattedDateTime);
//
//        prln("-----END------");
//
//        prln("-----------Data Time in java.util package-----------");
//
//        Date date = new Date();
//        prln(date);
//        prln(date.toString());
//
//        SimpleDateFormat dFormat = new SimpleDateFormat("E, dd MMM, yyyy 'at' hh:mm:ss a");
//        prln("\n"+dFormat.format(date));
//
//
//        prln("----------END----------");
//
//        Vehicles v = new Vehicles();
//        Vehicles v1 = new Vehicles();
//        //v.setName("Ashik Js");
//        //v.setName("Mishu");
//        //prln(v.getName());
//        //prln(v.getName());
//
//        char ch = 65;
//        char ch2 = 'A';
//        prln(ch+" "+ch2);
//        ch++;
//        ch2++;
//        prln(ch+" "+ch2);
//
//        int litX = 18_22_26_23_23;
//        prln("0"+litX);
//
//        double val1 = 3.0, val2 = 4.0;
//        double c = Math.pow(val1 * val1 + val2 * val2, 2);
//
//        prln(c);

        GregorianCalendar cal = new GregorianCalendar();
        prln(cal.isLeapYear(2019));




    } //end of main()

    static void checkAge(int age){
        if (age < 18){
            throw new ArithmeticException("Access denied - you are below 18! Grow up buddy!");
        }else {
            prln("Access granted!");
        }
    }

    static void prln(Object object){ System.out.println(object); }
    static void pr(Object object){ System.out.print(object); }
}
