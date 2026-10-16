package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum avy implements com.google.v.eg {
    ROAD_TYPE_UNSPECIFIED(0),
    ROAD_TYPE_FREEWAY(1),
    ROAD_TYPE_PRIMARY(2),
    ROAD_TYPE_SECONDARY(3),
    ROAD_TYPE_RAMP(4),
    ROAD_TYPE_MAIN(5),
    ROAD_TYPE_EXIT(6),
    ROAD_TYPE_STREET(7),
    ROAD_TYPE_PEDESTRIAN(8),
    ROAD_TYPE_4X4(9),
    ROAD_TYPE_TRAIL(10),
    ROAD_TYPE_WALKWAY(11),
    ROAD_TYPE_RAILROAD(12),
    ROAD_TYPE_RUNWAY(13),
    ROAD_TYPE_FERRY(14),
    ROAD_TYPE_PRIVATE(15),
    ROAD_TYPE_PARKING(16),
    ROAD_TYPE_DIRT(17),
    ROAD_TYPE_MINOR(18),
    ROAD_TYPE_LAST(19),
    UNRECOGNIZED(-1);

    private final int w;

    avy(int i2) {
        this.w = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.w;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.w);
    }
}
