package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum auh implements com.google.v.eg {
    TRIGGER_UNSPECIFIED(0),
    START_NAVIGATION(1),
    ZERO_SPEED(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f53197f;

    auh(int i2) {
        this.f53197f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53197f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53197f);
    }
}
