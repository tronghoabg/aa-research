package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum xf implements com.google.v.eg {
    CANVAS_TAG_UNSPECIFIED(0),
    MAIN_CANVAS(1),
    UNRECOGNIZED(-1);


    /* renamed from: e, reason: collision with root package name */
    private final int f55628e;

    xf(int i2) {
        this.f55628e = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55628e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55628e);
    }
}
