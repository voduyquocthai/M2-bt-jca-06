package Entities;

public class Engineer extends Officer{
    private String major;

    public Engineer() {
    }

    public Engineer(String name, String dateOfBirth, String gender, String address, int id, String major) {
        super(name, dateOfBirth, gender, address, id);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Engineer{" + super.toString() + ", " +
                "major='" + major + '\'' +
                '}';
    }
}
