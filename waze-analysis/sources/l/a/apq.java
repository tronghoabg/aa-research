package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum apq implements com.google.v.eg {
    CONTEXT_UNSPECIFIED(0),
    MAP(1),
    MORE(2),
    NEARING(3),
    PREVIEW(4),
    NAV_LIST(5),
    PLANNED_DRIVE(6),
    CATEGORICAL(7),
    ADD_WAYPOINT(8),
    FAVORITES(9),
    NULL(10),
    UNRECOGNIZED(-1);

    private final int n;

    apq(int i2) {
        this.n = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.n;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.n);
    }
}
