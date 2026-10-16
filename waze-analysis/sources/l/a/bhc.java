package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bhc implements com.google.v.eg {
    SUGGESTION_TYPE_UNSPECIFIED(0),
    RESUME(1),
    PREDICTION(2),
    PLANNED_DRIVE(3),
    CALENDAR(4),
    ETA_CHECK(5),
    UNRECOGNIZED(-1);


    /* renamed from: i, reason: collision with root package name */
    private final int f53992i;

    bhc(int i2) {
        this.f53992i = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53992i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53992i);
    }
}
