package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum aes implements com.google.v.eg {
    USER_POSITION_UNSPECIFIED(0),
    APPROACHING(1),
    AT_START(2),
    WITHIN(3),
    FINISHED(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f52399h;

    aes(int i2) {
        this.f52399h = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52399h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52399h);
    }
}
