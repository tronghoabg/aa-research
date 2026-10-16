package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bql implements com.google.v.eg {
    VOICE_INSTRUCTIONS_SOUND_UNSPECIFIED(0),
    SOUND_ON(1),
    SOUND_OFF(2),
    ALERTS_ONLY(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f54536g;

    bql(int i2) {
        this.f54536g = i2;
    }

    public static bql a(int i2) {
        if (i2 == 0) {
            return VOICE_INSTRUCTIONS_SOUND_UNSPECIFIED;
        }
        if (i2 == 1) {
            return SOUND_ON;
        }
        if (i2 == 2) {
            return SOUND_OFF;
        }
        if (i2 != 3) {
            return null;
        }
        return ALERTS_ONLY;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54536g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54536g);
    }
}
