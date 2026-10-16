package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum adg implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    PRIMARY_BUTTON(1),
    SECONDARY_BUTTON(2),
    CLOSE(3),
    GENERAL_CARD_TAP(4),
    EMPTY_MAP_CLICK(5),
    BACK_CLICK(6),
    TIMEOUT(7),
    SYSTEM_DISMISSED(8),
    FAILED_TO_PRESENT(9),
    UNRECOGNIZED(-1);

    private final int m;

    adg(int i2) {
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
