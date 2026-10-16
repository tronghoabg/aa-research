package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum nj implements com.google.v.eg {
    TRAFFIC_STATE_UNSPECIFIED(0),
    REGULAR(1),
    LIGHTER_THAN_USUAL(2),
    HEAVIER_THAN_USUAL(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f48920f;

    nj(int i2) {
        this.f48920f = i2;
    }

    public static nj a(int i2) {
        if (i2 == 0) {
            return TRAFFIC_STATE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return REGULAR;
        }
        if (i2 == 2) {
            return LIGHTER_THAN_USUAL;
        }
        if (i2 != 3) {
            return null;
        }
        return HEAVIER_THAN_USUAL;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48920f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48920f);
    }
}
