package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public enum ovd implements defpackage.abpb {
    AUDIO_FORMAT_UNSPECIFIED(0),
    STEREO_48000(1),
    MONO_16000(2),
    MONO_48000(3),
    AUDIO_FORMAT_UNKNOWN(4);

    public final int f;

    ovd(int i) {
        this.f = i;
    }

    public static defpackage.ovd b(int i) {
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

    @Override // defpackage.abpb
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
