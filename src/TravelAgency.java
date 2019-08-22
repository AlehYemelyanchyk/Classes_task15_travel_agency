/*5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
различного типа (отдых, экскурсии, лечение, шоппинг, круиз и т.д.) для оптимального выбора. Учитывать
возможность выбора транспорта, питания и числа дней.*/

public class TravelAgency {

    public static void main(String[] args) {
    Voucher voucher1 = new Voucher(Voucher.VoucherType.THERAPY, Voucher.Transport.SHIP, 14, Voucher.Meals.BREAKFAST, Voucher.Meals.DINNER);
        System.out.println(voucher1.toString());

    }
}
