package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public enum jfh {
    LET_HU_DECIDE("let_hu_decide", defpackage.zbd.dD),
    REQUEST_FOCUS_IF_HAD_FOCUS_ON_LAST_DISCONNECT("request_focus_if_had_at_end_of_last_session", defpackage.zbd.dE),
    REQUEST_FOCUS("request_focus", defpackage.zbd.dF);

    public static final defpackage.ygw d;
    public final java.lang.String e;
    public final defpackage.zbd f;

    static {
        defpackage.jfh jfhVar = LET_HU_DECIDE;
        defpackage.jfh jfhVar2 = REQUEST_FOCUS_IF_HAD_FOCUS_ON_LAST_DISCONNECT;
        d = defpackage.ygw.s(REQUEST_FOCUS, jfhVar2, jfhVar);
    }

    jfh(java.lang.String str, defpackage.zbd zbdVar) {
        this.e = str;
        this.f = zbdVar;
    }

    public static defpackage.jfh a(java.lang.String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -825751114) {
            if (iHashCode != 1733968680) {
                if (iHashCode == 2105237412 && str.equals("request_focus_if_had_at_end_of_last_session")) {
                    return REQUEST_FOCUS_IF_HAD_FOCUS_ON_LAST_DISCONNECT;
                }
            } else if (str.equals("request_focus")) {
                return REQUEST_FOCUS;
            }
        } else if (str.equals("let_hu_decide")) {
            return LET_HU_DECIDE;
        }
        throw new java.lang.IllegalArgumentException("Unknown focus mode ".concat(java.lang.String.valueOf(str)));
    }
}
