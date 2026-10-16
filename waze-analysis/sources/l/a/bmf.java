package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bmf implements com.google.v.eg {
    TTS_DOWNLOAD_REQUEST_RESULT_UNSPECIFIED(0),
    SUCCESS(1),
    VOICES_SERVER_ERROR(2),
    DOWNLOAD_ERROR(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f54292g;

    bmf(int i2) {
        this.f54292g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54292g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54292g);
    }
}
