public class Main {
    public static void main(String[] args) {
        int a = 15; // цена билета
        int b = 5; // количество купленных билетов
        int c = (a * b) / 20; // формула расчета количества начисляемых бесплатных миль за перелёты
        if (c >= 1) {
            System.out.println("Количество начисленных бесплатных миль =" + " " + c);
        }
        System.out.println("До свидания");
    }
}
