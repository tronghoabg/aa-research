package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public enum xik implements defpackage.abpb {
    AUDIO_FOCUS_STATE_INVALID(0),
    AUDIO_FOCUS_STATE_GAIN(1),
    AUDIO_FOCUS_STATE_GAIN_TRANSIENT(2),
    AUDIO_FOCUS_STATE_LOSS(3),
    AUDIO_FOCUS_STATE_LOSS_TRANSIENT_CAN_DUCK(4),
    AUDIO_FOCUS_STATE_LOSS_TRANSIENT(5),
    AUDIO_FOCUS_STATE_GAIN_MEDIA_ONLY(6),
    AUDIO_FOCUS_STATE_GAIN_TRANSIENT_GUIDANCE_ONLY(7);

    public final int i;

    xik(int i) {
        this.i = i;
    }

    public static defpackage.xik b(int i) {
        switch (i) {
            case defpackage.abnt.b /* 0 */:
                return AUDIO_FOCUS_STATE_INVALID;
            case 1:
                return AUDIO_FOCUS_STATE_GAIN;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return AUDIO_FOCUS_STATE_GAIN_TRANSIENT;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return AUDIO_FOCUS_STATE_LOSS;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return AUDIO_FOCUS_STATE_LOSS_TRANSIENT_CAN_DUCK;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return AUDIO_FOCUS_STATE_LOSS_TRANSIENT;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return AUDIO_FOCUS_STATE_GAIN_MEDIA_ONLY;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return AUDIO_FOCUS_STATE_GAIN_TRANSIENT_GUIDANCE_ONLY;
            default:
                return null;
        }
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.i);
    }
}
