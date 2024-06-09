import java.time.LocalDate;
import java.util.List;

public class ProductMain {

    public static void main(String[] args) {

        HotBeverage cacao = new HotBeverage("Какао", 3.5f, LocalDate.of(2024, 05, 01), 45);
        HotBeverage tea = new HotBeverage("Чай", 2.5f, LocalDate.of(2024, 04, 23), 60);
        HotBeverage americano = new HotBeverage("Американо", 3.0f, LocalDate.of(2024, 06, 1), 70);
        HotBeverage cappucino = new HotBeverage("Капучино", 4.0f, LocalDate.of(2024, 06, 1), 50);
        VendingMachine lenina53Machine = new HotBeverageVendingMachine();
        VendingMachine mira2Machine = new HotBeverageVendingMachine();
        lenina53Machine.addProducts(List.of(cacao, cacao, tea, tea, tea));
        mira2Machine.addProducts(List.of(americano, americano, cappucino, cappucino, cappucino));

        System.out.println(lenina53Machine.getProducts());
        System.out.println(mira2Machine.getProducts());

    }
}
