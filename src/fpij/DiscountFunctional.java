package fpij;

import java.math.BigDecimal;

/**
 * Author: snake
 * Date: 14-6-21
 * Time: 下午9:30
 */
public class DiscountFunctional {
    public static void main(final String[] args) {
        final BigDecimal totalOfDiscountedPrices =
                Prices.prices.stream()
                .filter(price -> price.compareTo(BigDecimal.valueOf(20)) > 0)
                .map(price -> price.multiply(BigDecimal.valueOf(0.9)))
                .reduce(BigDecimal.ZERO,BigDecimal::add);

        System.out.println("Total of discounted prices: " + totalOfDiscountedPrices);
    }
}
