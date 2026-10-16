package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum blp implements com.google.v.eg {
    MODE_UNSPECIFIED(0),
    PANE_VIEW_MODE(1),
    LIST_VIEW_MODE(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f54246f;

    blp(int i2) {
        this.f54246f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54246f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54246f);
    }
}
