package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum zr implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    CONFIRM(1),
    CLOSE(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f55727f;

    zr(int i2) {
        this.f55727f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55727f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55727f);
    }
}
