package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum vf implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    GO(1),
    GO_LATER(2),
    GO_TIMEOUT(3),
    OVERVIEW(4),
    SHARE(5),
    UNSHARE(6),
    STOP(7),
    GAS_WAYPOINT(8),
    FOOD_WAYPOINT(9),
    COFFEE_WAYPOINT(10),
    PARKING_WAYPOINT(11),
    SEARCH_WAYPOINT(12),
    EV_CHARGING_STATION_WAYPOINT(13),
    CLOSE(14),
    RESUME(15),
    SPECIAL_ROUTE_CARD(16),
    MANAGE_SOUNDS(17),
    SETTINGS(18),
    ALGO_TRANSPARENCY_LINK(19),
    ALTERNATIVE_ROUTES(20),
    SEARCH(21),
    EXIT_LOCK_SCREEN_NAVIGATION(22),
    UNRECOGNIZED(-1);

    private final int z;

    vf(int i2) {
        this.z = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.z;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.z);
    }
}
