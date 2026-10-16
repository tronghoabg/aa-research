package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bbq implements com.google.v.eg {
    METHOD_UNSPECIFIED(0),
    MANUAL(1),
    UNRECOGNIZED(-1);


    /* renamed from: e, reason: collision with root package name */
    private final int f53673e;

    bbq(int i2) {
        this.f53673e = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53673e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53673e);
    }
}
