package defpackage;

/* loaded from: classes.dex */
public enum ouf implements abnz {
    AUDIO_BOTTOM_HALF_UNSPECIFIED(0),
    INIT(1),
    START(2),
    STOP(3),
    SEND_STREAM(4),
    SHUTDOWN(5);

    public final int g;

    ouf(int i) {
        this.g = i;
    }

    public static ouf b(int i) {
        if (i == 0) {
            return AUDIO_BOTTOM_HALF_UNSPECIFIED;
        }
        if (i == 1) {
            return INIT;
        }
        if (i == 2) {
            return START;
        }
        if (i == 3) {
            return STOP;
        }
        if (i == 4) {
            return SEND_STREAM;
        }
        if (i != 5) {
            return null;
        }
        return SHUTDOWN;
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
