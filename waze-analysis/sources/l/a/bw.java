package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bw implements com.google.v.eg {
    AGE_SCREEN_REGULATION_UNSPECIFIED(0),
    AADC(1),
    U18(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f54679f;

    bw(int i2) {
        this.f54679f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54679f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54679f);
    }
}
