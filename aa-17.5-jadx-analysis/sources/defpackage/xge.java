package defpackage;

/* loaded from: classes3.dex */
public enum xge implements abnz {
    SEAT_UNKNOWN(0),
    SEAT_ROW_1_LEFT(1),
    SEAT_ROW_1_CENTER(2),
    SEAT_ROW_1_RIGHT(4),
    SEAT_ROW_2_LEFT(16),
    SEAT_ROW_2_CENTER(32),
    SEAT_ROW_2_RIGHT(64),
    SEAT_ROW_3_LEFT(256),
    SEAT_ROW_3_CENTER(sk.AUDIO_CONTENT_BUFFER_SIZE),
    SEAT_ROW_3_RIGHT(1024),
    UNRECOGNIZED(-1);

    private final int m;

    xge(int i) {
        this.m = i;
    }

    public static xge b(int i) {
        if (i == 0) {
            return SEAT_UNKNOWN;
        }
        if (i == 1) {
            return SEAT_ROW_1_LEFT;
        }
        if (i == 2) {
            return SEAT_ROW_1_CENTER;
        }
        if (i == 4) {
            return SEAT_ROW_1_RIGHT;
        }
        if (i == 16) {
            return SEAT_ROW_2_LEFT;
        }
        if (i == 32) {
            return SEAT_ROW_2_CENTER;
        }
        if (i == 64) {
            return SEAT_ROW_2_RIGHT;
        }
        if (i == 256) {
            return SEAT_ROW_3_LEFT;
        }
        if (i == 512) {
            return SEAT_ROW_3_CENTER;
        }
        if (i != 1024) {
            return null;
        }
        return SEAT_ROW_3_RIGHT;
    }

    @Override // defpackage.abnz
    public final int a() {
        return this == UNRECOGNIZED ? aboi.b() : this.m;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.m);
    }
}
