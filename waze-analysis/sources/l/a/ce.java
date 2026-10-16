package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ce implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    THUMBS_UP(1),
    THUMBS_DOWN(2),
    REROUTE(3),
    CANCEL_REROUTE(4),
    BACK(5),
    COLLAPSE(6),
    DRAG_MAP(7),
    TAP_BACKGROUND(8),
    TIMEOUT(9),
    ALTERNATIVE_ROUTE(10),
    PERSONALIZED_END(11),
    UNRECOGNIZED(-1);

    private final int o;

    ce(int i2) {
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
