package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum xqh implements defpackage.abpb {
    UNKNOWN(0),
    PHONE_SCREEN_OFF(1),
    LAUNCH_NATIVE(2),
    VIDEO_FOCUS_REASON_LAST_MODE(3),
    VIDEO_FOCUS_REASON_USER_SELECTION(4);

    public final int f;

    xqh(int i) {
        this.f = i;
    }

    public static defpackage.xqh b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return PHONE_SCREEN_OFF;
        }
        if (i == 2) {
            return LAUNCH_NATIVE;
        }
        if (i == 3) {
            return VIDEO_FOCUS_REASON_LAST_MODE;
        }
        if (i != 4) {
            return null;
        }
        return VIDEO_FOCUS_REASON_USER_SELECTION;
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
