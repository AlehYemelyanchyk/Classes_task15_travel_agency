package by.epam.ayem.module4.service;

/*5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
различного типа (отдых, экскурсии, лечение, шоппинг, круиз и т.д.) для оптимального выбора. Учитывать
возможность выбора транспорта, питания и числа дней.*/

import by.epam.ayem.module4.model.*;

public class TravelAgencyService {

    public Voucher createVoucherForClient(String surname, int peopleAmount) {
        return new Voucher(surname, peopleAmount);
    }

    public void chooseVoucherType(Voucher voucher, VoucherType voucherType) {
        voucher.setVoucherType(voucherType);
    }

    public void chooseTransport(Voucher voucher, TransportType transportType) {
        voucher.setTransport(transportType);
    }

    public void addMeals(Voucher voucher, MealsType mealsType) {
        voucher.getMeals().add(String.valueOf(mealsType));
    }

    public void chooseAmountOfDays(Voucher voucher, int days) {
        voucher.setDaysAmount(days);
    }

    public void printVoucher(Voucher voucher) {
        System.out.println(voucher);
    }
}
