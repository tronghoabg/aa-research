package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum aui implements com.google.v.eg {
    USE_CASE_UNSPECIFIED(0),
    CONVERSATIONAL_REPORTING(1),
    TAP_REPORTING(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f53203f;

    aui(int i2) {
        this.f53203f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53203f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53203f);
    }
}
