package i.b.v;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum h implements com.google.v.eg {
    TYPE_UNSPECIFIED(0),
    PARKING(1);


    /* renamed from: d, reason: collision with root package name */
    private final int f49553d;

    h(int i2) {
        this.f49553d = i2;
    }

    public static h a(int i2) {
        if (i2 == 0) {
            return TYPE_UNSPECIFIED;
        }
        if (i2 != 1) {
            return null;
        }
        return PARKING;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49553d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49553d);
    }
}
