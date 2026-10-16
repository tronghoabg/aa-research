package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum vj implements com.google.v.eg {
    NAVIGATION_TYPE_UNSPECIFIED(0),
    NEW_NAVIGATION(1),
    WHILE_NAVIGATING(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f55559f;

    vj(int i2) {
        this.f55559f = i2;
    }

    public static vj a(int i2) {
        if (i2 == 0) {
            return NAVIGATION_TYPE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return NEW_NAVIGATION;
        }
        if (i2 != 2) {
            return null;
        }
        return WHILE_NAVIGATING;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55559f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55559f);
    }
}
