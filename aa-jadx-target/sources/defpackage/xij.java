package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public enum xij implements defpackage.abpb {
    AUDIO_FOCUS_GAIN(1),
    AUDIO_FOCUS_GAIN_TRANSIENT(2),
    AUDIO_FOCUS_GAIN_TRANSIENT_MAY_DUCK(3),
    AUDIO_FOCUS_RELEASE(4);

    public final int e;

    xij(int i) {
        this.e = i;
    }

    public static defpackage.xij b(int i) {
        if (i == 1) {
            return AUDIO_FOCUS_GAIN;
        }
        if (i == 2) {
            return AUDIO_FOCUS_GAIN_TRANSIENT;
        }
        if (i == 3) {
            return AUDIO_FOCUS_GAIN_TRANSIENT_MAY_DUCK;
        }
        if (i != 4) {
            return null;
        }
        return AUDIO_FOCUS_RELEASE;
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
