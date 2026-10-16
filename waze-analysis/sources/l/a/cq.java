package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum cq implements com.google.v.eg {
    REASON_UNSPECIFIED(0),
    COLLISION(1),
    JAM(2),
    BELOW_SPEED_LIMIT(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f54731g;

    cq(int i2) {
        this.f54731g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54731g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54731g);
    }
}
