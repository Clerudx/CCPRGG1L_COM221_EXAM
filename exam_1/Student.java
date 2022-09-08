public class Student {
    String surname;
    String firstName;
    String middleInitial;
    String dateOfBirth;
    int studentNumber;
    String studentEmailAddress;
    boolean iAmAwesome;

    public void sayMyStudentNumebr() {
        System.out.println("This is your student number: " + studentNumber);
    }

    public void sayMyEmailAddress() {
        System.out.println("This is your student email address: " + studentEmailAddress);
    }

    public void amIAwesome() {
        if (iAmAwesome) {
            System.out.println("YOU ARE VERY AWESOME!!!!");
        } else {
            System.out.println("You are lame, boooo!!!");
        }
    }

    public Student(String surn, String firstn, String middleI, int month, int date, int year, int studNum, String SEA, boolean iAA){
        surname = surn;
        firstName = firstn;
        middleInitial = middleI;
        dateOfBirth = String.valueOf(month) + "/" + String.valueOf(date) + "/" + String.valueOf(year);
        studentNumber = studNum;
        studentEmailAddress = SEA;
        iAmAwesome = iAA;
    }
}
