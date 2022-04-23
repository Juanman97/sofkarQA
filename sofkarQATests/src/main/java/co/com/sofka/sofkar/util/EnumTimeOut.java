package co.com.sofka.sofkar.util;

public enum EnumTimeOut {

    ZERO(0),
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    TWELVE(12),
    TWENTY_TWO(22),
    TWENTY_THREE(23),
    FIFTY(50),
    ONE_HUNDRED(100),
    NINETEEN_SEVENTY(1970),
    NINETEEN_NINETY(1990),
    TWO_THOUSAND_AND_FIVE(2005),
    TWO_THOUSAND_AND_SIX(2006),
    TWO_THOUSAND_AND_FIFTEEN(2015),
    TWO_THOUSAND_AND_TWENTY_ONE(2021),
    CONTACT_NUM_MIN(300000000),
    CONTACT_NUM_MAX(399999999);

    private final int value;

    EnumTimeOut(int value) {
        this.value = value;
    }

    public int getValue() {

        return value;
    }
}
