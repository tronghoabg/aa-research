package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum xnk implements defpackage.abpb {
    PLAYBACK_STATE_UNKNOWN(0),
    PLAYBACK_STATE_PLAYING(1),
    PLAYBACK_STATE_PAUSED(2),
    PLAYBACK_STATE_STOPPED(3),
    PLAYBACK_STATE_BUFFERING(4);

    private final int g;

    xnk(int i) {
        this.g = i;
    }

    public static defpackage.xnk b(int i) {
        if (i == 0) {
            return PLAYBACK_STATE_UNKNOWN;
        }
        if (i == 1) {
            return PLAYBACK_STATE_PLAYING;
        }
        if (i == 2) {
            return PLAYBACK_STATE_PAUSED;
        }
        if (i == 3) {
            return PLAYBACK_STATE_STOPPED;
        }
        if (i != 4) {
            return null;
        }
        return PLAYBACK_STATE_BUFFERING;
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.g);
    }
}
