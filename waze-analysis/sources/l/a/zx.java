package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum zx implements com.google.v.eg {
    ACTION_SUBTYPE_UNSPECIFIED(0),
    BROKEN_TRAFFIC_LIGHT(1),
    DEFAULT(2),
    HEAVY(3),
    HOME(4),
    LOCATION(5),
    MAJOR(6),
    MINOR(7),
    MODERATE(8),
    OFF(9),
    ON(10),
    ON_ROAD(11),
    ON_ROAD_CAR_STOPPED(12),
    ON_ROAD_CONSTRUCTION(13),
    ON_ROAD_ICE(14),
    ON_ROAD_OBJECT(15),
    ON_ROAD_POT_HOLE(16),
    ON_ROAD_ROAD_KILL(17),
    ON_SHOULDER(18),
    ON_SHOULDER_ANIMALS(19),
    ON_SHOULDER_CAR_STOPPED(20),
    STANDSTILL(21),
    WEATHER_FLOOD(22),
    WEATHER_FOG(23),
    WEATHER_HEAVY_RAIN(24),
    WORK(25),
    UNRECOGNIZED(-1);

    private final int C;

    zx(int i2) {
        this.C = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.C;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.C);
    }
}
