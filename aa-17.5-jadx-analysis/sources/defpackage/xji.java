package defpackage;

/* loaded from: classes.dex */
public enum xji implements abnz {
    FEEDBACK_SELECT(1),
    FEEDBACK_FOCUS_CHANGE(2),
    FEEDBACK_DRAG_SELECT(3),
    FEEDBACK_DRAG_START(4),
    FEEDBACK_DRAG_END(5);

    public final int f;

    xji(int i) {
        this.f = i;
    }

    public static xji b(int i) {
        if (i == 1) {
            return FEEDBACK_SELECT;
        }
        if (i == 2) {
            return FEEDBACK_FOCUS_CHANGE;
        }
        if (i == 3) {
            return FEEDBACK_DRAG_SELECT;
        }
        if (i == 4) {
            return FEEDBACK_DRAG_START;
        }
        if (i != 5) {
            return null;
        }
        return FEEDBACK_DRAG_END;
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
