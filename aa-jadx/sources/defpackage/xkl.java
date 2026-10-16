package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum xkl implements defpackage.abpb {
    FUEL_TYPE_UNKNOWN(0),
    FUEL_TYPE_UNLEADED(1),
    FUEL_TYPE_LEADED(2),
    FUEL_TYPE_DIESEL_1(3),
    FUEL_TYPE_DIESEL_2(4),
    FUEL_TYPE_BIODIESEL(5),
    FUEL_TYPE_E85(6),
    FUEL_TYPE_LPG(7),
    FUEL_TYPE_CNG(8),
    FUEL_TYPE_LNG(9),
    FUEL_TYPE_ELECTRIC(10),
    FUEL_TYPE_HYDROGEN(11),
    FUEL_TYPE_OTHER(12);

    private final int o;

    xkl(int i) {
        this.o = i;
    }

    public static defpackage.xkl b(int i) {
        switch (i) {
            case 0:
                return FUEL_TYPE_UNKNOWN;
            case 1:
                return FUEL_TYPE_UNLEADED;
            case 2:
                return FUEL_TYPE_LEADED;
            case 3:
                return FUEL_TYPE_DIESEL_1;
            case 4:
                return FUEL_TYPE_DIESEL_2;
            case 5:
                return FUEL_TYPE_BIODIESEL;
            case 6:
                return FUEL_TYPE_E85;
            case 7:
                return FUEL_TYPE_LPG;
            case 8:
                return FUEL_TYPE_CNG;
            case 9:
                return FUEL_TYPE_LNG;
            case 10:
                return FUEL_TYPE_ELECTRIC;
            case 11:
                return FUEL_TYPE_HYDROGEN;
            case 12:
                return FUEL_TYPE_OTHER;
            default:
                return null;
        }
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.o;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.o);
    }
}
