package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bbk implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    SET_HOME(1),
    SET_WORK(2),
    SKIP(3),
    DONE(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f53668h;

    bbk(int i2) {
        this.f53668h = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53668h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53668h);
    }
}
