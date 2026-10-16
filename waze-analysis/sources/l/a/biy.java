package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum biy implements com.google.v.eg {
    ACTION_SOURCE_UNSPECIFIED(0),
    ETA_SCREEN(1),
    TRIP_OVERVIEW_SCREEN(2),
    ALTERNATE_ROUTES_SCREEN(3),
    UNKNOWN(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f54059h;

    biy(int i2) {
        this.f54059h = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54059h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54059h);
    }
}
