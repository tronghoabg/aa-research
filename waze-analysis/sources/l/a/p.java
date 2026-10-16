package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum p implements com.google.v.eg {
    ACCOUNT_STATE_UNSPECIFIED(0),
    REGISTERED_USER_ACCOUNT(1),
    TEMPORARY_USER_ACCOUNT(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f55216f;

    p(int i2) {
        this.f55216f = i2;
    }

    public static p a(int i2) {
        if (i2 == 0) {
            return ACCOUNT_STATE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return REGISTERED_USER_ACCOUNT;
        }
        if (i2 != 2) {
            return null;
        }
        return TEMPORARY_USER_ACCOUNT;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55216f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55216f);
    }
}
