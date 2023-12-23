public class Main {
    public static void main(String[] args) {

        Abonent[] abonents = new Abonent[2];
        abonents[0] = new Abonent(0, "Иванов", "Иван", "Иванович", "ул. Ивановича, д.1", 150, "123456789", 100);
        abonents[1] = new Abonent(1, "Егоров", "Егор", "Егорович", "ул. Приморская, д.21", 200, "987654321", 50);

        int maxCallTime = 100;
        for (Abonent abonent : abonents) {
            if (abonent.getTotalCallTime() > maxCallTime) {
                System.out.println("Фамилия: " + abonent.getLastName());
                System.out.println("Имя: " + abonent.getName());
                System.out.println("Отчество: " + abonent.getSurname());
                System.out.println("Адрес: " + abonent.getAddress());
                System.out.println("Общее время разговора: " + abonent.getTotalCallTime());
                System.out.println("Номер кредитной карты: " + abonent.getCreditCardNumber());
                System.out.println("Дебет: " + abonent.getDebet());
                System.out.println();
            }
        }
    }
}