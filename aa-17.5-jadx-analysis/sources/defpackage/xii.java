package defpackage;

/* loaded from: classes3.dex */
public enum xii implements abnz {
    CAR_LOCAL_MEDIA_PLAYBACK_PLAY(0),
    CAR_LOCAL_MEDIA_PLAYBACK_PAUSE(1),
    CAR_LOCAL_MEDIA_PLAYBACK_PREVIOUS(2),
    CAR_LOCAL_MEDIA_PLAYBACK_NEXT(3),
    CAR_LOCAL_MEDIA_PLAYBACK_STOP(4);

    public final int f;

    xii(int i) {
        this.f = i;
    }

    public static xii b(int i) {
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

    @Override // defpackage.abnz
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
