package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum sl implements com.google.v.eg {
    STATUS_UNSPECIFIED(0),
    NETWORK_ERROR(1),
    NO_MATCH_ERROR(2),
    NO_PERMISSIONS(3),
    SPEECH_TIMEOUT_ERROR(4),
    UNSPECIFIED_ERROR(5),
    SUCCESS(6),
    UNRECOGNIZED(-1);


    /* renamed from: j, reason: collision with root package name */
    private final int f55412j;

    sl(int i2) {
        this.f55412j = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55412j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55412j);
    }
}
