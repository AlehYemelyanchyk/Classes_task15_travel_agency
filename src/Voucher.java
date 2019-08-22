/*5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
различного типа (отдых, экскурсии, лечение, шоппинг, круиз и т.д.) для оптимального выбора. Учитывать
возможность выбора транспорта, питания и числа дней.*/

public class Voucher {

    private VoucherType voucherType;
    private Transport transport;
    private int daysAmount;
    private Meals[] meals;

    public Voucher(VoucherType voucherType, Transport transport, int daysAmount, Meals... meals) {
        this.voucherType = voucherType;
        this.transport = transport;
        this.daysAmount = daysAmount;
        this.meals = meals;
    }

    @Override
    public String toString() {
        return "Voucher type: " + voucherType.getTypeOfVoucher() +
                ". Transport: " + transport.getTransport() +
                ". Meals: " + makeString(Meals.readableArray(meals)) +
                ". Days amount: " + daysAmount +
                ".";
    }

    private static String makeString(Object[] a) {
        if (a == null)
            return "null";

        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        for (int i = 0; ; i++) {
            b.append(a[i]);
            if (i == iMax) {
                return b.toString();
            }
            b.append(", ");
        }
    }

    public VoucherType getVoucherType() {
        return voucherType;
    }

    public void setVoucherType(VoucherType voucherType) {
        this.voucherType = voucherType;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Meals[] getMeals() {
        return meals;
    }

    public void setMeals(Meals[] meals) {
        this.meals = meals;
    }

    public int getDaysAmount() {
        return daysAmount;
    }

    public void setDaysAmount(int daysAmount) {
        this.daysAmount = daysAmount;
    }

    public enum VoucherType {

        RESORT("resort"), TOUR("tour"),
        THERAPY("therapy"), SHOPPING("shopping"),
        CRUISE("cruise"), SPORT("sport");

        VoucherType(String readable) {
            this.typeOfVoucher = readable;
        }

        private String typeOfVoucher;

        public String getTypeOfVoucher() {
            return typeOfVoucher;
        }
    }

    public enum Transport {

        BUS("bus"), PLANE("plain"), TRAIN("train"), SHIP("ship");

        Transport(String readable) {
            this.transport = readable;
        }

        private String transport;

        public String getTransport() {
            return transport;
        }
    }

    public enum Meals {

        BREAKFAST("breakfast"), LUNCH("lunch"), DINNER("dinner");

        Meals(String readable) {
            this.typeOfMeal = readable;
        }

        public static String[] readableArray(Meals[] meals) {
            String[] strArray = new String[meals.length];
            for (int i = 0; i < meals.length; i++) {
                strArray[i] = meals[i].getTypeOfMeal();
            }
            return strArray;
        }

        private String typeOfMeal;

        public String getTypeOfMeal() {
            return typeOfMeal;
        }


    }
}
