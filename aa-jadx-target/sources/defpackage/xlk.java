package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public enum xlk implements defpackage.abpb {
    MEDIA_CODEC_AUDIO_PCM(1),
    MEDIA_CODEC_AUDIO_AAC_LC(2),
    MEDIA_CODEC_VIDEO_H264_BP(3),
    MEDIA_CODEC_AUDIO_AAC_LC_ADTS(4),
    MEDIA_CODEC_VIDEO_VP9(5),
    MEDIA_CODEC_VIDEO_AV1(6),
    MEDIA_CODEC_VIDEO_H265(7);

    public final int h;

    xlk(int i2) {
        this.h = i2;
    }

    public static defpackage.xlk b(int i2) {
        switch (i2) {
            case 1:
                return MEDIA_CODEC_AUDIO_PCM;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return MEDIA_CODEC_AUDIO_AAC_LC;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return MEDIA_CODEC_VIDEO_H264_BP;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return MEDIA_CODEC_AUDIO_AAC_LC_ADTS;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return MEDIA_CODEC_VIDEO_VP9;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return MEDIA_CODEC_VIDEO_AV1;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return MEDIA_CODEC_VIDEO_H265;
            default:
                return null;
        }
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.h);
    }
}
