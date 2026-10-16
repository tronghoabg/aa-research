package i.b.v;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum ar implements com.google.v.eg {
    PAYMENT_METHOD_UNKNOWN(0),
    CREDIT(1),
    DEBIT(2),
    APP(3),
    MEMBERSHIP_CARD(4),
    ONLINE_PAYMENT(5),
    PLUG_IN_AUTO_CHARGE(6),
    OTHER(7);


    /* renamed from: j, reason: collision with root package name */
    private final int f49382j;

    ar(int i2) {
        this.f49382j = i2;
    }

    public static ar a(int i2) {
        switch (i2) {
            case 0:
                return PAYMENT_METHOD_UNKNOWN;
            case 1:
                return CREDIT;
            case 2:
                return DEBIT;
            case 3:
                return APP;
            case 4:
                return MEMBERSHIP_CARD;
            case 5:
                return ONLINE_PAYMENT;
            case 6:
                return PLUG_IN_AUTO_CHARGE;
            case 7:
                return OTHER;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49382j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49382j);
    }
}
