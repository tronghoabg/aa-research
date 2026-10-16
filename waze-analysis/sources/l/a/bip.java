package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bip implements com.google.v.eg {
    TRAFFIC_INCIDENT_LEVEL_UNSPECIFIED(0),
    LIGHT(1),
    MODERATE(2),
    HEAVY(3),
    STANDSTILL(4),
    CLOSEDROAD(5),
    UNRECOGNIZED(-1);


    /* renamed from: i, reason: collision with root package name */
    private final int f54038i;

    bip(int i2) {
        this.f54038i = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54038i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54038i);
    }
}
