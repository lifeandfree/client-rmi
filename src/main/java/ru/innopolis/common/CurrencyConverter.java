package ru.innopolis.common;

/**
 * CurruncyConventer.
 *
 * @author lifeandfree
 */
public interface CurrencyConverter {
    double convert(double sum);

    Money convertMoney(Money money);
}
