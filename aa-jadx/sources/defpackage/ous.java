package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum ous implements defpackage.abpb {
    AUDIO_CODEC_TYPE_UNSPECIFIED(0),
    PCM(1),
    AAC_LC(2),
    AAC_LC_ADTS(3);

    public final int e;

    ous(int i) {
        this.e = i;
    }

    public static defpackage.ous b(int i) {
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

    @Override // defpackage.abpb
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
