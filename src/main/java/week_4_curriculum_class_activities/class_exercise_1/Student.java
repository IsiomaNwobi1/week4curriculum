package week_4_curriculum_class_activities.class_exercise_1;

public class Student {
    private int admissionNumber;
    private String firstName;
    private String lastName;
    private  String dateOfBirth;
    private String gender;
    private int age;

    //command n - constructor
    public Student(int admissionNumber, String firstName, String lastName, String dateOfBirth, String gender, int age) {
        this.admissionNumber = admissionNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.age = age;
    }

    //command n - getters
    public int getAdmissionNumber() {
        return admissionNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    //command n - toString
    @Override
    public String toString() {
        return "Student{" +
                "admissionNumber=" + admissionNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
