package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum ss implements com.google.v.eg {
    TOLL_INFO_DYNAMIC_PRICE_NOT_SHOWN(0),
    TOLL_INFO_MISSING_PASS(1),
    TOLL_INFO_MISSING_PASS_WITH_PRICE(2),
    TOLL_INFO_PRICE_CHANGE_AT(3),
    TOLL_INFO_PRICE_CHANGE_BY_TIME(4),
    TOLL_INFO_WITH_PASS(5),
    TOLL_INFO_DEFAULT(6),
    TOLL_INFO_NO_PRICE(7),
    TOLL_INFO_DISABLED_BY_CONFIG(8),
    TOLL_INFO_DYNAMIC_PRICE_SHOWN(9);


    /* renamed from: l, reason: collision with root package name */
    private final int f49050l;

    ss(int i2) {
        this.f49050l = i2;
    }

    public static ss a(int i2) {
        switch (i2) {
            case 0:
                return TOLL_INFO_DYNAMIC_PRICE_NOT_SHOWN;
            case 1:
                return TOLL_INFO_MISSING_PASS;
            case 2:
                return TOLL_INFO_MISSING_PASS_WITH_PRICE;
            case 3:
                return TOLL_INFO_PRICE_CHANGE_AT;
            case 4:
                return TOLL_INFO_PRICE_CHANGE_BY_TIME;
            case 5:
                return TOLL_INFO_WITH_PASS;
            case 6:
                return TOLL_INFO_DEFAULT;
            case 7:
                return TOLL_INFO_NO_PRICE;
            case 8:
                return TOLL_INFO_DISABLED_BY_CONFIG;
            case 9:
                return TOLL_INFO_DYNAMIC_PRICE_SHOWN;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49050l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49050l);
    }
}
