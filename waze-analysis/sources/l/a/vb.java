package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum vb implements com.google.v.eg {
    UNKNOWN(0),
    COLLAPSE(1),
    OVERVIEW(2),
    STOP(3),
    CLOSE(4),
    BACK(5),
    ADD_A_STOP(6),
    GAS_WAYPOINT(7),
    FOOD_WAYPOINT(8),
    COFFEE_WAYPOINT(9),
    PARKING_WAYPOINT(10),
    SEARCH_WAYPOINT(11),
    EV_CHARGING_STATION_WAYPOINT(12),
    UNRECOGNIZED(-1);

    private final int p;

    vb(int i2) {
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
