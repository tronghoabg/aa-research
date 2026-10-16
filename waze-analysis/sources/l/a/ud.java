package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ud implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    PRIMARY(1),
    SECONDARY(2),
    CARD(3),
    PRIMARY_LINK(4),
    SECONDARY_LINK(5),
    BACK(6),
    TAP_BACKGROUND(7),
    X(8),
    UNRECOGNIZED(-1);


    /* renamed from: l, reason: collision with root package name */
    private final int f55484l;

    ud(int i2) {
        this.f55484l = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55484l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55484l);
    }
}
