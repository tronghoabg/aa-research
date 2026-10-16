package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum tk implements com.google.v.eg {
    FREQUENCY_UNSPECIFIED(0),
    EVERY_COLD_START(1),
    DAILY(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f55452f;

    tk(int i2) {
        this.f55452f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55452f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55452f);
    }
}
