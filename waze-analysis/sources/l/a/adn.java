package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum adn implements com.google.v.eg {
    INSIGHT_CARD_STATE_UNSPECIFIED(0),
    MINI(1),
    MINI_FULL(2),
    REGULAR(3),
    EXTENDED(4),
    HIDDEN(5),
    REMOVED(6),
    LABEL(7),
    COMPACT(8),
    TEMPLATE(9),
    UNRECOGNIZED(-1);

    private final int m;

    adn(int i2) {
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
