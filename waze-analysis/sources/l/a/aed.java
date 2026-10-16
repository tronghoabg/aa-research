package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum aed implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    THERE(1),
    NOT_THERE(2),
    ACCEPT_REROUTE(3),
    DECLINE_REROUTE(4),
    CLOSE(5),
    GENERAL_COMPONENT_TAP(6),
    EMPTY_MAP_CLICK(7),
    BACK_CLICK(8),
    UNRECOGNIZED(-1);


    /* renamed from: l, reason: collision with root package name */
    private final int f52345l;

    aed(int i2) {
        this.f52345l = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52345l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52345l);
    }
}
