import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqamvn1.services.MonthsOfAndRest;

public class MonthsOfAndRestTest {
        @Test
        public void WhenVacation() {
            MonthsOfAndRest service = new MonthsOfAndRest();

            int income = 10_000;
            int expenses = 3_000;
            int threshold = 20_000;
            int expected = 3;

            int actual = service.calculate(income, expenses, threshold);
            Assertions.assertEquals(expected, actual);
        }

}

