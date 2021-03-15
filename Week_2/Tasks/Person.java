/**
 * Person
 */
package Week_2.Tasks;

public class Person {

    private String fName, lName, stuStatus;
    private int stuId, age;

    public Person(String fName, String lName, String stuStatus, int stuId) {
        this.fName = fName;
        this.lName = lName;
        this.stuStatus = stuStatus;
        this.stuId = stuId;
    }

    public Person(String fName, int age) {
        this.fName = fName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return fName;
    }

    public static void main(String[] args) {
        Person person = new Person("Lisa", "Palombo", "Active", 123456789);

        System.out.println("Student Name    : " + person.fName + " " + person.lName);
        System.out.println("Student ID      : " + person.stuId);
        System.out.println("Student Status  : " + person.stuStatus);
    }
}