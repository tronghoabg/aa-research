package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum xp implements com.google.v.eg {
    GAMING_REWARD_SOURCE_UNSPECIFIED(0),
    REPORT(1),
    FEEDBACK(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f55634f;

    xp(int i2) {
        this.f55634f = i2;
    }

    public static xp a(int i2) {
        if (i2 == 0) {
            return GAMING_REWARD_SOURCE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return REPORT;
        }
        if (i2 != 2) {
            return null;
        }
        return FEEDBACK;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55634f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55634f);
    }
}
