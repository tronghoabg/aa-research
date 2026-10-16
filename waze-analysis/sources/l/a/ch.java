package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ch implements com.google.v.eg {
    TIMER_DEFAULT_UNSPECIFIED(0),
    ACCEPT(1),
    REJECT(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f54716f;

    ch(int i2) {
        this.f54716f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54716f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54716f);
    }
}
