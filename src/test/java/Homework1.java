import org.junit.Test;
        import java.math.BigDecimal;


public class Homework1 {
    @Test
    public void loanCalculation() {
        float loanAmount = 35000;
        System.out.println("Сумма ипотечного кредита: " + loanAmount + " EUR");
        float annualRate = 3;
        System.out.println("Годовая процентная ставка: " + annualRate + " %");
        float loanDuration = 20;
        System.out.println("Срок кредита: " + loanDuration + " лет");
        float loanCharges = (annualRate / 100) * loanAmount * ((loanDuration + 1) / 2);
        System.out.println("Сумма процентов: " + loanCharges + " EUR");
        float loanTotal = loanAmount + loanCharges;
        System.out.println("Конечная сумма: " + loanTotal + "EUR");

    }
@Test
    public void symbolCounter() {
        String str = "Good evening    everyone! Take   it easy";
        System.out.println("Исходная строка:" + str);
        System.out.println("Колличество символов в исходной строке: " + str.length());

        int wordCounter = str.split(" +").length;
        System.out.println("Колличество слов в исходной строке: " + wordCounter);

}
    }

