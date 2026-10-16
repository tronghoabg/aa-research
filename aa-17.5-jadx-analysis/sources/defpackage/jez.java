package defpackage;

/* loaded from: classes.dex */
public enum jez {
    LET_HU_DECIDE("let_hu_decide", yzy.dD),
    REQUEST_FOCUS_IF_HAD_FOCUS_ON_LAST_DISCONNECT("request_focus_if_had_at_end_of_last_session", yzy.dE),
    REQUEST_FOCUS("request_focus", yzy.dF);

    public static final yfq d;
    public final String e;
    public final yzy f;

    static {
        jez jezVar = LET_HU_DECIDE;
        jez jezVar2 = REQUEST_FOCUS_IF_HAD_FOCUS_ON_LAST_DISCONNECT;
        d = yfq.s(REQUEST_FOCUS, jezVar2, jezVar);
    }

    jez(String str, yzy yzyVar) {
        this.e = str;
        this.f = yzyVar;
    }

    public static jez a(String str) {
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
        throw new IllegalArgumentException("Unknown focus mode ".concat(String.valueOf(str)));
    }
}
