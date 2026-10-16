package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public enum ouo implements defpackage.abpb {
    AUDIO_STREAMING_STATUS_UNSPECIFIED(0),
    STREAMING(1),
    NOT_STREAMING(2);

    public final int d;

    ouo(int i) {
        this.d = i;
    }

    public static defpackage.ouo b(int i) {
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

    @Override // defpackage.abpb
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.d);
    }
}
