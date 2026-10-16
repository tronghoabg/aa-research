package defpackage;

/* loaded from: classes.dex */
public enum oug implements abnz {
    AUDIO_FORMAT_UNSPECIFIED(0),
    STEREO_48000(1),
    MONO_16000(2),
    MONO_48000(3),
    AUDIO_FORMAT_UNKNOWN(4);

    public final int f;

    oug(int i) {
        this.f = i;
    }

    public static oug b(int i) {
        if (i == 0) {
            return AUDIO_FORMAT_UNSPECIFIED;
        }
        if (i == 1) {
            return STEREO_48000;
        }
        if (i == 2) {
            return MONO_16000;
        }
        if (i == 3) {
            return MONO_48000;
        }
        if (i != 4) {
            return null;
        }
        return AUDIO_FORMAT_UNKNOWN;
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
