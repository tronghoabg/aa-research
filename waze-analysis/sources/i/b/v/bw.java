package i.b.v;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum bw implements com.google.v.eg {
    POINT(0),
    POLYGON(1);


    /* renamed from: d, reason: collision with root package name */
    private final int f49406d;

    bw(int i2) {
        this.f49406d = i2;
    }

    public static bw a(int i2) {
        if (i2 == 0) {
            return POINT;
        }
        if (i2 != 1) {
            return null;
        }
        return POLYGON;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49406d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49406d);
    }
}
