package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum arm implements com.google.v.eg {
    REASON_UNSPECIFIED(0),
    PTO_ACTION_CLICKED(1),
    CLOSED_BY_USER(2),
    TIMEOUT(3),
    USER_STARTED_DRIVING(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f53086h;

    arm(int i2) {
        this.f53086h = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53086h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53086h);
    }
}
