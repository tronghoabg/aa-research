package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bl implements com.google.v.eg {
    SHOWN_AT_TOP_UNSPECIFIED(0),
    NEAREST(1),
    POPULAR(2),
    NONE(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f54216g;

    bl(int i2) {
        this.f54216g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54216g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54216g);
    }
}
