package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class jou implements java.lang.Runnable {
    final /* synthetic */ defpackage.jnp a;
    final /* synthetic */ long b;
    final /* synthetic */ boolean c;
    final /* synthetic */ int d;
    final /* synthetic */ boolean e;
    final /* synthetic */ boolean f;

    public jou(defpackage.jnp jnpVar, long j, boolean z, int i, boolean z2, boolean z3) {
        this.a = jnpVar;
        this.b = j;
        this.c = z;
        this.d = i;
        this.e = z2;
        this.f = z3;
    }

    /* JADX WARN: Type inference failed for: r3v21, types: [android.os.PowerManager$OnThermalHeadroomChangedListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v23, types: [android.os.PowerManager$OnThermalStatusChangedListener, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r3;
        defpackage.jnp jnpVar = this.a;
        defpackage.joq joqVar = (defpackage.joq) jnpVar;
        if (joqVar.w) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.jpc.a.h()).ai(2508)).x("Aborting transfer for session %d because it has been torn down.", joqVar.c);
            return;
        }
        long j = this.b;
        boolean z = this.c;
        int i = this.d;
        boolean z2 = this.e;
        boolean z3 = this.f;
        joqVar.c();
        defpackage.ill.d();
        defpackage.yqm yqmVar = defpackage.joq.a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 2503)).y("Transfer for handoff with userAuthorized (%b)", java.lang.Boolean.valueOf(z2));
        joqVar.l.getClass();
        com.google.android.gms.carsetup.CarInfoInternal carInfoInternalQ = joqVar.m;
        if (carInfoInternalQ == null) {
            carInfoInternalQ = defpackage.ebq.q(joqVar.r, joqVar.p, joqVar.q, joqVar.n, joqVar.o, (java.lang.String) joqVar.h.fF());
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 2504)).u("transferForHandoff called before carInfo was initialized");
            defpackage.ysr.bk(joqVar.r.equals(defpackage.xpc.a), "The serviceDiscoveryResponse has been initialized, so carInfo should not be null");
            defpackage.imi imiVar = joqVar.f;
            imiVar.O.b(defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, defpackage.zbe.CAR_SERVICE, defpackage.zbd.Cl).l());
            joqVar.h(carInfoInternalQ, joqVar.r);
            defpackage.joq.i(carInfoInternalQ, imiVar);
        }
        com.google.android.gms.carsetup.CarInfoInternal carInfoInternal = carInfoInternalQ;
        if (!z2) {
            try {
                ((defpackage.joq) jnpVar).z.getClass();
                defpackage.rxi rxiVarA = ((defpackage.joq) jnpVar).z.a(((defpackage.joq) jnpVar).l, new jqo());
                rxiVarA.getClass();
                defpackage.imi imiVar2 = ((defpackage.joq) jnpVar).f;
                long j2 = ((defpackage.joq) jnpVar).c;
                defpackage.jbw jbwVar = ((defpackage.joq) jnpVar).l;
                int i2 = ((defpackage.joq) jnpVar).d;
                synchronized (imiVar2.q) {
                    try {
                        if (!imiVar2.br()) {
                            imiVar2.ay(j2, i2, carInfoInternal, jbwVar, z);
                        }
                        defpackage.iuk iukVar = imiVar2.u;
                        iukVar.C = iukVar.i.c();
                        defpackage.ilc ilcVar = iukVar.C.k;
                        ilcVar.b = rxiVarA;
                        try {
                            ilcVar.b(ilcVar.b.o());
                            ilcVar.b.f(new ilb(ilcVar));
                        } catch (android.os.RemoteException unused) {
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                return;
            } catch (android.os.RemoteException unused2) {
                return;
            }
        }
        defpackage.imi imiVar3 = joqVar.f;
        long j3 = joqVar.c;
        defpackage.jbw jbwVar2 = joqVar.l;
        int i3 = joqVar.d;
        boolean z4 = joqVar.x;
        defpackage.xzi xziVar = imiVar3.S;
        ((defpackage.iyc) xziVar.fF()).j(carInfoInternal.a);
        ((defpackage.iyc) xziVar.fF()).i(imiVar3.O);
        defpackage.ilf ilfVar = imiVar3.j;
        ((defpackage.yqj) defpackage.imi.b.l().ai((char) 364)).u("warming up projection process");
        android.content.Intent intent = new android.content.Intent();
        intent.addCategory("com.google.android.gms.car.CATEGORY_PROJECTION_LIFECYCLE_SERVICE");
        android.content.Context context = imiVar3.k;
        intent.setPackage(defpackage.ill.c(context));
        try {
            context.startService(intent);
        } catch (java.lang.IllegalStateException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.imi.b.h()).p(e)).ai((char) 366)).u("failed to warmup :projection process");
        }
        ((defpackage.yqj) defpackage.imi.b.l().ai((char) 365)).w("prepareConnectionForServiceDiscovery, connectionType:%d", i3);
        android.os.Process.setThreadPriority(-8);
        synchronized (imiVar3.q) {
            if (!imiVar3.br()) {
                imiVar3.ay(j3, i3, carInfoInternal, jbwVar2, z);
            }
            imiVar3.O.g((int) j);
            imiVar3.I = false;
            imiVar3.G = defpackage.zaj.UNKNOWN_CODE;
            android.util.SparseBooleanArray sparseBooleanArray = imiVar3.p;
            synchronized (sparseBooleanArray) {
                sparseBooleanArray.clear();
            }
            imiVar3.H.clear();
            android.content.Context context2 = imiVar3.k;
            imiVar3.x = new defpackage.ixa(imiVar3, imiVar3, context2);
            defpackage.iuk iukVar2 = imiVar3.u;
            defpackage.ilj iljVar = iukVar2.f;
            android.content.Context context3 = iukVar2.k;
            defpackage.jfn jfnVar = iukVar2.v;
            jfnVar.getClass();
            android.os.HandlerThread handlerThread = iukVar2.u;
            handlerThread.getClass();
            defpackage.ilr ilrVar = new defpackage.ilr(iljVar, jfnVar, handlerThread);
            if (iukVar2.C == null) {
                iukVar2.C = iukVar2.i.c();
                iukVar2.C.i = ilrVar;
            } else {
                iukVar2.C.i = ilrVar;
                ilrVar.c(iukVar2.C);
            }
            imiVar3.r = i;
            imiVar3.q.notifyAll();
            imiVar3.v = z3;
            if (z4) {
                defpackage.jfo jfoVar = imiVar3.O;
                jfoVar.e(defpackage.zbe.AUDIO_SERVICE_MIGRATION, defpackage.zbd.yq);
                imiVar3.w = new defpackage.irf(context2, jfoVar, new defpackage.ilu(imiVar3, 4), imiVar3, imiVar3);
                iukVar2.s.g(imiVar3.w);
            } else {
                imiVar3.w = null;
                iukVar2.s.g(defpackage.imi.a);
            }
            defpackage.jbw jbwVar3 = iukVar2.s;
            defpackage.ixa ixaVar = imiVar3.x;
            defpackage.jab jabVar = jbwVar3.d.g;
            jabVar.o = ixaVar;
            defpackage.izw izwVar = jabVar.o;
            synchronized (((defpackage.ixa) izwVar).a) {
                ((defpackage.ixa) izwVar).b = jabVar;
            }
            synchronized (jabVar.l) {
                java.util.ArrayList arrayList = jabVar.m;
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    boolean z5 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    xlz xlzVar = (xlz) it.next();
                    defpackage.izw izwVar2 = jabVar.o;
                    if (xlzVar != xlz.b) {
                        z5 = false;
                    }
                    izwVar2.b(z5);
                }
                arrayList.clear();
                java.util.List list = jabVar.n;
                java.util.Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((defpackage.ixa) jabVar.o).m(2, !((java.lang.Boolean) it2.next()).booleanValue() ? 1 : 0);
                }
                list.clear();
            }
        }
        defpackage.iya iyaVar = imiVar3.E;
        defpackage.yqm yqmVar2 = defpackage.iya.a;
        ((defpackage.yqj) yqmVar2.l().ai((char) 1527)).u("init power management");
        boolean z6 = iyaVar.v;
        if (!z6 || !iyaVar.w) {
            defpackage.ixs ixsVar = iyaVar.j;
            ixsVar.e = iyaVar;
            if (ixsVar.f.getAndSet(true)) {
                ((defpackage.yqj) defpackage.ixs.a.l().ai((char) 1522)).u("battery already monitored");
            } else {
                defpackage.duw.e(ixsVar.d, ixsVar, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"), ixsVar.c, 2);
            }
        }
        if (z6) {
            iyaVar.x = new ixy(iyaVar);
            defpackage.duw.e(iyaVar.h, iyaVar.x, new android.content.IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"), iyaVar.p, 2);
            iyaVar.y = iyaVar.l.a();
        }
        if (android.os.Build.VERSION.SDK_INT >= 29 && iyaVar.u && (r3 = iyaVar.r) != 0) {
            ep$.ExternalSyntheticApiModelOutline0.m(((defpackage.ixv) iyaVar.l).a, new defpackage.tea(iyaVar.p, 0), (android.os.PowerManager.OnThermalStatusChangedListener) r3);
            iyaVar.s = true;
        }
        if (android.os.Build.VERSION.SDK_INT >= 36 && iyaVar.z) {
            ?? r4 = iyaVar.D;
            if (r4 != 0) {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar2.f()).ai((char) 1531)).u("Registering thermal headroom listener with executor");
                b$.ExternalSyntheticApiModelOutline0.m(((defpackage.ixv) iyaVar.l).a, new defpackage.tea(iyaVar.p, 0), (android.os.PowerManager.OnThermalHeadroomChangedListener) r4);
                iyaVar.E = true;
            }
            synchronized (iyaVar.m) {
                iyaVar.G = true;
            }
            iyaVar.p.post(iyaVar.F);
        }
        imiVar3.E.c(imiVar3);
    }
}
