package i.b.v;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum aa implements com.google.v.eg {
    CHARGERS_ACCESS_TYPE_UNKNOWN(0),
    PUBLIC(1),
    RESTRICTED(2),
    PRIVATE(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f49349f;

    aa(int i2) {
        this.f49349f = i2;
    }

    public static aa a(int i2) {
        if (i2 == 0) {
            return CHARGERS_ACCESS_TYPE_UNKNOWN;
        }
        if (i2 == 1) {
            return PUBLIC;
        }
        if (i2 == 2) {
            return RESTRICTED;
        }
        if (i2 != 3) {
            return null;
        }
        return PRIVATE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49349f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49349f);
    }
}
