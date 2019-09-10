package by.epam.ayem.module4;

/*5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
различного типа (отдых, экскурсии, лечение, шоппинг, круиз и т.д.) для оптимального выбора. Учитывать
возможность выбора транспорта, питания и числа дней.*/

public class AppRunner {

    public static void main(String[] args) {
        Voucher pietrovy = new Voucher();
        TravelAgencyService travelAgencyPietrovy = new TravelAgencyService(pietrovy);
        travelAgencyPietrovy.chooseVoucherType(VoucherType.CRUISE);
        travelAgencyPietrovy.chooseTransport(TransportType.SHIP);
        travelAgencyPietrovy.addMeals(MealsType.BREAKFAST);
        travelAgencyPietrovy.addMeals(MealsType.DINNER);
        travelAgencyPietrovy.chooseAmountOfDays(15);
        travelAgencyPietrovy.printVoucher();


    }
}
