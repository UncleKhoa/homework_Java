/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author khoan
 */
public class Students {
    private String ID;
    private String Name;
    private int Year;
    private String Address;
    private String gender;

    public Students(String ID, String Name, int Year, String Address, String Gender) {
        this.ID = ID;
        this.Name = Name;
        this.Year = Year;
        this.Address = Address;
        this.gender = Gender;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public int getYear() {
        return Year;
    }

    public String getAddress() {
        return Address;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
}
