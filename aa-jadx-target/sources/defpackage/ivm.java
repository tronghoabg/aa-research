package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ivm extends defpackage.rce {
    public ivm(defpackage.ivn ivnVar, android.os.Looper looper) {
        super(ivnVar, looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        defpackage.jkr jkrVar;
        defpackage.jkr jkrVar2;
        defpackage.ivn ivnVar = (defpackage.ivn) v();
        if (ivnVar == null) {
            return;
        }
        switch (message.what) {
            case 1:
                android.view.Surface surface = (android.view.Surface) message.obj;
                if (ivnVar.t == 0) {
                    ((defpackage.yqj) defpackage.ivn.a.l().ai((char) 1383)).u("sink already added");
                    return;
                }
                ivnVar.t = 0;
                if (ivnVar.u) {
                    ivnVar.d.d(surface);
                    return;
                } else {
                    ((defpackage.yqj) defpackage.ivn.a.l().ai((char) 1382)).u("sink added while display not enabled yet.");
                    ivnVar.v = surface;
                    return;
                }
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                boolean z = message.arg1 == 1;
                if ((z && ivnVar.t == 1) || ivnVar.t == 2) {
                    ((defpackage.yqj) defpackage.ivn.a.l().ai(1387)).w("Display loss has no effect %d", ivnVar.t);
                    ivnVar.w.release();
                    return;
                }
                ivnVar.t = true == z ? 1 : 2;
                if (!ivnVar.u) {
                    ((defpackage.yqj) defpackage.ivn.a.l().ai((char) 1386)).u("sink removed while not enabled");
                    ivnVar.w.release();
                    return;
                }
                defpackage.ivc ivcVar = (defpackage.ivc) ivnVar.d;
                defpackage.ivb ivbVar = ivcVar.c;
                defpackage.jkr jkrVar3 = ivcVar.p;
                defpackage.imi imiVar = (defpackage.imi) ivbVar;
                if (imiVar.br()) {
                    com.google.android.gms.car.display.CarDisplayId carDisplayId = ivcVar.j;
                    defpackage.ysr.bk(android.os.Looper.myLooper() == imiVar.o.getLooper(), "onVideoFocusLost should happen in the default handler thread.");
                    if (!z && com.google.android.gms.car.display.CarDisplayId.a.equals(carDisplayId)) {
                        imiVar.l.h(false);
                    }
                    imiVar.O.e(defpackage.zbe.VIDEO_FOCUS, defpackage.zbd.Ct);
                    defpackage.ioh iohVarN = imiVar.n();
                    if (iohVarN != null) {
                        iohVarN.D(carDisplayId, z);
                    }
                    defpackage.iya iyaVar = imiVar.E;
                    if (jkrVar3 != null) {
                        iyaVar.k.remove(jkrVar3);
                    }
                    jkrVar3.X(z);
                }
                ivnVar.w.release();
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                if (ivnVar.u) {
                    ((defpackage.yqj) defpackage.ivn.a.l().ai((char) 1385)).u("display already enabled");
                    return;
                }
                ivnVar.u = true;
                if (ivnVar.t == 0) {
                    ((defpackage.yqj) defpackage.ivn.a.l().ai((char) 1384)).u("display enabled after sink added, start notification");
                    ivnVar.d.d(ivnVar.v);
                    return;
                }
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.ive iveVar = (defpackage.ive) message.obj;
                iveVar.getClass();
                defpackage.jev jevVar = ivnVar.e;
                jevVar.v(iveVar.c);
                jevVar.w(ivnVar.m.h);
                defpackage.ivc ivcVar2 = (defpackage.ivc) ivnVar.d;
                defpackage.iuw iuwVar = ivcVar2.r;
                defpackage.jkr jkrVar4 = ivcVar2.p;
                java.util.UUID uuidFromString = java.util.UUID.fromString(iuwVar.g().g);
                defpackage.ivb ivbVar2 = ivcVar2.c;
                synchronized (((defpackage.imi) ivbVar2).q) {
                    if (!((defpackage.imi) ivbVar2).s) {
                        ((defpackage.yqj) defpackage.imi.b.l().ai(358)).y("Display configured but projection not started. Window manager will be configured when projection starts. displayParams:%s", iveVar);
                    } else if (((defpackage.inh) jkrVar4).w != null) {
                        ((defpackage.yqj) defpackage.imi.b.l().ai(357)).y("Display configured. Window manager already configured. Nothing to do. displayParams:%s", iveVar);
                    } else {
                        jkrVar4.t(iveVar, uuidFromString);
                        if (((defpackage.imi) ivbVar2).bm()) {
                            ((defpackage.yqj) defpackage.imi.b.l().ai(356)).y("Display configured and all WindowManagers are configured. Starting projection lifecycle service. displayParams:%s", iveVar);
                            ((defpackage.imi) ivbVar2).ba();
                        } else {
                            ((defpackage.yqj) defpackage.imi.b.l().ai(355)).y("Display configured but not all WindowManagers are configured. Projection lifecycle service will be started when all WindowManagers are configured. displayParams:%s", iveVar);
                        }
                    }
                    break;
                }
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ivnVar.d.c((defpackage.xpq) message.obj);
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.ivc ivcVar3 = (defpackage.ivc) ivnVar.d;
                if (!ivcVar3.f.br() || (jkrVar = ivcVar3.p) == null) {
                    return;
                }
                jkrVar.E();
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.ivc ivcVar4 = (defpackage.ivc) ivnVar.d;
                if (!ivcVar4.f.br() || (jkrVar2 = ivcVar4.p) == null) {
                    return;
                }
                jkrVar2.F();
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                xlb xlbVar = (xlb) message.obj;
                defpackage.ivd ivdVar = ivnVar.d;
                int i = xlbVar.b;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                defpackage.ivw ivwVar = ((defpackage.ivc) ivdVar).s;
                for (rkl rklVar : ivwVar.c) {
                    try {
                        rklVar.e(i);
                    } catch (android.os.RemoteException e) {
                        ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.ivw.a.h()).p(e)).ai((char) 1418)).u("Exception notifying on started callback.");
                        arrayList.add(rklVar);
                    }
                }
                ivwVar.c.removeAll(arrayList);
                return;
            case 9:
                defpackage.ivd ivdVar2 = ivnVar.d;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                defpackage.ivw ivwVar2 = ((defpackage.ivc) ivdVar2).s;
                for (rkl rklVar2 : ivwVar2.c) {
                    try {
                        rklVar2.f();
                    } catch (android.os.RemoteException e2) {
                        ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.ivw.a.h()).p(e2)).ai((char) 1419)).u("Exception notifying on stopped callback");
                        arrayList2.add(rklVar2);
                    }
                }
                ivwVar2.c.removeAll(arrayList2);
                return;
            case 10:
                xpz xpzVar = (xpz) message.obj;
                if ((xpzVar.b & 1) != 0) {
                    int iAo = defpackage.a.ao(xpzVar.c);
                    if (iAo == 0) {
                        iAo = 1;
                    }
                    int i2 = iAo - 1;
                    if (i2 == 1) {
                        ((defpackage.yqj) defpackage.ivn.a.l().ai((char) 1389)).u("Theming tokens accepted");
                        return;
                    } else if (i2 != 2) {
                        ((defpackage.yqj) defpackage.ivn.a.l().ai((char) 1388)).u("Error providing theming tokens");
                        return;
                    } else {
                        ((defpackage.yqj) defpackage.ivn.a.l().ai((char) 1390)).u("Theming tokens rejected");
                        return;
                    }
                }
                return;
            case 11:
                defpackage.xll xllVar = (defpackage.xll) message.obj;
                if (!ivnVar.A.E(6, 0)) {
                    ((defpackage.yqj) defpackage.ivn.a.l().ai((char) 1411)).u("PDK version less than 6.0. Not updating MediaOptions.");
                    return;
                }
                defpackage.jeu jeuVar = ivnVar.f;
                jeuVar.getClass();
                jeuVar.k(32788, xllVar);
                return;
            default:
                ((defpackage.yqj) ((defpackage.yqj) defpackage.ivn.a.f()).ai(1380)).w("unknown display event message%d", message.what);
                return;
        }
    }
}
