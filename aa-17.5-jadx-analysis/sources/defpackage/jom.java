package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Process;
import android.os.RemoteException;
import android.util.SparseBooleanArray;
import com.google.android.gms.carsetup.CarInfoInternal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class jom implements Runnable {
    final /* synthetic */ jnh a;
    final /* synthetic */ long b;
    final /* synthetic */ boolean c;
    final /* synthetic */ int d;
    final /* synthetic */ boolean e;
    final /* synthetic */ boolean f;

    public jom(jnh jnhVar, long j, boolean z, int i, boolean z2, boolean z3) {
        this.a = jnhVar;
        this.b = j;
        this.c = z;
        this.d = i;
        this.e = z2;
        this.f = z3;
    }

    /* JADX WARN: Type inference failed for: r3v21, types: [android.os.PowerManager$OnThermalHeadroomChangedListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v23, types: [android.os.PowerManager$OnThermalStatusChangedListener, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        ?? r3;
        jnh jnhVar = this.a;
        joi joiVar = (joi) jnhVar;
        if (joiVar.v) {
            ((ype) ((ype) jou.a.h()).ai(2507)).x("Aborting transfer for session %d because it has been torn down.", joiVar.c);
            return;
        }
        long j = this.b;
        boolean z = this.c;
        int i = this.d;
        boolean z2 = this.e;
        boolean z3 = this.f;
        joiVar.c();
        ilb.d();
        yph yphVar = joi.a;
        ((ype) ((ype) yphVar.f()).ai((char) 2502)).y("Transfer for handoff with userAuthorized (%b)", Boolean.valueOf(z2));
        joiVar.l.getClass();
        CarInfoInternal carInfoInternalC = joiVar.m;
        if (carInfoInternalC == null) {
            carInfoInternalC = dsg.C(joiVar.r, joiVar.p, joiVar.q, joiVar.n, joiVar.o, joiVar.h);
            ((ype) ((ype) yphVar.h()).ai((char) 2503)).u("transferForHandoff called before carInfo was initialized");
            woy.aa(joiVar.r.equals(xob.a), "The serviceDiscoveryResponse has been initialized, so carInfo should not be null");
            ima imaVar = joiVar.f;
            imaVar.O.b(rrc.h(yxy.CAR_SERVICE, yzz.CAR_SERVICE, yzy.Ch).l());
            joiVar.h(carInfoInternalC, joiVar.r);
            joi.i(carInfoInternalC, imaVar);
        }
        CarInfoInternal carInfoInternal = carInfoInternalC;
        if (!z2) {
            try {
                ((joi) jnhVar).y.getClass();
                rwp rwpVarB = ((joi) jnhVar).y.b(((joi) jnhVar).l, new jqn());
                rwpVarB.getClass();
                ima imaVar2 = ((joi) jnhVar).f;
                long j2 = ((joi) jnhVar).c;
                jbp jbpVar = ((joi) jnhVar).l;
                int i2 = ((joi) jnhVar).d;
                synchronized (imaVar2.q) {
                    if (!imaVar2.br()) {
                        imaVar2.ay(j2, i2, carInfoInternal, jbpVar, z);
                    }
                    iuc iucVar = imaVar2.u;
                    iucVar.C = iucVar.i.c();
                    iks iksVar = iucVar.C.k;
                    iksVar.b = rwpVarB;
                    try {
                        iksVar.b(iksVar.b.o());
                        iksVar.b.f(new ikr(iksVar));
                    } catch (RemoteException unused) {
                    }
                }
                return;
            } catch (RemoteException unused2) {
                return;
            }
        }
        ima imaVar3 = joiVar.f;
        long j3 = joiVar.c;
        jbp jbpVar2 = joiVar.l;
        int i3 = joiVar.d;
        boolean z4 = joiVar.w;
        xyc xycVar = imaVar3.S;
        ((ixu) xycVar.gu()).j(carInfoInternal.a);
        ((ixu) xycVar.gu()).i(imaVar3.O);
        ikv ikvVar = imaVar3.j;
        ((ype) ima.b.l().ai((char) 364)).u("warming up projection process");
        Intent intent = new Intent();
        intent.addCategory("com.google.android.gms.car.CATEGORY_PROJECTION_LIFECYCLE_SERVICE");
        Context context = imaVar3.k;
        intent.setPackage(ilb.c(context));
        try {
            context.startService(intent);
        } catch (IllegalStateException e) {
            ((ype) ((ype) ((ype) ima.b.h()).p(e)).ai((char) 366)).u("failed to warmup :projection process");
        }
        ((ype) ima.b.l().ai((char) 365)).w("prepareConnectionForServiceDiscovery, connectionType:%d", i3);
        Process.setThreadPriority(-8);
        synchronized (imaVar3.q) {
            if (!imaVar3.br()) {
                imaVar3.ay(j3, i3, carInfoInternal, jbpVar2, z);
            }
            imaVar3.O.g((int) j);
            imaVar3.I = false;
            imaVar3.G = yze.UNKNOWN_CODE;
            SparseBooleanArray sparseBooleanArray = imaVar3.p;
            synchronized (sparseBooleanArray) {
                sparseBooleanArray.clear();
            }
            imaVar3.H.clear();
            Context context2 = imaVar3.k;
            imaVar3.x = new iws(imaVar3, imaVar3, context2);
            iuc iucVar2 = imaVar3.u;
            ikz ikzVar = iucVar2.f;
            Context context3 = iucVar2.k;
            jff jffVar = iucVar2.v;
            jffVar.getClass();
            HandlerThread handlerThread = iucVar2.u;
            handlerThread.getClass();
            ilh ilhVar = new ilh(ikzVar, jffVar, handlerThread);
            if (iucVar2.C == null) {
                iucVar2.C = iucVar2.i.c();
                iucVar2.C.i = ilhVar;
            } else {
                iucVar2.C.i = ilhVar;
                ilhVar.c(iucVar2.C);
            }
            imaVar3.r = i;
            imaVar3.q.notifyAll();
            imaVar3.v = z3;
            if (z4) {
                jfg jfgVar = imaVar3.O;
                jfgVar.e(yzz.AUDIO_SERVICE_MIGRATION, yzy.ym);
                imaVar3.w = new iqw(context2, jfgVar, new ilk(imaVar3, 4), imaVar3, imaVar3);
                iucVar2.s.g(imaVar3.w);
            } else {
                imaVar3.w = null;
                iucVar2.s.g(ima.a);
            }
            jbp jbpVar3 = iucVar2.s;
            iws iwsVar = imaVar3.x;
            izu izuVar = jbpVar3.d.g;
            izuVar.o = iwsVar;
            izp izpVar = izuVar.o;
            synchronized (((iws) izpVar).a) {
                ((iws) izpVar).b = izuVar;
            }
            synchronized (izuVar.l) {
                ArrayList arrayList = izuVar.m;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean z5 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    xky xkyVar = (xky) it.next();
                    izp izpVar2 = izuVar.o;
                    if (xkyVar != xky.NAV_FOCUS_PROJECTED) {
                        z5 = false;
                    }
                    izpVar2.b(z5);
                }
                arrayList.clear();
                List list = izuVar.n;
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((iws) izuVar.o).m(2, !((Boolean) it2.next()).booleanValue() ? 1 : 0);
                }
                list.clear();
            }
        }
        ixs ixsVar = imaVar3.E;
        yph yphVar2 = ixs.a;
        ((ype) yphVar2.l().ai((char) 1527)).u("init power management");
        boolean z6 = ixsVar.v;
        if (!z6 || !ixsVar.w) {
            ixk ixkVar = ixsVar.j;
            ixkVar.e = ixsVar;
            if (ixkVar.f.getAndSet(true)) {
                ((ype) ixk.a.l().ai((char) 1522)).u("battery already monitored");
            } else {
                dup.e(ixkVar.d, ixkVar, new IntentFilter("android.intent.action.BATTERY_CHANGED"), ixkVar.c, 2);
            }
        }
        if (z6) {
            ixsVar.x = new ixq(ixsVar);
            dup.e(ixsVar.h, ixsVar.x, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"), ixsVar.p, 2);
            ixsVar.y = ixsVar.l.a();
        }
        if (Build.VERSION.SDK_INT >= 29 && ixsVar.u && (r3 = ixsVar.r) != 0) {
            ((ixn) ixsVar.l).a.addThermalStatusListener(new tde(ixsVar.p, 0), r3);
            ixsVar.s = true;
        }
        if (Build.VERSION.SDK_INT >= 36 && ixsVar.z) {
            ?? r32 = ixsVar.D;
            if (r32 != 0) {
                ((ype) ((ype) yphVar2.f()).ai((char) 1531)).u("Registering thermal headroom listener with executor");
                ((ixn) ixsVar.l).a.addThermalHeadroomListener(new tde(ixsVar.p, 0), r32);
                ixsVar.E = true;
            }
            synchronized (ixsVar.m) {
                ixsVar.G = true;
            }
            ixsVar.p.post(ixsVar.F);
        }
        imaVar3.E.c(imaVar3);
    }
}
