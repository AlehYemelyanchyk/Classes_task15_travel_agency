package by.epam.ayem.module4.model;

/*5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
различного типа (отдых, экскурсии, лечение, шоппинг, круиз и т.д.) для оптимального выбора. Учитывать
возможность выбора транспорта, питания и числа дней.*/

import java.util.ArrayList;
import java.util.List;

public class Voucher {

    private Client client;
    private VoucherType voucherType;
    private TransportType transport;
    private int daysAmount;
    private List<String> meals = new ArrayList<>();

    public Voucher(String surname, int peopleAmount) {
        this.client = new Client(surname, peopleAmount);
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public VoucherType getVoucherType() {
        return voucherType;
    }

    public void setVoucherType(VoucherType voucherType) {
        this.voucherType = voucherType;
    }

    public TransportType getTransport() {
        return transport;
    }

    public void setTransport(TransportType transport) {
        this.transport = transport;
    }

    public List<String> getMeals() {
        return meals;
    }

    public void setMeals(List<String> meals) {
        this.meals = meals;
    }

    public int getDaysAmount() {
        return daysAmount;
    }

    public void setDaysAmount(int daysAmount) {
        this.daysAmount = daysAmount;
    }

    @Override
    public String toString() {
        return client + ". Voucher type: " + voucherType +
                ". Transport: " + transport +
                ". Days amount: " + daysAmount +
                ". " + meals.size() + " daily meals included: " + meals.toString() + ".";
    }
}
