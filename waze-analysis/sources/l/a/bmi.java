package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bmi implements com.google.v.eg {
    TTS_SOURCE_UNSPECIFIED(0),
    CACHE(1),
    DOWNLOAD(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f54298f;

    bmi(int i2) {
        this.f54298f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54298f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54298f);
    }
}
