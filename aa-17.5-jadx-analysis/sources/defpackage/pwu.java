package defpackage;

import j$.util.Objects;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

@Deprecated
/* loaded from: classes2.dex */
public final class pwu {
    private static final yfy w;
    public final pwm q;
    public final String r;
    public final Throwable s;
    public final Integer t;
    public final Map u;
    private static final yob v = yob.c("com/google/android/apps/gmm/systems/network/rpcclient/api/Status");
    public static final pwu a = new pwu(pwm.HTTP_UNKNOWN_STATUS_CODE);
    public static final pwu b = new pwu(pwm.REQUEST_TIMEOUT);
    public static final pwu c = new pwu(pwm.IO_ERROR);
    public static final pwu d = new pwu(pwm.CANCELED);
    public static final pwu e = new pwu(pwm.PROTOCOL_ERROR_INVALID_CONTENT_TYPE);
    public static final pwu f = new pwu(pwm.PROTOCOL_ERROR_VERSION_MISMATCH);
    public static final pwu g = new pwu(pwm.MALFORMED_MESSAGE);
    public static final pwu h = new pwu(pwm.HTTP_BAD_REQUEST);
    public static final pwu i = new pwu(pwm.INVALID_API_TOKEN);
    public static final pwu j = new pwu(pwm.HTTP_SERVER_ERROR);
    public static final pwu k = new pwu(pwm.NO_CONNECTIVITY);
    public static final pwu l = new pwu(pwm.UNSUPPORTED_REQUEST_TYPE);
    public static final pwu m = new pwu(pwm.HTTP_NOT_FOUND);
    public static final pwu n = new pwu(pwm.INVALID_GAIA_AUTH_TOKEN);
    public static final pwu o = new pwu(pwm.CANNOT_CREATE_REQUEST);
    public static final pwu p = new pwu(pwm.HTTP_GONE);

    static {
        yfu yfuVar = new yfu(4);
        yfuVar.e(3, pvq.INVALID_ARGUMENT);
        yfuVar.e(9, pvq.FAILED_PRECONDITION);
        yfuVar.e(11, pvq.OUT_OF_RANGE);
        yfuVar.e(13, pvq.INTERNAL);
        yfuVar.e(14, pvq.UNAVAILABLE);
        yfuVar.e(4, pvq.DEADLINE_EXCEEDED);
        yfuVar.e(7, pvq.PERMISSION_DENIED);
        yfuVar.e(16, pvq.UNAUTHENTICATED);
        w = yfuVar.d(true);
    }

    public pwu(pwm pwmVar, String str, Throwable th, Integer num, Map map) {
        this.q = pwmVar;
        this.r = str;
        this.s = th;
        this.t = num;
        this.u = map;
    }

    public static pwu b(int i2) {
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
        ((ynz) ((ynz) v.h()).ai(6921)).w("HTTP_UNKNOWN_STATUS_CODE %d", i2);
        return a;
    }

    public static pwu c(Throwable th) {
        pwu pwuVar;
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            if (cause instanceof TimeoutException) {
                return b.d(th);
            }
            if (cause instanceof pwv) {
                return ((pwv) cause).a;
            }
            if (cause instanceof CancellationException) {
                return d.d(th);
            }
            if (cause instanceof SecurityException) {
                return b.d(th);
            }
            if (cause instanceof adnt) {
                adnq adnqVar = ((adnt) cause).a;
                adnn adnnVar = adnn.OK;
                adnn adnnVar2 = adnqVar.p;
                switch (adnnVar2.ordinal()) {
                    case 0:
                    case 11:
                    case 14:
                        pwuVar = a;
                        break;
                    case 1:
                        pwuVar = d;
                        break;
                    case 2:
                    case 6:
                    case 8:
                    case 10:
                    case 13:
                        pwuVar = c;
                        break;
                    case 3:
                    case 9:
                        pwuVar = h;
                        break;
                    case 4:
                        pwuVar = b;
                        break;
                    case 5:
                        pwuVar = m;
                        break;
                    case 7:
                    case 16:
                        pwuVar = n;
                        break;
                    case 12:
                        pwuVar = o;
                        break;
                    case 15:
                        pwuVar = g;
                        break;
                    default:
                        throw new RuntimeException(null, null);
                }
                String strName = adnqVar.q;
                pwu pwuVarD = pwuVar.d(th);
                if (strName == null) {
                    strName = adnnVar2.name();
                }
                return pwuVarD.e(strName);
            }
        }
        return a.d(th);
    }

    public final pvq a() {
        yfy yfyVar = w;
        Integer num = this.t;
        if (yfyVar.containsKey(num)) {
            return (pvq) yfyVar.get(num);
        }
        adnn adnnVar = adnn.OK;
        switch (this.q.ordinal()) {
            case 0:
                return pvq.PROTOCOL_ERROR_INVALID_CONTENT_TYPE;
            case 1:
                return pvq.PROTOCOL_ERROR_VERSION_MISMATCH;
            case 2:
                return pvq.HTTP_BAD_REQUEST;
            case 3:
                return pvq.HTTP_NOT_FOUND;
            case 4:
                return pvq.HTTP_SERVER_ERROR;
            case 5:
            case 11:
            case 12:
            case 14:
            default:
                return pvq.HTTP_UNKNOWN_STATUS_CODE;
            case 6:
                return pvq.IO_ERROR;
            case 7:
                return pvq.NO_CONNECTIVITY;
            case 8:
                return pvq.INVALID_API_TOKEN;
            case 9:
                return pvq.INVALID_GAIA_AUTH_TOKEN;
            case 10:
                return pvq.MALFORMED_MESSAGE;
            case 13:
                return pvq.REQUEST_TIMEOUT;
            case 15:
                return pvq.CANCELED;
            case 16:
                return pvq.UNSUPPORTED_REQUEST_TYPE;
            case 17:
                return pvq.CANNOT_CREATE_REQUEST;
            case 18:
                return pvq.HTTP_GONE;
        }
    }

    public final pwu d(Throwable th) {
        return Objects.equals(this.s, th) ? this : new pwu(this.q, this.r, th, this.t, this.u);
    }

    public final pwu e(String str) {
        return Objects.equals(this.r, str) ? this : new pwu(this.q, str, this.s, this.t, this.u);
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof pwu)) {
            return ((pwu) obj).q.equals(this.q);
        }
        return false;
    }

    public final int hashCode() {
        return this.q.hashCode();
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("errorCode", this.q);
        xxgVarAo.b("description", this.r);
        Throwable th = this.s;
        xxgVarAo.b("cause", th == null ? "" : xyg.a(th));
        xxgVarAo.b("errorDetails", ysi.n(this.u, new xxd(","), "="));
        return xxgVarAo.toString();
    }

    private pwu(pwm pwmVar) {
        this(pwmVar, null, null, null, ylx.a);
    }
}
