package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bke implements com.google.v.eg {
    TIMER_BEHAVIOR_UNSPECIFIED(0),
    GPS_WITH_FALLBACK_ROAMING(1),
    OFF(2),
    ROAMING(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f54163g;

    bke(int i2) {
        this.f54163g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54163g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54163g);
    }
}
