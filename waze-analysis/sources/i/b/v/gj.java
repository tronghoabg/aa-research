package i.b.v;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum gj implements com.google.v.eg {
    DISTANCE(0),
    PRICE(1);


    /* renamed from: d, reason: collision with root package name */
    private final int f49516d;

    gj(int i2) {
        this.f49516d = i2;
    }

    public static gj a(int i2) {
        if (i2 == 0) {
            return DISTANCE;
        }
        if (i2 != 1) {
            return null;
        }
        return PRICE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49516d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49516d);
    }
}
