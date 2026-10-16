package i.b.v;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum cs implements com.google.v.eg {
    CASH(0),
    CHECKS(1),
    CREDIT(2),
    DEBIT_CARD(3),
    PERMIT(4),
    MEMBERSHIP(5),
    PREPAID(6),
    PARKING_APP(7),
    DIGITAL_WALLET(8),
    SMS_CALL(9),
    ELECTRONIC_PASS(10);

    private final int m;

    cs(int i2) {
        this.m = i2;
    }

    public static cs a(int i2) {
        switch (i2) {
            case 0:
                return CASH;
            case 1:
                return CHECKS;
            case 2:
                return CREDIT;
            case 3:
                return DEBIT_CARD;
            case 4:
                return PERMIT;
            case 5:
                return MEMBERSHIP;
            case 6:
                return PREPAID;
            case 7:
                return PARKING_APP;
            case 8:
                return DIGITAL_WALLET;
            case 9:
                return SMS_CALL;
            case 10:
                return ELECTRONIC_PASS;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.m;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.m);
    }
}
