package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ang implements com.google.v.eg {
    MODE_UNSPECIFIED(0),
    WIFI(1),
    CELL(2),
    OTHER(3),
    NA(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f52786h;

    ang(int i2) {
        this.f52786h = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52786h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52786h);
    }
}
