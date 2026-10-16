package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum fd implements com.google.v.eg {
    ANY_UNITS(0),
    PER_USE(1),
    PER_PHONE_CALL(17),
    PER_RIDE(18),
    PER_TIME_UNIT(2),
    PER_SECOND(33),
    PER_MINUTE(34),
    PER_HOUR(35),
    PER_DAY(36),
    PER_NIGHT(37),
    PER_WEEK(38),
    PER_MONTH(39),
    PER_YEAR(40),
    PER_VOLUME_UNIT(4),
    PER_LITER(65),
    PER_GLASS(66),
    PER_BOTTLE(67),
    PER_POT(68),
    PER_LENGTH_UNIT(5),
    PER_CENTIMETER(81),
    PER_METER(82),
    PER_KILOMETER(83),
    PER_MASS_UNIT(6),
    PER_GRAM(97),
    PER_KILOGRAM(98),
    PER_OUNCE(99),
    PER_POUND(100);

    private final int C;

    fd(int i2) {
        this.C = i2;
    }

    public static fd a(int i2) {
        if (i2 == 0) {
            return ANY_UNITS;
        }
        if (i2 == 1) {
            return PER_USE;
        }
        if (i2 == 2) {
            return PER_TIME_UNIT;
        }
        if (i2 == 4) {
            return PER_VOLUME_UNIT;
        }
        if (i2 == 5) {
            return PER_LENGTH_UNIT;
        }
        if (i2 == 6) {
            return PER_MASS_UNIT;
        }
        if (i2 == 17) {
            return PER_PHONE_CALL;
        }
        if (i2 == 18) {
            return PER_RIDE;
        }
        switch (i2) {
            case 33:
                return PER_SECOND;
            case 34:
                return PER_MINUTE;
            case 35:
                return PER_HOUR;
            case 36:
                return PER_DAY;
            case 37:
                return PER_NIGHT;
            case 38:
                return PER_WEEK;
            case 39:
                return PER_MONTH;
            case 40:
                return PER_YEAR;
            default:
                switch (i2) {
                    case 65:
                        return PER_LITER;
                    case 66:
                        return PER_GLASS;
                    case 67:
                        return PER_BOTTLE;
                    case 68:
                        return PER_POT;
                    default:
                        switch (i2) {
                            case 81:
                                return PER_CENTIMETER;
                            case 82:
                                return PER_METER;
                            case 83:
                                return PER_KILOMETER;
                            default:
                                switch (i2) {
                                    case 97:
                                        return PER_GRAM;
                                    case 98:
                                        return PER_KILOGRAM;
                                    case 99:
                                        return PER_OUNCE;
                                    case 100:
                                        return PER_POUND;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.C;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.C);
    }
}
