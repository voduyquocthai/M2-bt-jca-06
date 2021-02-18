package Entities;

public class Staff extends Officer{

    private String job;

    public Staff() {
    }

    public Staff(String name, String dateOfBirth, String gender, String address, int id, String job) {
        super(name, dateOfBirth, gender, address, id);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Staff{" + super.toString() + ", " +
                "job='" + job + '\'' +
                '}';
    }
}
