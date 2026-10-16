package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum abq implements com.google.v.eg {
    IMAGE_LABEL_TYPE_UNKNOWN(0),
    PREFERRED(1),
    TRAFFIC(2),
    ACCIDENT(3),
    CONSTRUCTION(4),
    POTHOLE(5),
    BROKEN_TRAFFIC_LIGHT(6),
    WEATHER(7),
    SLIPPERY_ROAD(8),
    FLOOD(9),
    UNPLOWED_ROAD(10),
    FOG(11),
    ICY_ROAD(12),
    BLOCKED_LANE(13),
    UNRECOGNIZED(-1);

    private final int q;

    abq(int i2) {
        this.q = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.q;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.q);
    }
}
