package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum aaz implements com.google.v.eg {
    SOUND_MODE_UNSPECIFIED(0),
    SOUND_ON(1),
    SOUND_OFF(2),
    ALERTS_ONLY(3),
    LESS_CHATTY(4),
    SMART_GUIDANCE(5),
    UNRECOGNIZED(-1);


    /* renamed from: i, reason: collision with root package name */
    private final int f52134i;

    aaz(int i2) {
        this.f52134i = i2;
    }

    public static aaz a(int i2) {
        if (i2 == 0) {
            return SOUND_MODE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return SOUND_ON;
        }
        if (i2 == 2) {
            return SOUND_OFF;
        }
        if (i2 == 3) {
            return ALERTS_ONLY;
        }
        if (i2 == 4) {
            return LESS_CHATTY;
        }
        if (i2 != 5) {
            return null;
        }
        return SMART_GUIDANCE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52134i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52134i);
    }
}
