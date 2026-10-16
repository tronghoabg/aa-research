package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bnj implements com.google.v.eg {
    REASON_UNSPECIFIED(0),
    CLOSE(1),
    CANCEL(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f54342f;

    bnj(int i2) {
        this.f54342f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54342f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54342f);
    }
}
