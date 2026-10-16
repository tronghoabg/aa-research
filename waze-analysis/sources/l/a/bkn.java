package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bkn implements com.google.v.eg {
    TRIGGERED_FROM_UNSPECIFIED(0),
    START_NAVIGATION(1),
    TRIP_OVERVIEW_LAUNCH(2),
    ROUTE_RECALCULATION(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f54186g;

    bkn(int i2) {
        this.f54186g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54186g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54186g);
    }
}
