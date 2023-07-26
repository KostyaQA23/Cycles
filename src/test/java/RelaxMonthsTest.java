import org.example.RelaxMonths;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class RelaxMonthsTest {
    @Test
    public void shouldCalculateMoneyMonths1() {
       // RelaxMonths service = new VacationService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;

        int actual = RelaxMonths.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMoneyMonths2() {
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;

        int actual = RelaxMonths.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

}
