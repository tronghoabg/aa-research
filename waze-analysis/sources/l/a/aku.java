package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum aku implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    ACCOUNT(1),
    CLOSE(2),
    CONTRIBUTION_FEED(3),
    HOME_WORK(4),
    ACCOUNT_BOX(5),
    MOOD(6),
    REGISTER_TOOLTIP(7),
    SETTINGS(8),
    STORES(9),
    UNRECOGNIZED(-1);

    private final int m;

    aku(int i2) {
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
