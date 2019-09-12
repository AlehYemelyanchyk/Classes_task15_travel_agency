package by.epam.ayem.module4;

/*5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
различного типа (отдых, экскурсии, лечение, шоппинг, круиз и т.д.) для оптимального выбора. Учитывать
возможность выбора транспорта, питания и числа дней.*/

import by.epam.ayem.module4.service.TravelAgencyService;
import by.epam.ayem.module4.model.MealsType;
import by.epam.ayem.module4.model.TransportType;
import by.epam.ayem.module4.model.Voucher;
import by.epam.ayem.module4.model.VoucherType;

public class TravelAgencyMain {

    public static void main(String[] args) {
        Voucher pietrovy = new Voucher("Pietrovy", 5);
        Voucher sidorovy = new Voucher("Sidorovy", 2);
        TravelAgencyService travelAgency = new TravelAgencyService();
        travelAgency.chooseVoucherType(pietrovy, VoucherType.CRUISE);
        travelAgency.chooseTransport(pietrovy, TransportType.SHIP);
        travelAgency.addMeals(pietrovy, MealsType.BREAKFAST);
        travelAgency.addMeals(pietrovy, MealsType.DINNER);
        travelAgency.chooseAmountOfDays(pietrovy, 15);
        travelAgency.printVoucher(pietrovy);

        travelAgency.chooseVoucherType(sidorovy, VoucherType.SHOPPING);
        travelAgency.chooseTransport(sidorovy, TransportType.BUS);
        travelAgency.chooseAmountOfDays(sidorovy, 2);
        travelAgency.printVoucher(sidorovy);


    }
}
