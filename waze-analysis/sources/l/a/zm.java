package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum zm implements com.google.v.eg {
    FAILURE_REASON_UNSPECIFIED(0),
    DEVELOPER_ERROR(1),
    GMS_UNAVAILABLE(2),
    NETWORK_ERROR(3),
    SERVICE_ERROR(4),
    INTERNAL_ERROR(5),
    UNRECOGNIZED(-1);


    /* renamed from: i, reason: collision with root package name */
    private final int f55710i;

    zm(int i2) {
        this.f55710i = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55710i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55710i);
    }
}
