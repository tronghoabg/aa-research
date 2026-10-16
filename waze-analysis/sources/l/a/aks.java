package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum aks implements com.google.v.eg {
    BUTTON_UNSPECIFIED(0),
    ENABLE_AUDIO_APPS(1),
    ENABLE_ALERT_WHILE_MUSIC_PLAYING(2),
    OTHER_PARTNER_APP(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f52629g;

    aks(int i2) {
        this.f52629g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52629g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52629g);
    }
}
