package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bu implements com.google.v.eg {
    AGE_SCREEN_CONTEXT_UNSPECIFIED(0),
    ONBOARDING(1),
    EDIT(2),
    EXISTING_USER(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f54667g;

    bu(int i2) {
        this.f54667g = i2;
    }

    public static bu a(int i2) {
        if (i2 == 0) {
            return AGE_SCREEN_CONTEXT_UNSPECIFIED;
        }
        if (i2 == 1) {
            return ONBOARDING;
        }
        if (i2 == 2) {
            return EDIT;
        }
        if (i2 != 3) {
            return null;
        }
        return EXISTING_USER;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54667g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54667g);
    }
}
