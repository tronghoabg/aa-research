package defpackage;

/* loaded from: classes.dex */
public enum xkj implements abnz {
    MEDIA_CODEC_AUDIO_PCM(1),
    MEDIA_CODEC_AUDIO_AAC_LC(2),
    MEDIA_CODEC_VIDEO_H264_BP(3),
    MEDIA_CODEC_AUDIO_AAC_LC_ADTS(4),
    MEDIA_CODEC_VIDEO_VP9(5),
    MEDIA_CODEC_VIDEO_AV1(6),
    MEDIA_CODEC_VIDEO_H265(7);

    public final int h;

    xkj(int i2) {
        this.h = i2;
    }

    public static xkj b(int i2) {
        switch (i2) {
            case 1:
                return MEDIA_CODEC_AUDIO_PCM;
            case 2:
                return MEDIA_CODEC_AUDIO_AAC_LC;
            case 3:
                return MEDIA_CODEC_VIDEO_H264_BP;
            case 4:
                return MEDIA_CODEC_AUDIO_AAC_LC_ADTS;
            case 5:
                return MEDIA_CODEC_VIDEO_VP9;
            case 6:
                return MEDIA_CODEC_VIDEO_AV1;
            case 7:
                return MEDIA_CODEC_VIDEO_H265;
            default:
                return null;
        }
    }

    @Override // defpackage.abnz
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
