package i.b.v;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum cm implements com.google.v.eg {
    FREE(0),
    LOW(1),
    MODERATE(2),
    EXPENSIVE(3),
    UNKNOWN(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f49419g;

    cm(int i2) {
        this.f49419g = i2;
    }

    public static cm a(int i2) {
        if (i2 == 0) {
            return FREE;
        }
        if (i2 == 1) {
            return LOW;
        }
        if (i2 == 2) {
            return MODERATE;
        }
        if (i2 == 3) {
            return EXPENSIVE;
        }
        if (i2 != 4) {
            return null;
        }
        return UNKNOWN;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49419g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49419g);
    }
}
