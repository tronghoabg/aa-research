package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum vz implements com.google.v.eg {
    VOICE_PLAYED_STATUS_UNSPECIFIED(0),
    SUCCESS(1),
    EMPTY_MESSAGE(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f55591f;

    vz(int i2) {
        this.f55591f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55591f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55591f);
    }
}
