package HW3.model;

public class PhoneNum {

    private int number;

    public PhoneNum(int num) {

        this.number = num;

    }

    public int gNumber() {

        return this.number;

    }

    @Override
    public boolean equals(Object obj) {

        if(obj == null) {

            return false;

        }

        if(obj.getClass() == this.getClass()) {

            return this.number == ((PhoneNum) (obj)).gNumber();

        }

        return false;

        
    }
    
}
