package i.b.v;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum co implements com.google.v.eg {
    STREET_LEVEL(0),
    STREET_LEVEL_COVERED(1),
    MULTI_LEVEL(2),
    UNDERGROUND(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f49434f;

    co(int i2) {
        this.f49434f = i2;
    }

    public static co a(int i2) {
        if (i2 == 0) {
            return STREET_LEVEL;
        }
        if (i2 == 1) {
            return STREET_LEVEL_COVERED;
        }
        if (i2 == 2) {
            return MULTI_LEVEL;
        }
        if (i2 != 3) {
            return null;
        }
        return UNDERGROUND;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49434f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49434f);
    }
}
