package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum ovc implements defpackage.abpb {
    AUDIO_BOTTOM_HALF_UNSPECIFIED(0),
    INIT(1),
    START(2),
    STOP(3),
    SEND_STREAM(4),
    SHUTDOWN(5);

    public final int g;

    ovc(int i) {
        this.g = i;
    }

    public static defpackage.ovc b(int i) {
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

    @Override // defpackage.abpb
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.g);
    }
}
