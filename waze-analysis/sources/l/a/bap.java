package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bap implements com.google.v.eg {
    ERROR_SOURCE_UNSPECIFIED(0),
    CLIENT(1),
    SERVER(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f53618f;

    bap(int i2) {
        this.f53618f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53618f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53618f);
    }
}
