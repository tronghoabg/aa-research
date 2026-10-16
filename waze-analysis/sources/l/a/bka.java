package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bka implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    BACK(1),
    CANCEL_TIMER(2),
    TOLL_INFO(3),
    DRAWER_SWIPE_DOWN_FULLY(4),
    DRAWER_SWIPE_UP_FULLY(5),
    GO(6),
    GO_TIMEOUT(7),
    GO_TIMER(8),
    PLAN_DRIVE(9),
    ROUTE_SETTINGS(10),
    SELECT_ROUTE(11),
    SHOW_CURRENT(12),
    CLICKED_ON_CLOSURE(13),
    TOGGLE_PANE_VIEW(14),
    TOGGLE_LIST_VIEW(15),
    AUTOMATIC_NAVIGATION_IN_CAR(16),
    AVOID(17),
    INFO(18),
    TOGGLE_VEHICLE_TYPE(19),
    CLICK_ORIGIN(20),
    CLICK_DESTINATION(21),
    SWAP_LOCATIONS(22),
    UNRECOGNIZED(-1);

    private final int z;

    bka(int i2) {
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
