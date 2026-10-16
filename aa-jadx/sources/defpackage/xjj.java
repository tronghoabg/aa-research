package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum xjj implements defpackage.abpb {
    CAR_LOCAL_MEDIA_PLAYBACK_PLAY(0),
    CAR_LOCAL_MEDIA_PLAYBACK_PAUSE(1),
    CAR_LOCAL_MEDIA_PLAYBACK_PREVIOUS(2),
    CAR_LOCAL_MEDIA_PLAYBACK_NEXT(3),
    CAR_LOCAL_MEDIA_PLAYBACK_STOP(4);

    public final int f;

    xjj(int i) {
        this.f = i;
    }

    public static defpackage.xjj b(int i) {
        if (i == 0) {
            return CAR_LOCAL_MEDIA_PLAYBACK_PLAY;
        }
        if (i == 1) {
            return CAR_LOCAL_MEDIA_PLAYBACK_PAUSE;
        }
        if (i == 2) {
            return CAR_LOCAL_MEDIA_PLAYBACK_PREVIOUS;
        }
        if (i == 3) {
            return CAR_LOCAL_MEDIA_PLAYBACK_NEXT;
        }
        if (i != 4) {
            return null;
        }
        return CAR_LOCAL_MEDIA_PLAYBACK_STOP;
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
