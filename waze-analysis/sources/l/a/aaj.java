package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum aaj implements com.google.v.eg {
    GOOGLE_ASSISTANT_SOURCE_UNSPECIFIED(0),
    HOTWORD(1),
    MIC_INVOCATION(2),
    ON_MAP_MIC(3),
    SEARCH_EMPTY_STATE_MIC(4),
    START_STATE_MIC(5),
    UNRECOGNIZED(-1);


    /* renamed from: i, reason: collision with root package name */
    private final int f52093i;

    aaj(int i2) {
        this.f52093i = i2;
    }

    public static aaj a(int i2) {
        if (i2 == 0) {
            return GOOGLE_ASSISTANT_SOURCE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return HOTWORD;
        }
        if (i2 == 2) {
            return MIC_INVOCATION;
        }
        if (i2 == 3) {
            return ON_MAP_MIC;
        }
        if (i2 == 4) {
            return SEARCH_EMPTY_STATE_MIC;
        }
        if (i2 != 5) {
            return null;
        }
        return START_STATE_MIC;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52093i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52093i);
    }
}
