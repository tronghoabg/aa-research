package defpackage;

/* loaded from: classes3.dex */
public enum xgc implements abnz {
    DOOR_UNKNOWN(0),
    DOOR_ROW_1_LEFT(1),
    DOOR_ROW_1_RIGHT(4),
    DOOR_ROW_2_LEFT(16),
    DOOR_ROW_2_RIGHT(64),
    DOOR_ROW_3_LEFT(256),
    DOOR_ROW_3_RIGHT(1024),
    DOOR_HOOD(268435456),
    DOOR_REAR(536870912),
    UNRECOGNIZED(-1);

    private final int l;

    xgc(int i) {
        this.l = i;
    }

    public static xgc b(int i) {
        if (i == 0) {
            return DOOR_UNKNOWN;
        }
        if (i == 1) {
            return DOOR_ROW_1_LEFT;
        }
        if (i == 4) {
            return DOOR_ROW_1_RIGHT;
        }
        if (i == 16) {
            return DOOR_ROW_2_LEFT;
        }
        if (i == 64) {
            return DOOR_ROW_2_RIGHT;
        }
        if (i == 256) {
            return DOOR_ROW_3_LEFT;
        }
        if (i == 1024) {
            return DOOR_ROW_3_RIGHT;
        }
        if (i == 268435456) {
            return DOOR_HOOD;
        }
        if (i != 536870912) {
            return null;
        }
        return DOOR_REAR;
    }

    @Override // defpackage.abnz
    public final int a() {
        return this == UNRECOGNIZED ? aboi.b() : this.l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.l);
    }
}
