package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ahp implements com.google.v.eg {
    BADGE_UNSPECIFIED(0),
    INBOX(1),
    MARKETPLACE(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f52515f;

    ahp(int i2) {
        this.f52515f = i2;
    }

    public static ahp a(int i2) {
        if (i2 == 0) {
            return BADGE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return INBOX;
        }
        if (i2 != 2) {
            return null;
        }
        return MARKETPLACE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52515f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52515f);
    }
}
