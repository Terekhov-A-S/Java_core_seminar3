import ru.gb.Employees;

import java.time.LocalDate;

import static ru.gb.Employees.birthDateComparator;

public class Main {
    public static void main(String[] args) {
        Employees sergey = new Employees("Маликов", "Сергей", "Петрович", LocalDate.of(1980, 5, 15), "Менеджер проекта", 320.00);
        Employees natalia = new Employees("Степанова", "Наталья", "Ивановна", LocalDate.of(1988, 8, 24), "Бухгалтер", 110.00);
        Employees ivan = new Employees("Бутусов", "Иван", "Сергеевич", LocalDate.of(1990, 5, 15), "Менеджер продукта", 320.00);
        Employees viktoria = new Employees("Лобкова", "Виктория", "Игоревна", LocalDate.of(1992, 1, 8), "Эксперт по связям с общественностью", 170.50);
        Employees maksim = new Employees("Нестеров", "Максим", "Максимович", LocalDate.of(1999, 3, 8), "Программист", 235.00);
        Employees olga = new Employees("Прохоренко", "Ольга", "Алексеевна", LocalDate.of(2005, 12, 5), "Дизайнер", 210.00);
        Employees aleksey = new Employees("Петров", "Алексей", "Александрович", LocalDate.of(1974, 10, 10), "Главный бухгалтер", 180.70);
        Employees irina = new Employees("Красавина", "Ирина", "Ивановна", LocalDate.of(1992, 1, 8), "Экономист", 150.65);

        // Сравнение с использованием компаратора
        if (birthDateComparator().compare(sergey, olga) > 0) {
            System.out.println(sergey.getFirstName() + " старше, чем " + olga.getFirstName());
        } else if (birthDateComparator().compare(sergey, olga) < 0) {
            System.out.println(sergey.getFirstName() + " младше, чем " + olga.getFirstName());
        } else {
            System.out.println(sergey.getFirstName() + " и " + olga.getFirstName() + " родились в один день");
        }

    }


}
