package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public final class pxn {
    private static final defpackage.yhe w;
    public final defpackage.pxf q;
    public final java.lang.String r;
    public final java.lang.Throwable s;
    public final java.lang.Integer t;
    public final java.util.Map u;
    private static final defpackage.ypg v = defpackage.ypg.c("com/google/android/apps/gmm/systems/network/rpcclient/api/Status");
    public static final defpackage.pxn a = new defpackage.pxn(defpackage.pxf.HTTP_UNKNOWN_STATUS_CODE);
    public static final defpackage.pxn b = new defpackage.pxn(defpackage.pxf.REQUEST_TIMEOUT);
    public static final defpackage.pxn c = new defpackage.pxn(defpackage.pxf.IO_ERROR);
    public static final defpackage.pxn d = new defpackage.pxn(defpackage.pxf.CANCELED);
    public static final defpackage.pxn e = new defpackage.pxn(defpackage.pxf.PROTOCOL_ERROR_INVALID_CONTENT_TYPE);
    public static final defpackage.pxn f = new defpackage.pxn(defpackage.pxf.PROTOCOL_ERROR_VERSION_MISMATCH);
    public static final defpackage.pxn g = new defpackage.pxn(defpackage.pxf.MALFORMED_MESSAGE);
    public static final defpackage.pxn h = new defpackage.pxn(defpackage.pxf.HTTP_BAD_REQUEST);
    public static final defpackage.pxn i = new defpackage.pxn(defpackage.pxf.INVALID_API_TOKEN);
    public static final defpackage.pxn j = new defpackage.pxn(defpackage.pxf.HTTP_SERVER_ERROR);
    public static final defpackage.pxn k = new defpackage.pxn(defpackage.pxf.NO_CONNECTIVITY);
    public static final defpackage.pxn l = new defpackage.pxn(defpackage.pxf.UNSUPPORTED_REQUEST_TYPE);
    public static final defpackage.pxn m = new defpackage.pxn(defpackage.pxf.HTTP_NOT_FOUND);
    public static final defpackage.pxn n = new defpackage.pxn(defpackage.pxf.INVALID_GAIA_AUTH_TOKEN);
    public static final defpackage.pxn o = new defpackage.pxn(defpackage.pxf.CANNOT_CREATE_REQUEST);
    public static final defpackage.pxn p = new defpackage.pxn(defpackage.pxf.HTTP_GONE);

    static {
        defpackage.yha yhaVar = new defpackage.yha(4);
        yhaVar.f(3, defpackage.pwj.INVALID_ARGUMENT);
        yhaVar.f(9, defpackage.pwj.FAILED_PRECONDITION);
        yhaVar.f(11, defpackage.pwj.OUT_OF_RANGE);
        yhaVar.f(13, defpackage.pwj.INTERNAL);
        yhaVar.f(14, defpackage.pwj.UNAVAILABLE);
        yhaVar.f(4, defpackage.pwj.DEADLINE_EXCEEDED);
        yhaVar.f(7, defpackage.pwj.PERMISSION_DENIED);
        yhaVar.f(16, defpackage.pwj.UNAUTHENTICATED);
        w = yhaVar.d(true);
    }

    public pxn(defpackage.pxf pxfVar, java.lang.String str, java.lang.Throwable th, java.lang.Integer num, java.util.Map map) {
        this.q = pxfVar;
        this.r = str;
        this.s = th;
        this.t = num;
        this.u = map;
    }

    public static defpackage.pxn b(int i2) {
        if (i2 == 400) {
            return h;
        }
        if (i2 == 401) {
            return n;
        }
        if (i2 == 403) {
            return i;
        }
        if (i2 == 404) {
            return m;
        }
        if (i2 == 410) {
            return p;
        }
        if (i2 == 503 || i2 == 500) {
            return j;
        }
        if (i2 == 501) {
            return f;
        }
        ((defpackage.ype) ((defpackage.ype) v.h()).ai(6947)).w("HTTP_UNKNOWN_STATUS_CODE %d", i2);
        return a;
    }

    public static defpackage.pxn c(java.lang.Throwable th) {
        defpackage.pxn pxnVar;
        for (java.lang.Throwable cause = th; cause != null; cause = cause.getCause()) {
            if (cause instanceof java.util.concurrent.TimeoutException) {
                return b.d(th);
            }
            if (cause instanceof defpackage.pxo) {
                return ((defpackage.pxo) cause).a;
            }
            if (cause instanceof java.util.concurrent.CancellationException) {
                return d.d(th);
            }
            if (cause instanceof java.lang.SecurityException) {
                return b.d(th);
            }
            if (cause instanceof defpackage.adou) {
                defpackage.ador adorVar = ((defpackage.adou) cause).a;
                defpackage.adoo adooVar = defpackage.adoo.OK;
                defpackage.adoo adooVar2 = adorVar.p;
                switch (adooVar2.ordinal()) {
                    case 0:
                    case 11:
                    case 14:
                        pxnVar = a;
                        break;
                    case 1:
                        pxnVar = d;
                        break;
                    case 2:
                    case 6:
                    case 8:
                    case 10:
                    case 13:
                        pxnVar = c;
                        break;
                    case 3:
                    case 9:
                        pxnVar = h;
                        break;
                    case 4:
                        pxnVar = b;
                        break;
                    case 5:
                        pxnVar = m;
                        break;
                    case 7:
                    case 16:
                        pxnVar = n;
                        break;
                    case 12:
                        pxnVar = o;
                        break;
                    case 15:
                        pxnVar = g;
                        break;
                    default:
                        throw new java.lang.RuntimeException(null, null);
                }
                java.lang.String strName = adorVar.q;
                defpackage.pxn pxnVarD = pxnVar.d(th);
                if (strName == null) {
                    strName = adooVar2.name();
                }
                return pxnVarD.e(strName);
            }
        }
        return a.d(th);
    }

    public final defpackage.pwj a() {
        defpackage.yhe yheVar = w;
        java.lang.Integer num = this.t;
        if (yheVar.containsKey(num)) {
            return (defpackage.pwj) yheVar.get(num);
        }
        defpackage.adoo adooVar = defpackage.adoo.OK;
        switch (this.q.ordinal()) {
            case 0:
                return defpackage.pwj.PROTOCOL_ERROR_INVALID_CONTENT_TYPE;
            case 1:
                return defpackage.pwj.PROTOCOL_ERROR_VERSION_MISMATCH;
            case 2:
                return defpackage.pwj.HTTP_BAD_REQUEST;
            case 3:
                return defpackage.pwj.HTTP_NOT_FOUND;
            case 4:
                return defpackage.pwj.HTTP_SERVER_ERROR;
            case 5:
            case 11:
            case 12:
            case 14:
            default:
                return defpackage.pwj.HTTP_UNKNOWN_STATUS_CODE;
            case 6:
                return defpackage.pwj.IO_ERROR;
            case 7:
                return defpackage.pwj.NO_CONNECTIVITY;
            case 8:
                return defpackage.pwj.INVALID_API_TOKEN;
            case 9:
                return defpackage.pwj.INVALID_GAIA_AUTH_TOKEN;
            case 10:
                return defpackage.pwj.MALFORMED_MESSAGE;
            case 13:
                return defpackage.pwj.REQUEST_TIMEOUT;
            case 15:
                return defpackage.pwj.CANCELED;
            case 16:
                return defpackage.pwj.UNSUPPORTED_REQUEST_TYPE;
            case 17:
                return defpackage.pwj.CANNOT_CREATE_REQUEST;
            case 18:
                return defpackage.pwj.HTTP_GONE;
        }
    }

    public final defpackage.pxn d(java.lang.Throwable th) {
        return j$.util.Objects.equals(this.s, th) ? this : new defpackage.pxn(this.q, this.r, th, this.t, this.u);
    }

    public final defpackage.pxn e(java.lang.String str) {
        return j$.util.Objects.equals(this.r, str) ? this : new defpackage.pxn(this.q, str, this.s, this.t, this.u);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != null && (obj instanceof defpackage.pxn)) {
            return ((defpackage.pxn) obj).q.equals(this.q);
        }
        return false;
    }

    public final int hashCode() {
        return this.q.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.b("errorCode", this.q);
        xymVarBy.b("description", this.r);
        java.lang.Throwable th = this.s;
        xymVarBy.b("cause", th == null ? "" : defpackage.xzm.a(th));
        xymVarBy.b("errorDetails", defpackage.wpu.x(this.u, new defpackage.xyj(","), "="));
        return xymVarBy.toString();
    }

    private pxn(defpackage.pxf pxfVar) {
        this(pxfVar, null, null, null, defpackage.ync.a);
    }
}
