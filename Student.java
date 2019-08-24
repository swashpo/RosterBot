


public class Student {



    // student info
    private String sName;
    private String school;
    private String sID;
    private String sGrade;
    private String language;
    private Parent par;

    public Student(String name, String id, String scho, String grade, String ELD, Parent parent) {
        sName = name;
        school = scho;
        sID = id;
        sGrade = grade;
        language = ELD;
        par = parent;
    }

    public String getName() {
        return sName;
    }

    public String getID() {
        return sID;
    }

    public String toString() {
        sName = sName.replaceAll("^\"|\"$", "");
        school = school.replaceAll("^\"|\"$", "");
        sID = sID.replaceAll("^\"|\"$", "");
        sGrade = sGrade.replaceAll("^\"|\"$", "");
        language = language.replaceAll("^\"|\"$", "");

        String string = sName + ", " + school + ", " + sID + ", " + sGrade + ", " + language + ", " + par.toString();
        return string;
    }

}
