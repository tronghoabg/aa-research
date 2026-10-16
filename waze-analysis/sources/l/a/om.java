package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum om implements com.google.v.eg {
    COMPONENT_TYPE_UNSPECIFIED(0),
    STT_COMPONENT(1),
    TTS_COMPONENT(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f55191f;

    om(int i2) {
        this.f55191f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55191f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55191f);
    }
}
