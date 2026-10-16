package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bja implements com.google.v.eg {
    TOLL_INFO_UNSPECIFIED(0),
    TOLL_INFO_MISSING_PASS(1),
    TOLL_INFO_MISSING_PASS_WITH_PRICE(2),
    TOLL_INFO_PRICE_CHANGE(3),
    TOLL_INFO_PRICE_CHANGE_BY_TIME(4),
    TOLL_INFO_WITH_PASS(5),
    TOLL_INFO_DEFAULT(6),
    TOLL_INFO_NO_PRICE(7),
    TOLL_INFO_DISABLED_BY_CONFIG(8),
    TOLL_INFO_DYNAMIC_PRICE_SHOWN(9),
    TOLL_INFO_DYNAMIC_PRICE_NOT_SHOWN(10),
    UNRECOGNIZED(-1);

    private final int n;

    bja(int i2) {
        this.n = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.n;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.n);
    }
}
