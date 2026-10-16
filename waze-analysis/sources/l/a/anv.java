package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum anv implements com.google.v.eg {
    TYPE_UNSPECIFIED(0),
    TURN_ON_YOUR_HEADLIGHTS(1),
    ECO_REGULATION(2),
    MID_DRIVE_TOAST(3),
    GTW_REROUTE_SUGGESTION(4),
    NETWORK_ISSUE(6),
    UNRECOGNIZED(-1);


    /* renamed from: i, reason: collision with root package name */
    private final int f52834i;

    anv(int i2) {
        this.f52834i = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52834i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52834i);
    }
}
