package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bfw implements com.google.v.eg {
    CHANGE_REASON_UNSPECIFIED(0),
    APP_OPEN(1),
    ROAMING(2),
    USER_SWIPE(3),
    MAP_INTERACTION(4),
    NAVIGATION_STARTED(5),
    NAVIGATION_ENDED(6),
    BACK_FROM_SEARCH(7),
    WARNING_INDICATOR_VISIBILITY_CHANGED(8),
    SUGGESTION_CARD_TIMEOUT(9),
    RECENTER_BUTTON_TAPPED(10),
    UGC_MENU_DISMISS(11),
    UNRECOGNIZED(-1);

    private final int o;

    bfw(int i2) {
        this.o = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.o;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.o);
    }
}
