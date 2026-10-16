package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum xhh implements defpackage.abpb {
    WINDOW_UNKNOWN(0),
    WINDOW_FRONT_WINDSHIELD(1),
    WINDOW_REAR_WINDSHIELD(2),
    WINDOW_ROW_1_LEFT(16),
    WINDOW_ROW_1_RIGHT(64),
    WINDOW_ROW_2_LEFT(256),
    WINDOW_ROW_2_RIGHT(1024),
    WINDOW_ROW_3_LEFT(4096),
    WINDOW_ROW_3_RIGHT(16384),
    WINDOW_ROOF_TOP_1(65536),
    WINDOW_ROOF_TOP_2(131072),
    UNRECOGNIZED(-1);

    private final int n;

    xhh(int i) {
        this.n = i;
    }

    public static defpackage.xhh b(int i) {
        if (i == 0) {
            return WINDOW_UNKNOWN;
        }
        if (i == 1) {
            return WINDOW_FRONT_WINDSHIELD;
        }
        if (i == 2) {
            return WINDOW_REAR_WINDSHIELD;
        }
        if (i == 16) {
            return WINDOW_ROW_1_LEFT;
        }
        if (i == 64) {
            return WINDOW_ROW_1_RIGHT;
        }
        if (i == 256) {
            return WINDOW_ROW_2_LEFT;
        }
        if (i == 1024) {
            return WINDOW_ROW_2_RIGHT;
        }
        if (i == 4096) {
            return WINDOW_ROW_3_LEFT;
        }
        if (i == 16384) {
            return WINDOW_ROW_3_RIGHT;
        }
        if (i == 65536) {
            return WINDOW_ROOF_TOP_1;
        }
        if (i != 131072) {
            return null;
        }
        return WINDOW_ROOF_TOP_2;
    }

    @Override // defpackage.abpb
    public final int a() {
        return this == UNRECOGNIZED ? defpackage.abpk.b() : this.n;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.n);
    }
}
