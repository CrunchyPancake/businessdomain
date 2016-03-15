package models;

public class Phone {
    private int number;
    private String type;

    public Phone(int number, String type) {
        this.number = number;
        this.type = type;
    }
    
    public Phone() {
        
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
