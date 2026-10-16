package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum agq implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    OS_SETTINGS(1),
    CLOSE(2),
    ALLOW(3),
    TAP_OUTSIDE(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f52468h;

    agq(int i2) {
        this.f52468h = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52468h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52468h);
    }
}
