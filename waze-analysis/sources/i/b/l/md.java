package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum md implements com.google.v.eg {
    UNSPECIFIED(0),
    SLOWER(1),
    SIMILAR(2),
    FASTER(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f48877f;

    md(int i2) {
        this.f48877f = i2;
    }

    public static md a(int i2) {
        if (i2 == 0) {
            return UNSPECIFIED;
        }
        if (i2 == 1) {
            return SLOWER;
        }
        if (i2 == 2) {
            return SIMILAR;
        }
        if (i2 != 3) {
            return null;
        }
        return FASTER;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48877f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48877f);
    }
}
