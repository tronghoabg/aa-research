package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum advc {
    NO_ERROR(0, defpackage.ador.m),
    PROTOCOL_ERROR(1, defpackage.ador.l),
    INTERNAL_ERROR(2, defpackage.ador.l),
    FLOW_CONTROL_ERROR(3, defpackage.ador.l),
    SETTINGS_TIMEOUT(4, defpackage.ador.l),
    STREAM_CLOSED(5, defpackage.ador.l),
    FRAME_SIZE_ERROR(6, defpackage.ador.l),
    REFUSED_STREAM(7, defpackage.ador.m),
    CANCEL(8, defpackage.ador.c),
    COMPRESSION_ERROR(9, defpackage.ador.l),
    CONNECT_ERROR(10, defpackage.ador.l),
    ENHANCE_YOUR_CALM(11, defpackage.ador.i.e("Bandwidth exhausted")),
    INADEQUATE_SECURITY(12, defpackage.ador.g.e("Permission denied as protocol is not secure enough to call")),
    HTTP_1_1_REQUIRED(13, defpackage.ador.d);

    private static final defpackage.advc[] p;
    public final defpackage.ador o;
    private final int r;

    static {
        defpackage.advc[] advcVarArrValues = values();
        defpackage.advc[] advcVarArr = new defpackage.advc[((int) advcVarArrValues[advcVarArrValues.length - 1].a()) + 1];
        for (defpackage.advc advcVar : advcVarArrValues) {
            advcVarArr[(int) advcVar.a()] = advcVar;
        }
        p = advcVarArr;
    }

    advc(int i, defpackage.ador adorVar) {
        this.r = i;
        java.lang.String strConcat = "HTTP/2 error code: ".concat(java.lang.String.valueOf(name()));
        java.lang.String str = adorVar.q;
        if (str != null) {
            strConcat = strConcat + " (" + str + ")";
        }
        this.o = adorVar.e(strConcat);
    }

    public static defpackage.advc b(long j) {
        defpackage.advc[] advcVarArr = p;
        if (j >= advcVarArr.length || j < 0) {
            return null;
        }
        return advcVarArr[(int) j];
    }

    public final long a() {
        return this.r;
    }
}
