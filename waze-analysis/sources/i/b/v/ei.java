package i.b.v;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum ei implements com.google.v.eg {
    BASE(0),
    COMMUNITY(1);


    /* renamed from: d, reason: collision with root package name */
    private final int f49488d;

    ei(int i2) {
        this.f49488d = i2;
    }

    public static ei a(int i2) {
        if (i2 == 0) {
            return BASE;
        }
        if (i2 != 1) {
            return null;
        }
        return COMMUNITY;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49488d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49488d);
    }
}
