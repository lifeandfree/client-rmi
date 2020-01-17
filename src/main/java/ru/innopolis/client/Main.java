package ru.innopolis.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.innopolis.common.CurrencyConverter;
import ru.innopolis.common.Money;

/**
 * Main.
 *
 * @author lifeandfree
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context =  new ClassPathXmlApplicationContext("server_content.xml");

        CurrencyConverter converter = (CurrencyConverter) context.getBean("convertBean");

        System.out.println(converter.convert(6000));

        Money money = new Money(1000, "RUB");
        money = converter.convertMoney(money);

        System.out.println("----------------------");
        System.out.println(money.getCurrencyName());
        System.out.println(money.getSum());

    }
}
