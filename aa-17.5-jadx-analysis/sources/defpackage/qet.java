package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.os.RemoteException;
import java.util.UUID;

@Deprecated
/* loaded from: classes.dex */
public final class qet implements lbi {
    private static final yob a = yob.c("com/google/android/gearhead/FactoryImpl");

    @Override // defpackage.lbi
    public final SharedPreferences a(Context context, String str) {
        return new kmy(context, str);
    }

    @Override // defpackage.lbi
    public final lhg b(Context context, odj odjVar, ohi ohiVar) {
        if (!ogb.k()) {
            return new ofi(context, odjVar);
        }
        ((ynz) ((ynz) a.f()).ai((char) 7014)).u("Using multiple call notification producer");
        return new ofq(context, odjVar);
    }

    @Override // defpackage.lbi
    public final sab c(qrn qrnVar) throws qrz, qsa {
        return ols.u(qrnVar);
    }

    @Override // defpackage.lbi
    public final UUID d() {
        return UUID.randomUUID();
    }

    @Override // defpackage.lbi
    public final roe e(qrn qrnVar) throws qrz {
        return ols.s(qrnVar);
    }

    @Override // defpackage.lbi
    public final rny f(qrn qrnVar) throws qrz, qsa {
        qvh qvhVarS;
        rnx rnxVarI = ols.i(qrnVar);
        if (!rnxVarI.d) {
            throw new rkt();
        }
        rny rnyVar = null;
        try {
            qvhVarS = rnxVarI.a.s(rnxVarI.e, 0);
        } catch (RemoteException e) {
            rnxVarI.b(e);
        } catch (IllegalStateException e2) {
            olm.g(e2);
        }
        if (qvhVarS == null) {
            if (omc.c("CAR.AUDIO", 5)) {
                rrd.d(5, "CAR.AUDIO", null, "CarService error: %s", "cannot get audio record binder");
            }
            rnxVarI.a();
            throw new rkt(null);
        }
        rnyVar = new rny(rnxVarI, qvhVarS);
        synchronized (rnxVarI.b) {
            rnxVarI.c.add(rnyVar);
        }
        return rnyVar;
    }

    @Override // defpackage.lbi
    public final rjg g(Activity activity) {
        return new rjg(activity);
    }

    @Override // defpackage.lbi
    public final xqb h(Context context, Looper looper, wpq wpqVar) {
        return new xqb(context, looper, wpqVar);
    }

    @Override // defpackage.lbi
    public final mbl i(ajmd ajmdVar, mbd mbdVar) {
        return new qiv(ajmdVar, mbdVar);
    }
}
