package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum azd implements com.google.v.eg {
    SEARCH_CONTEXT_UNSPECIFIED(0),
    MAIN_MAP(1),
    TRIP_OVERVIEW_ORIGIN(2),
    TRIP_OVERVIEW_DESTINATION(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f53478g;

    azd(int i2) {
        this.f53478g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53478g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53478g);
    }
}
