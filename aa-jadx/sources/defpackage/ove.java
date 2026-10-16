package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum ove implements defpackage.abpb {
    AUDIO_STREAM_TYPE_UNSPECIFIED(0),
    GUIDANCE(1),
    SYSTEM_AUDIO(2),
    MEDIA(3),
    TELEPHONY(4);

    public final int f;

    ove(int i) {
        this.f = i;
    }

    public static defpackage.ove b(int i) {
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

    @Override // defpackage.abpb
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
