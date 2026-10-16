package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum nd implements com.google.v.eg {
    FIRST_SPEAKER_UNSPECIFIED(0),
    FIRST_SPEAKER_AGENT(1),
    FIRST_SPEAKER_USER(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f55136f;

    nd(int i2) {
        this.f55136f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55136f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55136f);
    }
}
