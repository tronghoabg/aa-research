package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum qb implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    ADD_SHORTCUT_SIRI(1),
    CALENDAR_EVENT_CHANGE_LOCATION(2),
    CALENDAR_SETTINGS(3),
    REMOVE_PLANNED_DRIVE(4),
    EDIT_HOME(5),
    EDIT_WORK(6),
    FIND_PARKING(7),
    FOOTER_NAV_HISTORY(8),
    FOOTER_PLANNED_DRIVES_SETTINGS(9),
    FOOTER_SUGGESTION_SETTINGS(10),
    ADDRESS_INFO(11),
    PLANNED_DRIVE_EDIT(12),
    PLANNED_DRIVE_SETTINGS(13),
    REMOVE_CALENDAR_ALL_RECURRING(14),
    REMOVE_CALENDAR_ALL_THIS_ADDRESS(15),
    REMOVE_CALENDAR_EVENT(16),
    REMOVE_DESTINATION(17),
    REMOVE_HOME(18),
    REMOVE_SIMILAR_ROUTINES(19),
    REMOVE_ROUTINE(20),
    REMOVE_WORK(21),
    RENAME(22),
    SHARE(23),
    CLOSE(24),
    CALENDAR_EVENT_SET_ADDRESS(25),
    REMOVE_FAVORITE(26),
    SAVE_PLACE(27),
    UNRECOGNIZED(-1);

    private final int E;

    qb(int i2) {
        this.E = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.E;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.E);
    }
}
