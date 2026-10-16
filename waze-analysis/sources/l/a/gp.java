package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum gp implements com.google.v.eg {
    TYPE_UNSPECIFIED(0),
    PLACE(1),
    CONTACT(2),
    FAVORITE(3),
    HISTORY(4),
    QUERY(5),
    RETURN(6),
    SEARCH(7),
    ALGO_TRANSPARENCY_LINK(8),
    UNRECOGNIZED(-1);


    /* renamed from: l, reason: collision with root package name */
    private final int f54936l;

    gp(int i2) {
        this.f54936l = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54936l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54936l);
    }
}
