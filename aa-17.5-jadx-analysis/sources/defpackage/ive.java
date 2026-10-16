package defpackage;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.view.Surface;
import com.google.android.gms.car.display.CarDisplayId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

/* loaded from: classes.dex */
public final class ive extends rbj {
    public ive(ivf ivfVar, Looper looper) {
        super(ivfVar, looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        jkk jkkVar;
        jkk jkkVar2;
        ivf ivfVar = (ivf) v();
        if (ivfVar == null) {
            return;
        }
        switch (message.what) {
            case 1:
                Surface surface = (Surface) message.obj;
                if (ivfVar.t == 0) {
                    ((ype) ivf.a.l().ai((char) 1383)).u("sink already added");
                    return;
                }
                ivfVar.t = 0;
                if (ivfVar.u) {
                    ivfVar.d.d(surface);
                    return;
                } else {
                    ((ype) ivf.a.l().ai((char) 1382)).u("sink added while display not enabled yet.");
                    ivfVar.v = surface;
                    return;
                }
            case 2:
                boolean z = message.arg1 == 1;
                if ((z && ivfVar.t == 1) || ivfVar.t == 2) {
                    ((ype) ivf.a.l().ai(1387)).w("Display loss has no effect %d", ivfVar.t);
                    ivfVar.w.release();
                    return;
                }
                ivfVar.t = true == z ? 1 : 2;
                if (!ivfVar.u) {
                    ((ype) ivf.a.l().ai((char) 1386)).u("sink removed while not enabled");
                    ivfVar.w.release();
                    return;
                }
                iuu iuuVar = (iuu) ivfVar.d;
                iut iutVar = iuuVar.c;
                jkk jkkVar3 = iuuVar.p;
                ima imaVar = (ima) iutVar;
                if (imaVar.br()) {
                    CarDisplayId carDisplayId = iuuVar.j;
                    woy.aa(Looper.myLooper() == imaVar.o.getLooper(), "onVideoFocusLost should happen in the default handler thread.");
                    if (!z && CarDisplayId.a.equals(carDisplayId)) {
                        imaVar.l.h(false);
                    }
                    imaVar.O.e(yzz.VIDEO_FOCUS, yzy.Cp);
                    iob iobVarN = imaVar.n();
                    if (iobVarN != null) {
                        iobVarN.D(carDisplayId, z);
                    }
                    ixs ixsVar = imaVar.E;
                    if (jkkVar3 != null) {
                        ixsVar.k.remove(jkkVar3);
                    }
                    jkkVar3.X(z);
                }
                ivfVar.w.release();
                return;
            case 3:
                if (ivfVar.u) {
                    ((ype) ivf.a.l().ai((char) 1385)).u("display already enabled");
                    return;
                }
                ivfVar.u = true;
                if (ivfVar.t == 0) {
                    ((ype) ivf.a.l().ai((char) 1384)).u("display enabled after sink added, start notification");
                    ivfVar.d.d(ivfVar.v);
                    return;
                }
                return;
            case 4:
                iuw iuwVar = (iuw) message.obj;
                iuwVar.getClass();
                jen jenVar = ivfVar.e;
                jenVar.v(iuwVar.c);
                jenVar.w(ivfVar.m.h);
                iuu iuuVar2 = (iuu) ivfVar.d;
                iuo iuoVar = iuuVar2.r;
                jkk jkkVar4 = iuuVar2.p;
                UUID uuidFromString = UUID.fromString(iuoVar.g().g);
                iut iutVar2 = iuuVar2.c;
                synchronized (((ima) iutVar2).q) {
                    if (!((ima) iutVar2).s) {
                        ((ype) ima.b.l().ai(358)).y("Display configured but projection not started. Window manager will be configured when projection starts. displayParams:%s", iuwVar);
                    } else if (((ina) jkkVar4).w != null) {
                        ((ype) ima.b.l().ai(357)).y("Display configured. Window manager already configured. Nothing to do. displayParams:%s", iuwVar);
                    } else {
                        jkkVar4.t(iuwVar, uuidFromString);
                        if (((ima) iutVar2).bm()) {
                            ((ype) ima.b.l().ai(356)).y("Display configured and all WindowManagers are configured. Starting projection lifecycle service. displayParams:%s", iuwVar);
                            ((ima) iutVar2).ba();
                        } else {
                            ((ype) ima.b.l().ai(355)).y("Display configured but not all WindowManagers are configured. Projection lifecycle service will be started when all WindowManagers are configured. displayParams:%s", iuwVar);
                        }
                    }
                }
                return;
            case 5:
                ivfVar.d.c((xop) message.obj);
                return;
            case 6:
                iuu iuuVar3 = (iuu) ivfVar.d;
                if (!iuuVar3.f.br() || (jkkVar = iuuVar3.p) == null) {
                    return;
                }
                jkkVar.E();
                return;
            case 7:
                iuu iuuVar4 = (iuu) ivfVar.d;
                if (!iuuVar4.f.br() || (jkkVar2 = iuuVar4.p) == null) {
                    return;
                }
                jkkVar2.F();
                return;
            case 8:
                xka xkaVar = (xka) message.obj;
                iuv iuvVar = ivfVar.d;
                int i = xkaVar.b;
                ArrayList arrayList = new ArrayList();
                ivo ivoVar = ((iuu) iuvVar).s;
                Iterator it = ivoVar.c.iterator();
                while (it.hasNext()) {
                    rjp rjpVar = (rjp) it.next();
                    try {
                        rjpVar.e(i);
                    } catch (RemoteException e) {
                        ((ype) ((ype) ((ype) ivo.a.h()).p(e)).ai((char) 1418)).u("Exception notifying on started callback.");
                        arrayList.add(rjpVar);
                    }
                }
                ivoVar.c.removeAll(arrayList);
                return;
            case 9:
                iuv iuvVar2 = ivfVar.d;
                ArrayList arrayList2 = new ArrayList();
                ivo ivoVar2 = ((iuu) iuvVar2).s;
                Iterator it2 = ivoVar2.c.iterator();
                while (it2.hasNext()) {
                    rjp rjpVar2 = (rjp) it2.next();
                    try {
                        rjpVar2.f();
                    } catch (RemoteException e2) {
                        ((ype) ((ype) ((ype) ivo.a.h()).p(e2)).ai((char) 1419)).u("Exception notifying on stopped callback");
                        arrayList2.add(rjpVar2);
                    }
                }
                ivoVar2.c.removeAll(arrayList2);
                return;
            case 10:
                xoy xoyVar = (xoy) message.obj;
                if ((xoyVar.b & 1) != 0) {
                    int iAp = a.ap(xoyVar.c);
                    if (iAp == 0) {
                        iAp = 1;
                    }
                    int i2 = iAp - 1;
                    if (i2 == 1) {
                        ((ype) ivf.a.l().ai((char) 1389)).u("Theming tokens accepted");
                        return;
                    } else if (i2 != 2) {
                        ((ype) ivf.a.l().ai((char) 1388)).u("Error providing theming tokens");
                        return;
                    } else {
                        ((ype) ivf.a.l().ai((char) 1390)).u("Theming tokens rejected");
                        return;
                    }
                }
                return;
            case 11:
                xkk xkkVar = (xkk) message.obj;
                if (!ivfVar.A.t(6, 0)) {
                    ((ype) ivf.a.l().ai((char) 1411)).u("PDK version less than 6.0. Not updating MediaOptions.");
                    return;
                }
                jem jemVar = ivfVar.f;
                jemVar.getClass();
                jemVar.k(32788, xkkVar);
                return;
            default:
                ((ype) ((ype) ivf.a.f()).ai(1380)).w("unknown display event message%d", message.what);
                return;
        }
    }
}
