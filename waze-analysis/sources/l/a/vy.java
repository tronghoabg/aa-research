package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum vy implements com.google.v.eg {
    UI_DISMISS_METHOD_UNSPECIFIED(0),
    TIMER(1),
    USER(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f55585f;

    vy(int i2) {
        this.f55585f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55585f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55585f);
    }
}
