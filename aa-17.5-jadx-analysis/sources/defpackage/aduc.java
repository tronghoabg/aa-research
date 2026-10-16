package defpackage;

/* loaded from: classes3.dex */
public enum aduc {
    NO_ERROR(0, adnq.m),
    PROTOCOL_ERROR(1, adnq.l),
    INTERNAL_ERROR(2, adnq.l),
    FLOW_CONTROL_ERROR(3, adnq.l),
    SETTINGS_TIMEOUT(4, adnq.l),
    STREAM_CLOSED(5, adnq.l),
    FRAME_SIZE_ERROR(6, adnq.l),
    REFUSED_STREAM(7, adnq.m),
    CANCEL(8, adnq.c),
    COMPRESSION_ERROR(9, adnq.l),
    CONNECT_ERROR(10, adnq.l),
    ENHANCE_YOUR_CALM(11, adnq.i.e("Bandwidth exhausted")),
    INADEQUATE_SECURITY(12, adnq.g.e("Permission denied as protocol is not secure enough to call")),
    HTTP_1_1_REQUIRED(13, adnq.d);

    private static final aduc[] p;
    public final adnq o;
    private final int r;

    static {
        aduc[] aducVarArrValues = values();
        aduc[] aducVarArr = new aduc[((int) aducVarArrValues[aducVarArrValues.length - 1].a()) + 1];
        for (aduc aducVar : aducVarArrValues) {
            aducVarArr[(int) aducVar.a()] = aducVar;
        }
        p = aducVarArr;
    }

    aduc(int i, adnq adnqVar) {
        this.r = i;
        String strConcat = "HTTP/2 error code: ".concat(String.valueOf(name()));
        String str = adnqVar.q;
        if (str != null) {
            strConcat = strConcat + " (" + str + ")";
        }
        this.o = adnqVar.e(strConcat);
    }

    public static aduc b(long j) {
        aduc[] aducVarArr = p;
        if (j >= aducVarArr.length || j < 0) {
            return null;
        }
        return aducVarArr[(int) j];
    }

    public final long a() {
        return this.r;
    }
}
