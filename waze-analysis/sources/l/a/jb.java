package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum jb implements com.google.v.eg {
    CARPLAY_NEW_MODE_UNSPECIFIED(0),
    CARPLAY_NEW_MODE_DASHBOARD(1),
    CARPLAY_NEW_MODE_FULL_SCREEN(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f54987f;

    jb(int i2) {
        this.f54987f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54987f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54987f);
    }
}
