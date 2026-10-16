package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum hb implements com.google.v.eg {
    CUISINE_UNDEFINED(0),
    FAST_FOOD(1),
    AMERICAN(2),
    JAPANESE(3),
    BREAK_FAST(4),
    PIZZA(5),
    HAMBURGER(6),
    ITALIAN(7),
    SEAFOOD(8),
    FAMILY(9),
    MEXICAN(10),
    CHINESE(11),
    VEGETARIAN(12),
    SUSHI(13),
    CHICKEN(14),
    INDIAN(15),
    ASIAN(16),
    MEDITERRANEAN(17),
    FRENCH(18),
    BRUNCH(19),
    KOREAN(20),
    THAI(21),
    SPANISH(22),
    VIETNAMESE(23),
    LATIN_AMERICAN(24),
    INDONESIAN(25),
    GREEK(26),
    GERMAN(27),
    TURKISH(28),
    BRAZILIAN(29),
    PAKISTANI(30),
    OTHER_CUISINE(99);

    private final int H;

    hb(int i2) {
        this.H = i2;
    }

    public static hb a(int i2) {
        if (i2 == 99) {
            return OTHER_CUISINE;
        }
        switch (i2) {
            case 0:
                return CUISINE_UNDEFINED;
            case 1:
                return FAST_FOOD;
            case 2:
                return AMERICAN;
            case 3:
                return JAPANESE;
            case 4:
                return BREAK_FAST;
            case 5:
                return PIZZA;
            case 6:
                return HAMBURGER;
            case 7:
                return ITALIAN;
            case 8:
                return SEAFOOD;
            case 9:
                return FAMILY;
            case 10:
                return MEXICAN;
            case 11:
                return CHINESE;
            case 12:
                return VEGETARIAN;
            case 13:
                return SUSHI;
            case 14:
                return CHICKEN;
            case 15:
                return INDIAN;
            case 16:
                return ASIAN;
            case 17:
                return MEDITERRANEAN;
            case 18:
                return FRENCH;
            case 19:
                return BRUNCH;
            case 20:
                return KOREAN;
            case 21:
                return THAI;
            case 22:
                return SPANISH;
            case 23:
                return VIETNAMESE;
            case 24:
                return LATIN_AMERICAN;
            case 25:
                return INDONESIAN;
            case 26:
                return GREEK;
            case 27:
                return GERMAN;
            case 28:
                return TURKISH;
            case 29:
                return BRAZILIAN;
            case 30:
                return PAKISTANI;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.H;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.H);
    }
}
