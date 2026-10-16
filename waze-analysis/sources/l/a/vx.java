package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum vx implements com.google.v.eg {
    EXPLAINABILITY_FAILURE_REASON_UNSPECIFIED(0),
    CLIENT_TIMEOUT(1),
    BACKEND_TIMEOUT(2),
    CLIENT_ERROR(3),
    BACKEND_ERROR(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f55579h;

    vx(int i2) {
        this.f55579h = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55579h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55579h);
    }
}
