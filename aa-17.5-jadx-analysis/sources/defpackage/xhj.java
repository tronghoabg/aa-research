package defpackage;

/* loaded from: classes.dex */
public enum xhj implements abnz {
    AUDIO_FOCUS_STATE_INVALID(0),
    AUDIO_FOCUS_STATE_GAIN(1),
    AUDIO_FOCUS_STATE_GAIN_TRANSIENT(2),
    AUDIO_FOCUS_STATE_LOSS(3),
    AUDIO_FOCUS_STATE_LOSS_TRANSIENT_CAN_DUCK(4),
    AUDIO_FOCUS_STATE_LOSS_TRANSIENT(5),
    AUDIO_FOCUS_STATE_GAIN_MEDIA_ONLY(6),
    AUDIO_FOCUS_STATE_GAIN_TRANSIENT_GUIDANCE_ONLY(7);

    public final int i;

    xhj(int i) {
        this.i = i;
    }

    public static xhj b(int i) {
        switch (i) {
            case 0:
                return AUDIO_FOCUS_STATE_INVALID;
            case 1:
                return AUDIO_FOCUS_STATE_GAIN;
            case 2:
                return AUDIO_FOCUS_STATE_GAIN_TRANSIENT;
            case 3:
                return AUDIO_FOCUS_STATE_LOSS;
            case 4:
                return AUDIO_FOCUS_STATE_LOSS_TRANSIENT_CAN_DUCK;
            case 5:
                return AUDIO_FOCUS_STATE_LOSS_TRANSIENT;
            case 6:
                return AUDIO_FOCUS_STATE_GAIN_MEDIA_ONLY;
            case 7:
                return AUDIO_FOCUS_STATE_GAIN_TRANSIENT_GUIDANCE_ONLY;
            default:
                return null;
        }
    }

    @Override // defpackage.abnz
    public final int a() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}
