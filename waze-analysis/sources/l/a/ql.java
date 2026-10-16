package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ql implements com.google.v.eg {
    FALLBACK_REASON_UNSPECIFIED(0),
    TIMEOUT(1),
    LOADING_ERROR(2),
    SUGGESTIONS_DISABLED(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f55301g;

    ql(int i2) {
        this.f55301g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55301g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55301g);
    }
}
