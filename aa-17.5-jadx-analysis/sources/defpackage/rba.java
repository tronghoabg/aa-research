package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Pair;

/* loaded from: classes.dex */
public final class rba extends rbj {
    public rba(rbb rbbVar) {
        super(rbbVar, Looper.getMainLooper());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) throws RemoteException {
        Object[] objArr = 0;
        if (omc.c("CAR.CLIENT.PLS", 2)) {
            rrd.d(2, "CAR.CLIENT.PLS", null, "Handling message: %s", message);
        }
        rbb rbbVar = (rbb) v();
        if (rbbVar == null) {
            rrd.d(6, "CAR.CLIENT.PLS", null, "Dropping message %s", message);
            return;
        }
        int i = message.what;
        if (i == 0) {
            Pair pair = (Pair) message.obj;
            qzv qzvVar = (qzv) pair.first;
            rec recVar = new rec((qup) pair.second, new rdr(rbbVar));
            rdm rdmVar = new rdm(recVar, Looper.getMainLooper());
            raz razVar = new raz(rdmVar, recVar);
            rdl rdlVar = rbbVar.b;
            if (rdlVar != null) {
                ((rec) rdlVar).e(false);
            }
            rbbVar.c = razVar;
            rbbVar.b = recVar;
            rbbVar.f = new lds((qrn) razVar);
            try {
                if (rdmVar.N("car_force_logging")) {
                    omc.a = true;
                }
            } catch (qrz e) {
                rrd.b("CAR.CLIENT.PLS", e, "Failed to read loggable key");
            }
            if (omc.c("CAR.CLIENT.PLS", 3)) {
                boolean z = rrd.a;
                rrd.d(3, "CAR.CLIENT.PLS", null, "Projection start", new Object[0]);
            }
            woy.aa(rbbVar.f != null, "configure() must be called before onProjectionStartNew!");
            Bundle bundle = new Bundle();
            qrn qrnVar = rbbVar.c;
            qrnVar.getClass();
            rbbVar.g(bundle, qrnVar);
            try {
                qzvVar.f(1, bundle);
                qrn qrnVar2 = rbbVar.c;
                qrnVar2.getClass();
                rbbVar.c(qrnVar2);
                return;
            } catch (RemoteException unused) {
                return;
            }
        }
        if (i == 1) {
            rbbVar.a();
            return;
        }
        if (i == 2) {
            Pair pair2 = (Pair) message.obj;
            Bundle bundle2 = (Bundle) pair2.first;
            qzv qzvVar2 = (qzv) pair2.second;
            if (omc.c("CAR.CLIENT.PLS", 3)) {
                boolean z2 = rrd.a;
                rrd.d(3, "CAR.CLIENT.PLS", null, "Preflight start", new Object[0]);
            }
            woy.aa(rbbVar.f != null, "configure() must be called before onAuthorizationStart!");
            rbbVar.j(rbbVar.c, bundle2, new kgx(qzvVar2));
            return;
        }
        if (i != 3) {
            if (i != 4) {
                rrd.d(5, "CAR.CLIENT.PLS", null, "Unknown message %s", message);
                return;
            } else {
                rbbVar.b((qzv) message.obj);
                return;
            }
        }
        qzv qzvVar3 = (qzv) message.obj;
        if (omc.c("CAR.CLIENT.PLS", 3)) {
            boolean z3 = rrd.a;
            rrd.d(3, "CAR.CLIENT.PLS", null, "Projection ready", new Object[0]);
        }
        rbbVar.d = new ray((Object) rbbVar, (Object) qzvVar3, (int) (objArr == true ? 1 : 0));
        rbbVar.e = false;
        try {
            qzvVar3.asBinder().linkToDeath(rbbVar.d, 0);
            rbbVar.f();
        } catch (RemoteException unused2) {
            rrd.d(5, "CAR.CLIENT.PLS", null, "Couldn't link to death!", new Object[0]);
            rbbVar.h();
            rbbVar.a();
        }
    }
}
