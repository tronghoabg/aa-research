package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum sr implements com.google.v.eg {
    NO_STATUS(0),
    ORIGINAL(1),
    UPDATE(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f49038e;

    sr(int i2) {
        this.f49038e = i2;
    }

    public static sr a(int i2) {
        if (i2 == 0) {
            return NO_STATUS;
        }
        if (i2 == 1) {
            return ORIGINAL;
        }
        if (i2 != 2) {
            return null;
        }
        return UPDATE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49038e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49038e);
    }
}
