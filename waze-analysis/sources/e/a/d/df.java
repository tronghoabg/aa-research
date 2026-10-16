package e.a.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum df {
    NO_ERROR(0, e.a.ee.f47411k),
    PROTOCOL_ERROR(1, e.a.ee.f47410j),
    INTERNAL_ERROR(2, e.a.ee.f47410j),
    FLOW_CONTROL_ERROR(3, e.a.ee.f47410j),
    SETTINGS_TIMEOUT(4, e.a.ee.f47410j),
    STREAM_CLOSED(5, e.a.ee.f47410j),
    FRAME_SIZE_ERROR(6, e.a.ee.f47410j),
    REFUSED_STREAM(7, e.a.ee.f47411k),
    CANCEL(8, e.a.ee.f47402b),
    COMPRESSION_ERROR(9, e.a.ee.f47410j),
    CONNECT_ERROR(10, e.a.ee.f47410j),
    ENHANCE_YOUR_CALM(11, e.a.ee.f47407g.g("Bandwidth exhausted")),
    INADEQUATE_SECURITY(12, e.a.ee.f47405e.g("Permission denied as protocol is not secure enough to call")),
    HTTP_1_1_REQUIRED(13, e.a.ee.f47403c);

    private static final df[] o;
    private final int q;
    private final e.a.ee r;

    static {
        df[] dfVarArrValues = values();
        df[] dfVarArr = new df[((int) dfVarArrValues[dfVarArrValues.length - 1].a()) + 1];
        for (df dfVar : dfVarArrValues) {
            dfVarArr[(int) dfVar.a()] = dfVar;
        }
        o = dfVarArr;
    }

    df(int i2, e.a.ee eeVar) {
        this.q = i2;
        String strConcat = "HTTP/2 error code: ".concat(String.valueOf(name()));
        if (eeVar.i() != null) {
            strConcat = strConcat + " (" + eeVar.i() + ")";
        }
        this.r = eeVar.g(strConcat);
    }

    public static e.a.ee b(long j2) {
        df dfVarC = c(j2);
        if (dfVarC != null) {
            return dfVarC.r;
        }
        return e.a.ee.d(INTERNAL_ERROR.r.a().a()).g("Unrecognized HTTP/2 error code: " + j2);
    }

    public static df c(long j2) {
        df[] dfVarArr = o;
        if (j2 >= dfVarArr.length || j2 < 0) {
            return null;
        }
        return dfVarArr[(int) j2];
    }

    public final long a() {
        return this.q;
    }
}
