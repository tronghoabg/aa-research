package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum np implements com.google.v.eg {
    STATUS_UNSPECIFIED(0),
    OK(1),
    DONT_ALLOW(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f55154f;

    np(int i2) {
        this.f55154f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55154f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55154f);
    }
}
