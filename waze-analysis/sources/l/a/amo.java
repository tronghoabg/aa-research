package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum amo implements com.google.v.eg {
    SOURCE_UNSPECIFIED(0),
    FAVORITE(1),
    HISTORY(2),
    MAP(3),
    RESUME_NAV(4),
    SEARCH(5),
    TOP_FAVORITE(6),
    UNRECOGNIZED(-1);


    /* renamed from: j, reason: collision with root package name */
    private final int f52752j;

    amo(int i2) {
        this.f52752j = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52752j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52752j);
    }
}
