package HW3.model;

public class User {

    private String firstName;
    private String lastName;
    private String MiddleName;
    private PhoneNum phone;

    public User(String fName, String lName, String mName, int num) {

        this.firstName = fName;
        this.lastName = lName;
        this.MiddleName = mName;
        this.phone = new PhoneNum(num);
        
    }

    @Override
    public String toString() {

        return String.format("<%s><%s><%s><%s>", this.firstName, this.lastName, this.MiddleName, this.phone.gNumber());

    }

    public String gFirstName() {

        return this.firstName;

    }

    public String gLastName() {

        return this.lastName;

    }

    public String gMiddName() {

        return this.MiddleName;

    }

    public int gPhone() {

        return this.phone.gNumber();

    }
    
    @Override
    public boolean equals(Object obj) {

        if(obj == null) {

            return false;

        }

        if(obj.getClass() == this.getClass()) {

            return this.lastName.equals(((User) (obj)).gLastName());

        }

        return false;

    }
    
    
}