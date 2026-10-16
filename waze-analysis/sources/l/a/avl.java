package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum avl implements com.google.v.eg {
    REASON_UNSPECIFIED(0),
    NOT_NAVIGATING(1),
    PASSED_RELEVANT_SEGMENT(2),
    ROUTE_ID_MISMATCH(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f53250g;

    avl(int i2) {
        this.f53250g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53250g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53250g);
    }
}
