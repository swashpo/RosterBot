
import java.io.*;
import java.util.*;
import java.nio.file.*;


public class creator {
    public static void main(String[] args) throws IOException {

//        Scanner sc = new Scanner(System.in);
//
//
//        String overall = sc.nextLine();
//        String summer = sc.nextLine();
//
//        Scanner scanner = new Scanner(Paths.get(overall));
//        Scanner scanner2 = new Scanner(Paths.get(summer));


        // need to take in any file in certain command format

        Scanner scanner = new Scanner("overall.txt");
        Scanner scanner2 = new Scanner("summer.txt");

        String studentInfo; // entire line of info
        String scanner2Info; // line of info for scanner 2

        String student; // student name

        String[] info; // array of all student info
        String[] infoAdv; // more complex info

        boolean isFound = false; // has student been found in overall list?

        Queue<Student> enrollment = new LinkedList<Student>();

        while (scanner2.hasNext()) {
            studentInfo = scanner2.nextLine();
            student = studentInfo.substring(1,studentInfo.indexOf("\""));

            info = studentInfo.split(",");

            while (!isFound) {
                scanner2Info = scanner.nextLine();
                if (scanner2Info.contains(student)) {
                    infoAdv = scanner2Info.split(",");


                    // make student and parent object
                    // add student object to queue
                    // set isFound to true

                    Parent newParent = new Parent(infoAdv[20], infoAdv[21]);

                    Student newStudent = new Student(info[0], info[1], info[7], info[3], info[5], newParent);

                    enrollment.add(newStudent);

                    isFound = true;



                }
//                else {
//                    // delete line
//                }
            }
        }




        FileOutputStream out = new FileOutputStream("C://Users//comma//Desktop//new.txt");


        for (Student person : enrollment) {
            out.write(person.toString().getBytes());
        }

        out.close();
    }
}

