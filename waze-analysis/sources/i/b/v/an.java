package i.b.v;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum an implements com.google.v.eg {
    PAYMENT_METHOD_UNKNOWN(0),
    CREDIT(1),
    DEBIT(2),
    CONTACTLESS(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f49361f;

    an(int i2) {
        this.f49361f = i2;
    }

    public static an a(int i2) {
        if (i2 == 0) {
            return PAYMENT_METHOD_UNKNOWN;
        }
        if (i2 == 1) {
            return CREDIT;
        }
        if (i2 == 2) {
            return DEBIT;
        }
        if (i2 != 3) {
            return null;
        }
        return CONTACTLESS;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49361f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49361f);
    }
}
