package i.b.v;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum bh implements com.google.v.eg {
    ENTRY(0),
    EXIT(1),
    BOTH(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f49394e;

    bh(int i2) {
        this.f49394e = i2;
    }

    public static bh a(int i2) {
        if (i2 == 0) {
            return ENTRY;
        }
        if (i2 == 1) {
            return EXIT;
        }
        if (i2 != 2) {
            return null;
        }
        return BOTH;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49394e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49394e);
    }
}
