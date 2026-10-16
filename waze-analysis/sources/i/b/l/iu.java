package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum iu implements com.google.v.eg {
    NONE(0),
    BRONZE(1),
    SILVER(2),
    GOLD(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f48792f;

    iu(int i2) {
        this.f48792f = i2;
    }

    public static iu a(int i2) {
        if (i2 == 0) {
            return NONE;
        }
        if (i2 == 1) {
            return BRONZE;
        }
        if (i2 == 2) {
            return SILVER;
        }
        if (i2 != 3) {
            return null;
        }
        return GOLD;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48792f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48792f);
    }
}
