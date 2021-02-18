package Entities;

public class Worker extends Officer {
    private String _class;

    public Worker(String name, String dateOfBirth, String gender, String address, int id, String _class) {
        super(name, dateOfBirth, gender, address, id);
        this._class = _class;
    }

    public Worker(){}


    public String get_class() {
        return _class;
    }

    public void set_class(String _class) {
        this._class = _class;
    }

    @Override
    public String toString() {
        return "Worker{" + super.toString() + ", " +
                "_class='" + _class + '\'' +
                '}';
    }
}
