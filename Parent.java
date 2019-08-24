
public class Parent {

    // parent info
    private String pName;
    private String pNum;
    //private String pMail;

    public Parent(String name, String number) {
        pName = name;
        pNum = number;
        //pMail = email;
    }

    public String toString() {
        pName = pName.replaceAll("^\"|\"$", "");
        pNum = pNum.replaceAll("^\"|\"$", "");

        String string = pName + ", " + pNum;
        return string;
    }
}
