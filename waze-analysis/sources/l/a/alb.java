package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum alb implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    SWITCH_APP(1),
    OPEN_MID_SESSION_CONSENT(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f52659f;

    alb(int i2) {
        this.f52659f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52659f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52659f);
    }
}
