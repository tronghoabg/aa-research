package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum axh implements com.google.v.eg {
    TYPE_UNSPECIFIED(0),
    HOME(1),
    OTHER_PLACE(2),
    WORK(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f53387g;

    axh(int i2) {
        this.f53387g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53387g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53387g);
    }
}
