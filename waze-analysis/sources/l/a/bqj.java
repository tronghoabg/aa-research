package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bqj implements com.google.v.eg {
    VOICE_TYPE_UNSPECIFIED(0),
    TTS(1),
    PROMPT(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f54529f;

    bqj(int i2) {
        this.f54529f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54529f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54529f);
    }
}
