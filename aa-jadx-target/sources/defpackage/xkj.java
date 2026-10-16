package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public enum xkj implements defpackage.abpb {
    FEEDBACK_SELECT(1),
    FEEDBACK_FOCUS_CHANGE(2),
    FEEDBACK_DRAG_SELECT(3),
    FEEDBACK_DRAG_START(4),
    FEEDBACK_DRAG_END(5);

    public final int f;

    xkj(int i) {
        this.f = i;
    }

    public static defpackage.xkj b(int i) {
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

    @Override // defpackage.abpb
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
