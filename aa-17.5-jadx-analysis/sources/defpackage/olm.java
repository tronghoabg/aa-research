package defpackage;

import android.content.Context;
import android.os.RemoteException;
import java.util.HashSet;

/* loaded from: classes.dex */
public class olm {
    public static olm a;

    public olm() {
    }

    public static void a() {
    }

    public static boolean b(Context context) {
        context.getClass();
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static int c(ksj ksjVar) {
        if (affa.f(ksjVar, ksh.a)) {
            return 2;
        }
        if (affa.f(ksjVar, ksi.a)) {
            return 3;
        }
        throw new aezs();
    }

    public static ohw d() {
        return (ohw) mki.a.i(ohw.class);
    }

    public static rqu e(acai... acaiVarArr) {
        rqu rquVarH = rqv.h(yxy.GEARHEAD, 19, yyv.LOG_TESTCODES);
        rquVarH.j(acaiVarArr);
        return rquVarH;
    }

    public static void f(IllegalStateException illegalStateException) throws qrz {
        try {
            g(illegalStateException);
            throw illegalStateException;
        } catch (qsa unused) {
            throw illegalStateException;
        }
    }

    public static void g(IllegalStateException illegalStateException) throws qrz, qsa {
        String message = illegalStateException.getMessage();
        if (message == null) {
            throw illegalStateException;
        }
        int iHashCode = message.hashCode();
        if (iHashCode == 191842363) {
            if (!message.equals("OutOfCarLifecycle")) {
                throw illegalStateException;
            }
            if (rrd.e("CAR.CLIENT", 2)) {
                rrd.d(2, "CAR.CLIENT", illegalStateException, "IllegalStateException from car service: %s", illegalStateException.getMessage());
            }
            throw new rku(illegalStateException);
        }
        if (iHashCode == 1028412234) {
            if (!message.equals("CarNotConnected")) {
                throw illegalStateException;
            }
            if (rrd.e("CAR.CLIENT", 2)) {
                rrd.d(2, "CAR.CLIENT", illegalStateException, "IllegalStateException from car service: %s", illegalStateException.getMessage());
            }
            throw new qrz(illegalStateException);
        }
        if (iHashCode != 1587819759 || !message.equals("CarNotSupported")) {
            throw illegalStateException;
        }
        if (rrd.e("CAR.CLIENT", 2)) {
            rrd.d(2, "CAR.CLIENT", illegalStateException, "IllegalStateException from car service: %s", illegalStateException.getMessage());
        }
        throw new qsa(illegalStateException);
    }

    public static void h(RemoteException remoteException) throws rks {
        if (rrd.e("CAR.CLIENT", 2)) {
            rrd.d(2, "CAR.CLIENT", remoteException, "RemoteException from car service: %s", remoteException.getMessage());
        }
        throw new rks(remoteException);
    }

    public static final ygr j(ygr ygrVar) {
        HashSet hashSet = new HashSet(ygrVar);
        hashSet.remove(32772);
        return ygr.n(hashSet);
    }

    public static olm k(rro rroVar) {
        int iOrdinal = rroVar.ordinal();
        if (iOrdinal == 2) {
            if (rlt.b == null) {
                rlt.b = new rlt();
            }
            return rlt.b;
        }
        if (iOrdinal == 3) {
            return rlq.l(rro.AUDIO_SINK_GUIDANCE);
        }
        if (iOrdinal == 5) {
            return rlq.l(rro.AUDIO_SINK_MEDIA);
        }
        olm olmVar = a;
        if (olmVar != null) {
            return olmVar;
        }
        olm olmVar2 = new olm(null);
        a = olmVar2;
        return olmVar2;
    }

    public ygr i(rls rlsVar) {
        return new ymp(32772);
    }

    public olm(byte[] bArr) {
    }
}
