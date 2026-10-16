package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ahv implements com.google.v.eg {
    SOURCE_UNSPECIFIED(0),
    DEEPLINK(1),
    LEGACY_COPILOT(2),
    MARKETPLACE(3),
    SETTINGS(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f52535h;

    ahv(int i2) {
        this.f52535h = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52535h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52535h);
    }
}
