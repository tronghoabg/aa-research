package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum aol implements com.google.v.eg {
    TYPE_UNSPECIFIED(0),
    SIGN_IN(1),
    EDIT_EMAIL(2),
    REGISTER_GUEST_WAZER(3),
    NO_EMAIL(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f52877h;

    aol(int i2) {
        this.f52877h = i2;
    }

    public static aol a(int i2) {
        if (i2 == 0) {
            return TYPE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return SIGN_IN;
        }
        if (i2 == 2) {
            return EDIT_EMAIL;
        }
        if (i2 == 3) {
            return REGISTER_GUEST_WAZER;
        }
        if (i2 != 4) {
            return null;
        }
        return NO_EMAIL;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52877h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52877h);
    }
}
