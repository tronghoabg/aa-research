package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum lc implements com.google.v.eg {
    CLUSTER_SETTING_UNSPECIFIED(0),
    ENABLE(1),
    DISABLE(2),
    USER_PREFERENCE(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f55032g;

    lc(int i2) {
        this.f55032g = i2;
    }

    public static lc a(int i2) {
        if (i2 == 0) {
            return CLUSTER_SETTING_UNSPECIFIED;
        }
        if (i2 == 1) {
            return ENABLE;
        }
        if (i2 == 2) {
            return DISABLE;
        }
        if (i2 != 3) {
            return null;
        }
        return USER_PREFERENCE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55032g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55032g);
    }
}
