package fpij;

import java.math.BigDecimal;

import static fpij.Prices.prices;

/**
 * Author: snake
 * Date: 14-6-21
 * Time: 下午9:29
 */
public class DiscountImperative {
    public static void main(final String[] args) {
        BigDecimal totalOfDiscountPrices = BigDecimal.ZERO;

        for (BigDecimal price : prices) {
            if (price.compareTo(BigDecimal.valueOf(20)) > 0) {
                totalOfDiscountPrices = totalOfDiscountPrices.add(price.multiply(BigDecimal.valueOf(0.9)));
            }
        }

        System.out.println("Total of discounted prices: " + totalOfDiscountPrices);
    }
}
