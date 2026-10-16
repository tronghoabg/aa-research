package l.a;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes9.dex */
public enum mr implements com.google.v.eg {
    INTERRUPTION_REASON_UNSPECIFIED(0),
    INTERRUPTED_BY_USER(1),
    INTERRUPTED_BY_CLIENT(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f55110f;

    mr(int i2) {
        this.f55110f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55110f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55110f);
    }
}
