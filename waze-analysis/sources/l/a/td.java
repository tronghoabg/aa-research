package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum td implements com.google.v.eg {
    NAVIGATION_TYPE_UNSPECIFIED(0),
    PLANNED_DRIVE(1),
    HOME(2),
    PLACE_TAP_ON_MAP(3),
    PARKING(4),
    SEARCH(5),
    SHARED_DRIVE(6),
    CALENDAR(7),
    WORK(8),
    GAS_SEARCH(9),
    CALENDAR_DRIVE(10),
    FAVORITE(11),
    PARKING_SUGGESTION(12),
    PLACE_SEARCH(13),
    LOCATION(14),
    CALENDAR_PUSH(15),
    URL_SEARCH(16),
    SHARED_LOCATION(17),
    PLANNED_DRIVE_PUSH(18),
    AD_TAP_ON_MAP(19),
    HISTORY(20),
    OTHER_FAVORITE(21),
    URL_LOCATION(22),
    RECENT_AD(23),
    AD_SEARCH(24),
    UNRECOGNIZED(-1);

    private final int B;

    td(int i2) {
        this.B = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.B;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.B);
    }
}
