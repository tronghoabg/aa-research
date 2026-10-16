package defpackage;

/* loaded from: classes3.dex */
public enum xmj implements abnz {
    PLAYBACK_STATE_UNKNOWN(0),
    PLAYBACK_STATE_PLAYING(1),
    PLAYBACK_STATE_PAUSED(2),
    PLAYBACK_STATE_STOPPED(3),
    PLAYBACK_STATE_BUFFERING(4);

    private final int g;

    xmj(int i) {
        this.g = i;
    }

    public static xmj b(int i) {
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

    @Override // defpackage.abnz
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
