package defpackage;

/* loaded from: classes.dex */
public enum osx implements abnz {
    LIVE_INACTIVE(0),
    LIVE_ACTIVE(1),
    LIVE_UNAVAILABLE(2),
    LIVE_HOLD(3),
    UNRECOGNIZED(-1);

    private final int g;

    osx(int i) {
        this.g = i;
    }

    public static osx b(int i) {
        if (i == 0) {
            return LIVE_INACTIVE;
        }
        if (i == 1) {
            return LIVE_ACTIVE;
        }
        if (i == 2) {
            return LIVE_UNAVAILABLE;
        }
        if (i != 3) {
            return null;
        }
        return LIVE_HOLD;
    }

    @Override // defpackage.abnz
    public final int a() {
        return this == UNRECOGNIZED ? aboi.b() : this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
