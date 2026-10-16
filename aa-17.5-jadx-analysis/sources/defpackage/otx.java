package defpackage;

/* loaded from: classes2.dex */
public enum otx implements abnz {
    DROPPED_MICROPHONE_FRAME_REASON_UNSPECIFIED(0),
    MICROPHONE_NOT_OPEN(1),
    CLIENT_QUEUE_LIMIT_EXCEEDED(2),
    MISSING_OUTPUT_STREAM(3),
    IO_ERROR_WRITING_TO_OUTPUT_STREAM(4);

    public final int f;

    otx(int i) {
        this.f = i;
    }

    public static otx b(int i) {
        if (i == 0) {
            return DROPPED_MICROPHONE_FRAME_REASON_UNSPECIFIED;
        }
        if (i == 1) {
            return MICROPHONE_NOT_OPEN;
        }
        if (i == 2) {
            return CLIENT_QUEUE_LIMIT_EXCEEDED;
        }
        if (i == 3) {
            return MISSING_OUTPUT_STREAM;
        }
        if (i != 4) {
            return null;
        }
        return IO_ERROR_WRITING_TO_OUTPUT_STREAM;
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
