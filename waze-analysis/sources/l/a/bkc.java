package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bkc implements com.google.v.eg {
    ACTION_SUB_SOURCE_UNSPECIFIED(0),
    ROUTE_CARD(1),
    MAP_ETA_LABEL(2),
    MAP_ROUTE(3),
    TOGGLE_HOV_OFF(4),
    TOGGLE_HOV_ON(5),
    UNRECOGNIZED(-1);


    /* renamed from: i, reason: collision with root package name */
    private final int f54156i;

    bkc(int i2) {
        this.f54156i = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54156i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54156i);
    }
}
