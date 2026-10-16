package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum aim implements com.google.v.eg {
    OBJECT_TYPE_UNSPECIFIED(0),
    TRAFFIC_LIGHT(1),
    STOP_SIGN(2),
    CAMERA(3),
    RAILROAD_CROSSING(4),
    SPEED_BUMP(5),
    SCHOOL_ZONE(6),
    SHARP_CURVE(7),
    COMPLEX_MERGER(8),
    COMPLEX_SPLIT_FORK(9),
    COMPLEX_INTERSECTION(10),
    TOLL_BOOTH(11),
    UGC_ALERT(12),
    UNRECOGNIZED(-1);

    private final int p;

    aim(int i2) {
        this.p = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.p;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.p);
    }
}
