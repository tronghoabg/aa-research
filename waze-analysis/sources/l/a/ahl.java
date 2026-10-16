package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ahl implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    BACK(1),
    BANNER(2),
    CLOSE(3),
    FEEDBACK(4),
    INBOX(5),
    MARKETPLACE(6),
    PLAN_DRIVE(7),
    PROFILE(8),
    SETTINGS(9),
    SHUT_DOWN(10),
    SUPPORT(11),
    UNRECOGNIZED(-1);

    private final int o;

    ahl(int i2) {
        this.o = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.o;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.o);
    }
}
