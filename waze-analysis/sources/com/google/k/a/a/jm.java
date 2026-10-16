package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum jm implements com.google.v.eg {
    EMISSIONS_STICKER_UNKNOWN(0),
    EURO0(1),
    EURO1(2),
    EURO2(3),
    EURO3(4),
    EURO4(5),
    EURO5(6),
    EURO6(7),
    EURO7(8),
    EURO_EEV(9),
    EURO2_WITH_PRC(10),
    EURO3_WITH_PRC(11),
    ELECTRIC_VEHICLES(12),
    DEU_RED(13),
    DEU_YELLOW(14),
    DEU_GREEN(15),
    FRA_CRITAIR(16),
    FRACRITAIR1(17),
    FRACRITAIR2(18),
    FRACRITAIR3(19),
    FRACRITAIR4(20),
    FRACRITAIR5(21),
    DNK_RED(22),
    DNK_GREEN(23),
    AUT_EURO_I(24),
    AUT_EURO_II(25),
    AUT_EURO_III(26),
    AUT_EURO_IV(27),
    AUT_EURO_V(28),
    AUT_EURO_VI(29),
    SPA_CAT_ECO(30),
    SPA_CAT_ZERO(31),
    SPA_CAT_B(32),
    SPA_CAT_C(33);

    private final int J;

    jm(int i2) {
        this.J = i2;
    }

    public static jm a(int i2) {
        switch (i2) {
            case 0:
                return EMISSIONS_STICKER_UNKNOWN;
            case 1:
                return EURO0;
            case 2:
                return EURO1;
            case 3:
                return EURO2;
            case 4:
                return EURO3;
            case 5:
                return EURO4;
            case 6:
                return EURO5;
            case 7:
                return EURO6;
            case 8:
                return EURO7;
            case 9:
                return EURO_EEV;
            case 10:
                return EURO2_WITH_PRC;
            case 11:
                return EURO3_WITH_PRC;
            case 12:
                return ELECTRIC_VEHICLES;
            case 13:
                return DEU_RED;
            case 14:
                return DEU_YELLOW;
            case 15:
                return DEU_GREEN;
            case 16:
                return FRA_CRITAIR;
            case 17:
                return FRACRITAIR1;
            case 18:
                return FRACRITAIR2;
            case 19:
                return FRACRITAIR3;
            case 20:
                return FRACRITAIR4;
            case 21:
                return FRACRITAIR5;
            case 22:
                return DNK_RED;
            case 23:
                return DNK_GREEN;
            case 24:
                return AUT_EURO_I;
            case 25:
                return AUT_EURO_II;
            case 26:
                return AUT_EURO_III;
            case 27:
                return AUT_EURO_IV;
            case 28:
                return AUT_EURO_V;
            case 29:
                return AUT_EURO_VI;
            case 30:
                return SPA_CAT_ECO;
            case 31:
                return SPA_CAT_ZERO;
            case 32:
                return SPA_CAT_B;
            case 33:
                return SPA_CAT_C;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.J;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.J);
    }
}
