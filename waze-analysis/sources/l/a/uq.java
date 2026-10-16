package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum uq implements com.google.v.eg {
    REASON_UNSPECIFIED(0),
    ENCOURAGEMENT_SHOWN(1),
    NAVIGATING(2),
    NO_IMAGE(3),
    POPUP_SHOWN(4),
    RESUMING_NAV_POPUP(5),
    IN_CAR_PROJECTED_CONNECTED(6),
    DEEPLINK(7),
    BAD_PARAMS(8),
    FLAG_TO_PROTO_MISMATCH(9),
    UNRECOGNIZED(-1);

    private final int m;

    uq(int i2) {
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
