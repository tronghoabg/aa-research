package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum aqx implements com.google.v.eg {
    STATE_UNSPECIFIED(0),
    HAS_PLANNED_DRIVES(1),
    NO_ACTIVE_PLANNED_DRIVES(2),
    NO_ACTIVE_AND_NO_PAST_PLANNED_DRIVES(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f53042g;

    aqx(int i2) {
        this.f53042g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53042g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53042g);
    }
}
