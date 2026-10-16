package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum sa implements com.google.v.eg {
    REMOVE_TYPE_UNSPECIFIED(0),
    INVALID(1),
    UNRECOGNIZED(-1);


    /* renamed from: e, reason: collision with root package name */
    private final int f55387e;

    sa(int i2) {
        this.f55387e = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55387e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55387e);
    }
}
