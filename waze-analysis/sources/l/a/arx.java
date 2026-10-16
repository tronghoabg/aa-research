package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum arx implements com.google.v.eg {
    PRODUCT_TAKEOVER_TYPE_UNSPECIFIED(0),
    AD(1),
    ALERT(2),
    FEATURE_TIP(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f53105g;

    arx(int i2) {
        this.f53105g = i2;
    }

    public static arx a(int i2) {
        if (i2 == 0) {
            return PRODUCT_TAKEOVER_TYPE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return AD;
        }
        if (i2 == 2) {
            return ALERT;
        }
        if (i2 != 3) {
            return null;
        }
        return FEATURE_TIP;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53105g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53105g);
    }
}
