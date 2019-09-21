package by.epam.ayem.module4;

/*5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
различного типа (отдых, экскурсии, лечение, шоппинг, круиз и т.д.) для оптимального выбора. Учитывать
возможность выбора транспорта, питания и числа дней.*/

import by.epam.ayem.module4.service.TravelAgencyService;
import by.epam.ayem.module4.model.*;

public class TravelAgencyMain {

    public static void main(String[] args) {
        TravelAgencyService travelAgency = new TravelAgencyService();

        Voucher pietrovy = travelAgency.createVoucherForClient("Peitrovy", 5);
        Voucher sidorovy = travelAgency.createVoucherForClient("Peitrovy", 5);
        travelAgency.createVoucherForClient("Sidorowy", 2);
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
