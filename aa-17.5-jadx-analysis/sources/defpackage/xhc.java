package defpackage;

/* loaded from: classes.dex */
public enum xhc implements abnz {
    ACTION_UNKNOWN(0),
    ACTION_RESIZE_TO_SMALLER(1),
    ACTION_RESIZE_TO_LARGER(2);

    public final int d;

    xhc(int i) {
        this.d = i;
    }

    public static xhc b(int i) {
        if (i == 0) {
            return ACTION_UNKNOWN;
        }
        if (i == 1) {
            return ACTION_RESIZE_TO_SMALLER;
        }
        if (i != 2) {
            return null;
        }
        return ACTION_RESIZE_TO_LARGER;
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
