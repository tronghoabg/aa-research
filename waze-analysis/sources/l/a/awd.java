package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum awd implements com.google.v.eg {
    ACTIVE_SNAPPER_UNSPECIFIED(0),
    MATCHER(1),
    ROAD_SNAPPER(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f53306f;

    awd(int i2) {
        this.f53306f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53306f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53306f);
    }
}
