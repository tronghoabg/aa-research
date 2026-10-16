package defpackage;

/* loaded from: classes.dex */
public enum otv implements abnz {
    AUDIO_CODEC_TYPE_UNSPECIFIED(0),
    PCM(1),
    AAC_LC(2),
    AAC_LC_ADTS(3);

    public final int e;

    otv(int i) {
        this.e = i;
    }

    public static otv b(int i) {
        if (i == 0) {
            return AUDIO_CODEC_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return PCM;
        }
        if (i == 2) {
            return AAC_LC;
        }
        if (i != 3) {
            return null;
        }
        return AAC_LC_ADTS;
    }

    @Override // defpackage.abnz
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
