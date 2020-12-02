import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class Homework2 {
    private final By ACCEPT_COOKIE_BTN = By.xpath(".//button[@class = 'notification__button']");
    private final By ARTICLE_BTN = By.xpath(".//span [@class = 'list-article__headline']");
    private final By COMMENT_BTN = By.xpath(".//*[contains(@src, 'comment-v2.svg')]");

    @Test
    public void tvnetTest() {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tvnet.lv/");

        WebElement acceptBtn = driver.findElement(ACCEPT_COOKIE_BTN);
        acceptBtn.click();

        List<WebElement> articles = driver.findElements(By.xpath(".//span[@itemprop = 'headline name']"));
        System.out.println("общее кол-во статей на сайте: " + articles.size());

        //Задаём в .get порядковый номер статьи -1
        //articles.get(1).click();

            int counter = 0;
            for (WebElement list : articles) {
            String name = list.getText();
            //Цепляет к названию кол-во коментов в скобках :(((
            if (name.contentEquals("Putins uzdod jaunnedēļ sākt masveida vakcināciju pret Covid-19 (35)")) {
                counter++;
            articles.get(counter).click();
                    }

        }

        //два снизу это к заданию без *
        /*WebElement articleBtn = driver.findElement(ARTICLE_BTN);
        articleBtn.click();

        WebElement commentBtn = driver.findElement(COMMENT_BTN);
        commentBtn.click();*/


    }

}
