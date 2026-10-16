package defpackage;

/* loaded from: classes.dex */
public enum oul implements abnz {
    FOCUS_CHANGE_COMMAND_UNSPECIFIED(0),
    NONE(1),
    FOCUS_GAIN(2),
    FOCUS_LOSS(3),
    BOTTOM_HALF_SWITCH(4);

    public final int f;

    oul(int i) {
        this.f = i;
    }

    public static oul b(int i) {
        if (i == 0) {
            return FOCUS_CHANGE_COMMAND_UNSPECIFIED;
        }
        if (i == 1) {
            return NONE;
        }
        if (i == 2) {
            return FOCUS_GAIN;
        }
        if (i == 3) {
            return FOCUS_LOSS;
        }
        if (i != 4) {
            return null;
        }
        return BOTTOM_HALF_SWITCH;
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
