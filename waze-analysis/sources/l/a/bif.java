package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bif implements com.google.v.eg {
    INCONSISTENCY_TYPE_UNSPECIFIED(0),
    MISSING_TILE(1),
    TILE_CONTENT_MISMATCH(2),
    OLD_ROUTING_TILE_VERSION(3),
    OLD_TRAFFIC_TILE_VERSION(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f54029h;

    bif(int i2) {
        this.f54029h = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54029h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54029h);
    }
}
