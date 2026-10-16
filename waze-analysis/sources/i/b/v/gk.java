package i.b.v;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum gk implements com.google.v.eg {
    ASCENDING(0),
    DESCENDING(1);


    /* renamed from: d, reason: collision with root package name */
    private final int f49520d;

    gk(int i2) {
        this.f49520d = i2;
    }

    public static gk a(int i2) {
        if (i2 == 0) {
            return ASCENDING;
        }
        if (i2 != 1) {
            return null;
        }
        return DESCENDING;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49520d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49520d);
    }
}
