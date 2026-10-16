package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ay implements com.google.v.eg {
    SOURCE_UNSPECIFIED(0),
    PIN(1),
    LIST(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f53426f;

    ay(int i2) {
        this.f53426f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53426f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53426f);
    }
}
