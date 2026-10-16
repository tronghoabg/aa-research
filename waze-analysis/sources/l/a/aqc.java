package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum aqc implements com.google.v.eg {
    TYPE_UNSPECIFIED(0),
    CAMERA(1),
    PERMANENT_HAZARD(2),
    GUARDIAN(3),
    SPEED_LIMIT_DECREASE(4),
    DANGER_ZONE(5),
    UNRECOGNIZED(-1);


    /* renamed from: i, reason: collision with root package name */
    private final int f52979i;

    aqc(int i2) {
        this.f52979i = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52979i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52979i);
    }
}
