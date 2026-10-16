package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum axr implements com.google.v.eg {
    ORIENTATION_UNSPECIFIED(0),
    LANDSCAPE(1),
    PORTRAIT(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f53414f;

    axr(int i2) {
        this.f53414f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53414f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53414f);
    }
}
