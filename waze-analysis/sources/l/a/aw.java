package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum aw implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    ADD_FAVORITE(1),
    ADD_PHOTO(2),
    BACK(3),
    BEST_PARKING(4),
    CALL(5),
    EDIT(6),
    GO(7),
    IMAGE(8),
    MORE_PARKING(9),
    MORE(10),
    REPORT_PROBLEM(11),
    SEND_LOCATION(12),
    WEBSITE(13),
    X(14),
    SHOW_ON_MAP(15),
    REMOVE_FAVORITE(16),
    SET_START_POINT(17),
    CALENDAR_CONFIRM(18),
    CALENDAR_CHANGE(19),
    CALENDAR_REMOVE(20),
    ADD_STOP(21),
    NEW_DRIVE(22),
    PARKING_INFO(23),
    BOOK_PARKING(24),
    WHY_THIS_AD(25),
    AD_BANNER(26),
    UNRECOGNIZED(-1);

    private final int D;

    aw(int i2) {
        this.D = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.D;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.D);
    }
}
