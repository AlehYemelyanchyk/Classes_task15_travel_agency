package by.epam.ayem.module4;

/*5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
различного типа (отдых, экскурсии, лечение, шоппинг, круиз и т.д.) для оптимального выбора. Учитывать
возможность выбора транспорта, питания и числа дней.*/

public class TravelAgencyService {

    private Voucher voucher;

    public TravelAgencyService(Voucher voucher) {
        this.voucher = voucher;
    }

    public void chooseVoucherType(VoucherType voucherType) {
        voucher.setVoucherType(voucherType);
    }

    public void chooseTransport(TransportType transportType) {
        voucher.setTransport(transportType);
    }

    public void addMeals(MealsType mealsType) {
        voucher.getMeals().add(String.valueOf(mealsType));
    }

    public void chooseAmountOfDays(int days) {
        voucher.setDaysAmount(days);
    }

    public void printVoucher() {
        System.out.println(voucher.toString());
    }
}
