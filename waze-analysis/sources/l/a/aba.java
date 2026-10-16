package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum aba implements com.google.v.eg {
    SOURCE_UNSPECIFIED(0),
    MAP_SCREEN_SOUND_ICON(1),
    SOUND_SETTINGS(2),
    DEEPLINK(3),
    COMPANINIO(4),
    NEW_USER_DEFAULT(5),
    UNRECOGNIZED(-1);


    /* renamed from: i, reason: collision with root package name */
    private final int f52143i;

    aba(int i2) {
        this.f52143i = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52143i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52143i);
    }
}
