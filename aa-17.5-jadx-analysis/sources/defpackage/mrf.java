package defpackage;

/* loaded from: classes2.dex */
public enum mrf {
    CALL_SHORTCUT_RECORD(3),
    ASSISTANT_SHORTCUT_RECORD(4),
    RECORD_NOT_SET(0);

    public final int d;

    mrf(int i) {
        this.d = i;
    }

    public static mrf a(int i) {
        if (i == 0) {
            return RECORD_NOT_SET;
        }
        if (i == 3) {
            return CALL_SHORTCUT_RECORD;
        }
        if (i != 4) {
            return null;
        }
        return ASSISTANT_SHORTCUT_RECORD;
    }
}
