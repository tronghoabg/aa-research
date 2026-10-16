package i.b.v;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum fs implements com.google.v.eg {
    VENUE(1),
    IMAGE(2);


    /* renamed from: d, reason: collision with root package name */
    private final int f49492d;

    fs(int i2) {
        this.f49492d = i2;
    }

    public static fs a(int i2) {
        if (i2 == 1) {
            return VENUE;
        }
        if (i2 != 2) {
            return null;
        }
        return IMAGE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49492d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49492d);
    }
}
