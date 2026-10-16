package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum blv implements com.google.v.eg {
    IN_CAR_SCREEN_TYPE_UNSPECIFIED(0),
    PANE_VIEW(1),
    LIST_VIEW(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f54258f;

    blv(int i2) {
        this.f54258f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54258f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54258f);
    }
}
