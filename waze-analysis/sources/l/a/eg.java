package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum eg implements com.google.v.eg {
    REASON_UNSPECIFIED(0),
    INITIAL(1),
    ALTERNATIVE_RETURNED(2),
    REROUTE(3),
    REACHED_WAYPOINT(4),
    ROUTE_SETTINGS_CHANGED(5),
    HOV_TOGGLE(6),
    UNRECOGNIZED(-1);


    /* renamed from: j, reason: collision with root package name */
    private final int f54845j;

    eg(int i2) {
        this.f54845j = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54845j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54845j);
    }
}
