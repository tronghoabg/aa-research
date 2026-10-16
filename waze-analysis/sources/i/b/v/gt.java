package i.b.v;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum gt implements com.google.v.eg {
    MERGE(0),
    DELETE(1),
    OVERRIDE(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f49549e;

    gt(int i2) {
        this.f49549e = i2;
    }

    public static gt a(int i2) {
        if (i2 == 0) {
            return MERGE;
        }
        if (i2 == 1) {
            return DELETE;
        }
        if (i2 != 2) {
            return null;
        }
        return OVERRIDE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49549e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49549e);
    }
}
