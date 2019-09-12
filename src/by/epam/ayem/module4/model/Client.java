package by.epam.ayem.module4.model;

public class Client {
    private String surname;
    private int peopleAmount;

    public Client(String surname, int peopleAmount) {
        this.surname = surname;
        this.peopleAmount = peopleAmount;
    }

    @Override
    public String toString() {
        return surname + ", " + peopleAmount;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPeopleAmount() {
        return peopleAmount;
    }

    public void setPeopleAmount(int peopleAmount) {
        this.peopleAmount = peopleAmount;
    }
}
