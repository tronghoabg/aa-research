package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum apt implements com.google.v.eg {
    SOURCE_UNSPECIFIED(0),
    CACHE(1),
    SERVER(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f52948f;

    apt(int i2) {
        this.f52948f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52948f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52948f);
    }
}
