package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jpa implements java.lang.Runnable {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public jpa(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afbj */
    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v89, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() throws afbj, wfo {
        defpackage.zhs zhsVarCp;
        defpackage.jhl jhlVar = null;
        java.lang.Object[] objArr = 0;
        int i = 5;
        int i2 = 1;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                defpackage.jpb jpbVar = (defpackage.jpb) this.a;
                long j = jpbVar.a;
                defpackage.jpc jpcVar = jpbVar.c;
                if (jpcVar.k(j)) {
                    int i3 = jpbVar.b;
                    jpcVar.f();
                    defpackage.jnq jnqVar = jpcVar.f;
                    if (i3 == 1) {
                        defpackage.jqb jqbVar = (defpackage.jqb) jnqVar;
                        defpackage.ysr.bn(jqbVar.j.add(java.lang.Long.valueOf(j)), "Car connection with sessionId %s already started", java.lang.String.valueOf(j));
                        jqbVar.g.c(defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, defpackage.zbe.CAR_SERVICE, defpackage.zbd.uh).l());
                    } else {
                        i2 = i3;
                    }
                    defpackage.yhx yhxVar = defpackage.jqb.b;
                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(i2);
                    if (!yhxVar.contains(numValueOf)) {
                        throw new java.lang.IllegalArgumentException();
                    }
                    ((defpackage.jqb) jnqVar).i.set(numValueOf, false);
                    return;
                }
                return;
            case 1:
                defpackage.jki jkiVar = (defpackage.jki) this.a;
                defpackage.jhl jhlVar2 = jkiVar.f;
                if (jhlVar2 == null) {
                    defpackage.afga.d("projectionWindow");
                } else {
                    jhlVar = jhlVar2;
                }
                android.view.Surface surfaceAL = jhlVar.aL();
                if (surfaceAL != null) {
                    jkiVar.a(surfaceAL);
                    return;
                }
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.jpb jpbVar2 = (defpackage.jpb) this.a;
                long j2 = jpbVar2.a;
                defpackage.jpc jpcVar2 = jpbVar2.c;
                if (jpcVar2.k(j2)) {
                    int i4 = jpbVar2.b;
                    jpcVar2.f();
                    defpackage.ysr.bk(((java.lang.Integer) ((defpackage.jqb) jpcVar2.f).i.getReference()).intValue() == i4, "onCarConnectionReady connection type doesn't match connection type we were connecting with!");
                    return;
                }
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.yqm yqmVar = defpackage.jqk.a;
                ((android.os.Handler) this.a).post(new defpackage.img(i));
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.yqm yqmVar2 = defpackage.jqk.a;
                ((defpackage.yqj) yqmVar2.l().ai((char) 2610)).u("Building ICar delegate chain.");
                java.util.ArrayList arrayList = new java.util.ArrayList(3);
                defpackage.jqk jqkVar = (defpackage.jqk) this.a;
                defpackage.jqb jqbVar2 = jqkVar.j;
                arrayList.add(jqbVar2);
                defpackage.imi imiVar = jqkVar.f;
                arrayList.add(imiVar);
                defpackage.ypu ypuVarF = defpackage.jqb.a.f();
                defpackage.zke zkeVar = defpackage.zke.a;
                ((defpackage.yqj) ((defpackage.yqj) ypuVarF).ai((char) 2591)).y("Setting delegate: %s", new defpackage.zkf(zkeVar, imiVar));
                defpackage.ysr.bk(defpackage.a.o(jqbVar2.c, imiVar), "Tried to set Delegate Car Service more than once.");
                jqbVar2.f.post(new defpackage.kfq((java.lang.Object) jqbVar2, (java.lang.Object) imiVar, i2, (byte[]) (objArr == true ? 1 : 0)));
                defpackage.jpf jpfVar = jqkVar.i;
                arrayList.add(jpfVar);
                defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) defpackage.imi.b.f()).ai(383);
                java.util.concurrent.atomic.AtomicReference atomicReference = imiVar.i;
                yqjVar.M("Setting CSB delegate, previous value %s updated to %s", atomicReference, jpfVar);
                atomicReference.set(jpfVar);
                ((defpackage.yqj) ((defpackage.yqj) yqmVar2.f()).ai((char) 2611)).y("ICar delegate chain:\n\t%s", new defpackage.zkf(zkeVar, new defpackage.xyj("\n\t-> ").b(arrayList)));
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ((java.util.concurrent.CountDownLatch) this.a).countDown();
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.jpc jpcVar3 = (defpackage.jpc) ((defpackage.jqk) this.a).e;
                jpcVar3.f();
                jpcVar3.h();
                if (jpcVar3.j()) {
                    jpcVar3.i();
                    return;
                }
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.wfp.c();
                defpackage.kjb kjbVar = (defpackage.kjb) this.a;
                if (!kjbVar.o) {
                    defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.LIFETIME, defpackage.zbd.pg).l());
                }
                kjbVar.o = false;
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.wfp.b();
                defpackage.kpt kptVar = (defpackage.kpt) this.a;
                defpackage.ysr.aY(kptVar.i != 0, "heartbeat expiration timestamp is not initialized");
                long jP = defpackage.kpt.p();
                if (jP - kptVar.i >= defpackage.acpv.g()) {
                    if (!kptVar.n && jP - kptVar.k >= defpackage.acpv.h()) {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.kpt.a.f()).ai(3351)).y("Session %s obsolete", ((defpackage.kni) kptVar.e.get()).a);
                        kptVar.s();
                        return;
                    }
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.kpt.a.f()).ai(3350)).y("Session %s unfrozen", ((defpackage.kni) kptVar.e.get()).a);
                }
                kptVar.i = defpackage.kpt.p();
                int i5 = kptVar.p;
                if (i5 == 2) {
                    long j3 = kptVar.g;
                    java.util.UUID uuidR = defpackage.kpt.r((defpackage.kni) kptVar.e.get());
                    long jP2 = defpackage.kpt.p();
                    defpackage.zhs zhsVarCp2 = (kptVar.o || kptVar.y()) ? defpackage.ysr.cp(java.lang.Boolean.TRUE) : kptVar.q();
                    defpackage.ysr.cy(zhsVarCp2, new kps(kptVar, uuidR, jP2, j3), kptVar.c);
                    return;
                }
                if (i5 == 3) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.kpt.a.f()).ai(3349)).y("Session %s expired", ((defpackage.kni) kptVar.e.get()).a);
                    kptVar.v(defpackage.yyn.SESSION_EXPIRED, j$.util.OptionalInt.empty(), defpackage.kpt.p());
                    kptVar.s();
                    return;
                }
                return;
            case 9:
                defpackage.wfp.b();
                java.lang.Object obj = this.a;
                defpackage.kpt kptVar2 = (defpackage.kpt) obj;
                kptVar2.l.cancel(false);
                if (kptVar2.o || kptVar2.y()) {
                    zhsVarCp = defpackage.ysr.cp(java.lang.Boolean.TRUE);
                } else {
                    zhsVarCp = (!defpackage.mdp.d().g() || android.bluetooth.BluetoothAdapter.getDefaultAdapter() == null) ? defpackage.ysr.cp(java.lang.Boolean.FALSE) : defpackage.zgh.f(defpackage.kpt.B(), new defpackage.ikt(i), kptVar2.c);
                }
                kptVar2.l = zhsVarCp;
                kptVar2.j = defpackage.kpt.p();
                defpackage.ysr.cy(kptVar2.l, new defpackage.ikx(obj, 3), kptVar2.c);
                return;
            case 10:
                defpackage.kpt kptVar3 = (defpackage.kpt) this.a;
                defpackage.zhs zhsVar = kptVar3.h;
                if (zhsVar == null || zhsVar.isCancelled()) {
                    return;
                }
                kptVar3.w();
                return;
            case 11:
                ((defpackage.mmi) this.a).i();
                return;
            case 12:
                android.app.KeyguardManager keyguardManager = (android.app.KeyguardManager) defpackage.mkp.a.c.getSystemService("keyguard");
                keyguardManager.getClass();
                if (!keyguardManager.isKeyguardLocked()) {
                    ((defpackage.mfx) defpackage.luq.b().a()).b.a(defpackage.mgt.h);
                    return;
                }
                defpackage.mgb mgbVar = (defpackage.mgb) this.a;
                android.os.Handler handler = mgbVar.a;
                handler.getClass();
                handler.postDelayed(mgbVar.b, 250L);
                return;
            case 13:
                if (((defpackage.mfx) defpackage.luq.b().a()).c == null) {
                    ((defpackage.yqj) ((defpackage.yqj) com.google.android.apps.auto.components.preflight.phone.PreflightPhoneWelcomeActivity.n.h()).ai((char) 4916)).u("Preflight session has ended, skipping invalidate runnable");
                    return;
                }
                if (defpackage.mdp.g()) {
                    ((defpackage.yqj) ((defpackage.yqj) com.google.android.apps.auto.components.preflight.phone.PreflightPhoneWelcomeActivity.n.h()).ai((char) 4915)).u("Auth is completed, not showing authorization dialog");
                    return;
                }
                java.lang.Object obj2 = this.a;
                com.google.android.apps.auto.components.preflight.phone.PreflightPhoneWelcomeActivity preflightPhoneWelcomeActivity = (com.google.android.apps.auto.components.preflight.phone.PreflightPhoneWelcomeActivity) obj2;
                if (!preflightPhoneWelcomeActivity.B()) {
                    ((defpackage.yqj) ((defpackage.yqj) com.google.android.apps.auto.components.preflight.phone.PreflightPhoneWelcomeActivity.n.f()).ai((char) 4913)).u("Authorization dialog already shown, not showing on resume");
                    return;
                } else {
                    ((defpackage.yqj) ((defpackage.yqj) com.google.android.apps.auto.components.preflight.phone.PreflightPhoneWelcomeActivity.n.f()).ai((char) 4914)).u("Showing authorization dialog to user on activity resume");
                    preflightPhoneWelcomeActivity.q.f(((defpackage.bc) obj2).a(), "authorization_dialog");
                    return;
                }
            case 14:
                ((defpackage.mhw) this.a).a();
                return;
            case 15:
                defpackage.yqm yqmVar3 = defpackage.nua.a;
                try {
                    this.a.run();
                    return;
                } catch (java.lang.NullPointerException e) {
                    if (android.os.Build.VERSION.SDK_INT >= 30) {
                        throw e;
                    }
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.nua.a.g()).ai((char) 5457)).u("Null pointer exception in calling requestCellInfoUpdate due to timeout.");
                    return;
                }
            case 16:
                ((defpackage.nwy) this.a).g();
                return;
            case 17:
                ((defpackage.ocn) this.a).b();
                return;
            case 18:
                ((defpackage.ofv) this.a).y();
                return;
            case 19:
                java.lang.Object obj3 = this.a;
                synchronized (((defpackage.oiv) obj3).a) {
                    ((defpackage.oiv) obj3).b.b();
                    break;
                }
                return;
            default:
                defpackage.qsk qskVar = (defpackage.qsk) this.a;
                qskVar.g.c(new defpackage.qsi(qskVar, qskVar.k));
                return;
        }
    }

    public /* synthetic */ jpa(java.lang.Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
