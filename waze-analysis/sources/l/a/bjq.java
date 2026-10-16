package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bjq implements com.google.v.eg {
    TRAFFIC_TYPE_UNSPECIFIED(0),
    CHITCHAT(1),
    ACCIDENT(2),
    HAZARD(3),
    CLOSURE(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f54107h;

    bjq(int i2) {
        this.f54107h = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54107h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54107h);
    }
}
