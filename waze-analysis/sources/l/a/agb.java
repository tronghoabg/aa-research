package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum agb implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    CLOSE(1),
    CLICKED_LEADING_BUTTON(2),
    CLICKED_TRAILING_BUTTON(3),
    GENERAL_CARD_CLICK(4),
    TIMEOUT(5),
    CLOSED_BY_APP(6),
    TAPPED_MAP(7),
    DRAGGED_MAP(8),
    SWIPED_TO_DISMISS(9),
    UNRECOGNIZED(-1);

    private final int m;

    agb(int i2) {
        this.m = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.m;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.m);
    }
}
