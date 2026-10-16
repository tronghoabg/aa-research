package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum axa implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    SET_FAVORITE(1),
    SET_HOME(2),
    SET_WORK(3),
    CANCEL(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f53372h;

    axa(int i2) {
        this.f53372h = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53372h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53372h);
    }
}
