package by.epam.ayem.module4.model;

/*5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
различного типа (отдых, экскурсии, лечение, шоппинг, круиз и т.д.) для оптимального выбора. Учитывать
возможность выбора транспорта, питания и числа дней.*/

public class Client {
    private final String surname;
    private int peopleAmount;

    public Client(String surname, int peopleAmount) {
        this.surname = surname;
        this.peopleAmount = peopleAmount;
    }

    public String getSurname() {
        return surname;
    }

    public int getPeopleAmount() {
        return peopleAmount;
    }

    public void setPeopleAmount(int peopleAmount) {
        this.peopleAmount = peopleAmount;
    }

    @Override
    public String toString() {
        return surname + ", " + peopleAmount;
    }
}
