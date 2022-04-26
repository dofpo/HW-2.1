public class Main {
    public static void main(String[] args) {
        int cost = 15; // цена билета
        int ticket = 5; // количество купленных билетов
        int mile = (cost * ticket) / 20; // формула расчета количества начисляемых бесплатных миль за перелёты
        if (mile >= 1) {
            System.out.println("Количество начисленных бесплатных миль =" + " " + mile);
        }
        System.out.println("До свидания");
    }
}
