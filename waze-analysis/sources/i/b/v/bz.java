package i.b.v;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum bz implements com.google.v.eg {
    BUSINESS_STATUS_UNSPECIFIED(0),
    OPERATIONAL(1),
    TEMPORARILY_CLOSED(2),
    PERMANENTLY_CLOSED(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f49412f;

    bz(int i2) {
        this.f49412f = i2;
    }

    public static bz a(int i2) {
        if (i2 == 0) {
            return BUSINESS_STATUS_UNSPECIFIED;
        }
        if (i2 == 1) {
            return OPERATIONAL;
        }
        if (i2 == 2) {
            return TEMPORARILY_CLOSED;
        }
        if (i2 != 3) {
            return null;
        }
        return PERMANENTLY_CLOSED;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49412f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49412f);
    }
}
