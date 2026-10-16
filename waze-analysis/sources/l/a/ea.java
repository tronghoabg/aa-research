package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ea implements com.google.v.eg {
    MODE_UNSPECIFIED(0),
    MAP(1),
    LIST(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f54829f;

    ea(int i2) {
        this.f54829f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54829f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54829f);
    }
}
