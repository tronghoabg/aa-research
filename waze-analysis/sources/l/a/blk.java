package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum blk implements com.google.v.eg {
    SELECTION_METHOD_UNSPECIFIED(0),
    DEFAULT_SELECTION(1),
    USER_CLICK(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f54240f;

    blk(int i2) {
        this.f54240f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54240f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54240f);
    }
}
