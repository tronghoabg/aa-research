package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum akw implements com.google.v.eg {
    STATUS_UNSPECIFIED(0),
    REGULAR(1),
    WITH_BADGE(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f52647f;

    akw(int i2) {
        this.f52647f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52647f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52647f);
    }
}
