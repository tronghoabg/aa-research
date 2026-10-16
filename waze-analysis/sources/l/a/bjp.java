package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bjp implements com.google.v.eg {
    TRAFFIC_SEVERITY_UNSPECIFIED(0),
    STANDSTILL(1),
    HEAVY(2),
    MODERATE(3),
    LIGHT(4),
    CLOSED_ROAD(5),
    UNRECOGNIZED(-1);


    /* renamed from: i, reason: collision with root package name */
    private final int f54099i;

    bjp(int i2) {
        this.f54099i = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54099i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54099i);
    }
}
