package defpackage;

/* loaded from: classes.dex */
public enum ouh implements abnz {
    AUDIO_STREAM_TYPE_UNSPECIFIED(0),
    GUIDANCE(1),
    SYSTEM_AUDIO(2),
    MEDIA(3),
    TELEPHONY(4);

    public final int f;

    ouh(int i) {
        this.f = i;
    }

    public static ouh b(int i) {
        if (i == 0) {
            return AUDIO_STREAM_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return GUIDANCE;
        }
        if (i == 2) {
            return SYSTEM_AUDIO;
        }
        if (i == 3) {
            return MEDIA;
        }
        if (i != 4) {
            return null;
        }
        return TELEPHONY;
    }

    @Override // defpackage.abnz
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
