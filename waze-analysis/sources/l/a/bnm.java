package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bnm implements com.google.v.eg {
    SEGMENT_SELECTION_METHOD_UNSPECIFIED(0),
    NEXT_SEGMENT(1),
    DEVIATED_FROM_SEGMENT(2),
    NEXT_SEGMENT_FALLBACK(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f54349g;

    bnm(int i2) {
        this.f54349g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54349g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54349g);
    }
}
