package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bth implements com.google.v.eg {
    ZONE_TYPE_UNSPECIFIED(0),
    AVERAGE_SPEED_CAMERA_ZONE(1),
    ENFORCEMENT_ZONE(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f54660f;

    bth(int i2) {
        this.f54660f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54660f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54660f);
    }
}
