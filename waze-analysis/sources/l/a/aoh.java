package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum aoh implements com.google.v.eg {
    CONTEXT_UNSPECIFIED(0),
    WAZE_ONBOARDING(1),
    LOGIN_CONTEXT(2),
    PRIMARY(3),
    SETTINGS(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f52861h;

    aoh(int i2) {
        this.f52861h = i2;
    }

    public static aoh a(int i2) {
        if (i2 == 0) {
            return CONTEXT_UNSPECIFIED;
        }
        if (i2 == 1) {
            return WAZE_ONBOARDING;
        }
        if (i2 == 2) {
            return LOGIN_CONTEXT;
        }
        if (i2 == 3) {
            return PRIMARY;
        }
        if (i2 != 4) {
            return null;
        }
        return SETTINGS;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52861h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52861h);
    }
}
