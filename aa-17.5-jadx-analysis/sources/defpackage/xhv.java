package defpackage;

/* loaded from: classes3.dex */
public enum xhv implements abnz {
    USER_SELECTION(1),
    DEVICE_SWITCH(2),
    NOT_SUPPORTED(3),
    NOT_CURRENTLY_SUPPORTED(4),
    PROBE_SUPPORTED(5),
    WIRELESS_PROJECTION_DISABLED(6),
    POWER_DOWN(7),
    USER_PROFILE_SWITCH(8);

    public final int i;

    xhv(int i) {
        this.i = i;
    }

    public static xhv b(int i) {
        switch (i) {
            case 1:
                return USER_SELECTION;
            case 2:
                return DEVICE_SWITCH;
            case 3:
                return NOT_SUPPORTED;
            case 4:
                return NOT_CURRENTLY_SUPPORTED;
            case 5:
                return PROBE_SUPPORTED;
            case 6:
                return WIRELESS_PROJECTION_DISABLED;
            case 7:
                return POWER_DOWN;
            case 8:
                return USER_PROFILE_SWITCH;
            default:
                return null;
        }
    }

    @Override // defpackage.abnz
    public final int a() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}
