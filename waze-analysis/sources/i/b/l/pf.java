package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum pf implements com.google.v.eg {
    ACCEPT_REASON_UNSPECIFIED(0),
    EXPLICIT_ACCEPT(1),
    DEFAULT_ACCEPT(2),
    SILENT(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f48974f;

    pf(int i2) {
        this.f48974f = i2;
    }

    public static pf a(int i2) {
        if (i2 == 0) {
            return ACCEPT_REASON_UNSPECIFIED;
        }
        if (i2 == 1) {
            return EXPLICIT_ACCEPT;
        }
        if (i2 == 2) {
            return DEFAULT_ACCEPT;
        }
        if (i2 != 3) {
            return null;
        }
        return SILENT;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48974f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48974f);
    }
}
