package defpackage;

/* loaded from: classes.dex */
public enum otr implements abnz {
    AUDIO_STREAMING_STATUS_UNSPECIFIED(0),
    STREAMING(1),
    NOT_STREAMING(2);

    public final int d;

    otr(int i) {
        this.d = i;
    }

    public static otr b(int i) {
        if (i == 0) {
            return AUDIO_STREAMING_STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return STREAMING;
        }
        if (i != 2) {
            return null;
        }
        return NOT_STREAMING;
    }

    @Override // defpackage.abnz
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
