package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ox implements com.google.v.eg {
    FAILURE_REASON_UNSPECIFIED(0),
    DOWNLOAD_ERROR(1),
    SELECTION_ERROR(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f55210f;

    ox(int i2) {
        this.f55210f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55210f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55210f);
    }
}
