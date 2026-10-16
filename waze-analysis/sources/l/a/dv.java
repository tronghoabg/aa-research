package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum dv implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    ROUTE_SELECTED(1),
    ROUTE_LABEL_SELECTED(2),
    SWIPE(3),
    CHECK(4),
    GO(5),
    RESUME(6),
    BACK(7),
    PAN(8),
    ZOOM(9),
    RECENTER(10),
    DRIVING_INSTRUCTIONS_BAR_OPENED(11),
    DRIVING_INSTRUCTIONS_BAR_COLLAPSED(12),
    MORE_DETAILS(13),
    HOV_TOGGLE(14),
    SCROLL(15),
    TOGGLE_SCREEN_MODE(16),
    UNRECOGNIZED(-1);

    private final int t;

    dv(int i2) {
        this.t = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.t;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.t);
    }
}
