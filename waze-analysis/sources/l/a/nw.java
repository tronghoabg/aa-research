package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum nw implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    TURN_ON(1),
    CLOSE(2),
    BACK(3),
    TAP_OUTSIDE(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f55168h;

    nw(int i2) {
        this.f55168h = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55168h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55168h);
    }
}
