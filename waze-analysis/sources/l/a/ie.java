package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ie implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    CONTINUE(1),
    CLOSE(2),
    BACK(3),
    TAP_OUTSIDE(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f54969h;

    ie(int i2) {
        this.f54969h = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54969h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54969h);
    }
}
