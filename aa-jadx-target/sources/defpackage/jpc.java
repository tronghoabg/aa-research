package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jpc implements defpackage.jnr, defpackage.jpz {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.CarConnSessMgr");
    public final android.content.Context b;
    public final defpackage.imi c;
    public final android.os.Handler d;
    public final android.os.Handler e;
    public final defpackage.jnq f;
    public final j$.util.Optional g;
    public volatile defpackage.joz h;
    public volatile iyx i;
    public volatile boolean j;
    public final ipw k;
    private final defpackage.xzi l;
    private final j$.time.Duration m;

    public jpc(android.content.Context context, android.os.Handler handler, android.os.Handler handler2, defpackage.imi imiVar, defpackage.jnq jnqVar) {
        defpackage.imy imyVar = new defpackage.imy(9);
        ipw ipwVarA = null;
        defpackage.ilu iluVar = android.os.Build.VERSION.SDK_INT >= 33 ? new defpackage.ilu(context, 18) : null;
        if (android.os.Build.VERSION.SDK_INT >= 33 && defpackage.acve.a.fF().a()) {
            ipwVarA = ipw.a(context, imiVar.O);
        }
        this.j = false;
        this.b = context;
        this.c = imiVar;
        this.d = handler;
        this.e = handler2;
        this.f = jnqVar;
        this.l = imyVar;
        this.g = j$.util.Optional.ofNullable(iluVar);
        this.m = j$.time.Duration.ofMillis(defpackage.adax.a.fF().d());
        this.k = ipwVarA;
    }

    private final void l() {
        f();
        try {
            defpackage.dlv.n(new defpackage.kqu(this, 1)).get(this.m.toMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 2536)).u("Failed to unrregister vehicle with CDM");
        } catch (java.util.concurrent.TimeoutException e2) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e2)).ai((char) 2537)).u("CDM did not return disappear callback within timeout");
            defpackage.omv.i(this.b, defpackage.yyn.CAR_CONNECTION_CDM_DISAPPEAR_TIMEOUT);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean m() {
        f();
        ((defpackage.yqj) a.l().ai((char) 2532)).u("sendDeviceAppeared to CDM");
        defpackage.omv.i(this.b, defpackage.yyn.CAR_CONNECTION_CDM_REQUESTED);
        try {
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                j$.util.Optional optional = this.g;
                if (true == optional.isPresent()) {
                    ((defpackage.jmb) ((defpackage.xzi) optional.get()).fF()).c();
                }
            }
            return ((java.lang.Boolean) defpackage.dlv.n(new defpackage.rek(this, 1)).get(this.m.toMillis(), java.util.concurrent.TimeUnit.MILLISECONDS)).booleanValue();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 2533)).u("Failed to register vehicle with CDM");
            throw new java.lang.IllegalStateException("Failed to register vehicle with CDM", e);
        } catch (java.util.concurrent.TimeoutException e2) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e2)).ai(2534)).x("CDM did not return appear callback within timeout (%d ms)", this.m.toMillis());
            defpackage.omv.i(this.b, defpackage.yyn.CAR_CONNECTION_CDM_APPEAR_TIMEOUT);
            throw new java.lang.IllegalStateException("CDM did not return appear callback within timeout", e2);
        }
    }

    @Override // defpackage.jnr
    public final void a(long j, java.util.List list, java.util.Map map, android.os.ParcelFileDescriptor parcelFileDescriptor, defpackage.rxf rxfVar) {
        f();
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 2544)).u("Start required services");
        defpackage.omv.g(this.b, "com.google.android.gms.car.GEARHEAD_ENDPOINTS", defpackage.rsr.a.ordinal(), null);
        if (k(j)) {
            this.e.post(new defpackage.jov(this, d(), j, rxfVar, list, map, parcelFileDescriptor));
        } else {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai(2545)).H("Rejecting startRequiredServices call: requested session %d doesn't match active session %d", j, e());
            this.e.post(new jlb(this, rxfVar, 11, (char[]) null));
        }
    }

    @Override // defpackage.jnr
    public final void b(long j) {
        f();
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(2546)).H("Teardown called for session %d, current session is %d", j, e());
        h();
        if (k(j)) {
            i();
        }
    }

    @Override // defpackage.jnr
    public final void c(long j, j$.time.Duration duration, int i, defpackage.thq thqVar, defpackage.rxr rxrVar, java.lang.String str, com.google.android.gms.car.bluetooth.data.CarBluetoothData carBluetoothData) {
        jqn jqnVar;
        int i2;
        f();
        rxrVar.getClass();
        defpackage.yqm yqmVar = a;
        defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(2540);
        java.lang.Long lValueOf = java.lang.Long.valueOf(j);
        yqjVar.R("Starting car connection for session %d (start time %s) of type %d", lValueOf, duration, java.lang.Integer.valueOf(i));
        if (k(j)) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(2543)).x("Session %d is already active", j);
            return;
        }
        int i3 = 4;
        if (android.os.Build.VERSION.SDK_INT >= 33 && !this.j) {
            this.j = m();
            if (!this.j) {
                return;
            }
            if (defpackage.acve.a.fF().a() && this.k != null) {
                this.e.post(new defpackage.jmy(this, i3));
            }
        }
        if (j()) {
            java.lang.Long lE = e();
            lE.getClass();
            lE.longValue();
            defpackage.joz jozVar = this.h;
            jozVar.getClass();
            if (!duration.isZero()) {
                j$.time.Duration duration2 = ((defpackage.joq) jozVar.a).v;
                if (!duration2.isZero() && duration.compareTo(duration2) <= 0 && defpackage.acsj.a.fF().e()) {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(2542)).S("Out-of-order startCarConnection detected for session %d (start time %s). Current active session is %d (start time %s)", lValueOf, duration, lE, duration2);
                    defpackage.omv.i(this.b, defpackage.yyn.CAR_CONNECTION_OUT_OF_ORDER_SESSION);
                }
            }
            defpackage.omv.i(this.b, defpackage.yyn.CAR_CONNECTION_STARTING_NEW_SESSION_OVER_ACTIVE_SESSION);
            ((defpackage.yqj) yqmVar.l().ai((char) 2541)).u("Requesting teardown to clear previous session state");
            this.e.post(new defpackage.jmy(this.h, 6));
            java.lang.Long lE2 = e();
            lE2.getClass();
            b(lE2.longValue());
        }
        if (i == 2) {
            jqnVar = new jqn(this.b, (int) adar.b(), (int) adar.c(), (int) adar.d(), this.c.O);
            i2 = 2;
        } else {
            jqnVar = null;
            i2 = i;
        }
        jqn jbpVar = jqnVar;
        android.content.Context context = this.b;
        android.os.Handler handler = this.e;
        defpackage.jpb jpbVar = new defpackage.jpb(this, j, i2);
        defpackage.imi imiVar = this.c;
        defpackage.joq joqVar = new defpackage.joq(context, j, duration, i2, handler, jpbVar, imiVar, jbpVar, carBluetoothData);
        iyx iyxVar = this.i;
        int i4 = 1;
        if (iyxVar != null) {
            iyxVar.a(0, 1);
        }
        context.getClass();
        defpackage.actb actbVar = defpackage.actb.a;
        defpackage.jap jnmVar = (actbVar.fF().h() && actbVar.fF().l()) ? new defpackage.jnm(context) : new defpackage.jan();
        if (jbpVar == null) {
            jbpVar = new defpackage.jbp(context, defpackage.acox.a.fF().d());
        }
        defpackage.jpd jpdVar = new defpackage.jpd(imiVar.O);
        final boolean z = joqVar.x;
        f();
        defpackage.xzi xziVar = this.l;
        defpackage.yqk yqkVar = defpackage.jbw.a;
        defpackage.jbs jbsVar = new defpackage.jbs();
        jbsVar.b = context;
        jbsVar.x = 2;
        jbsVar.c = xziVar;
        jbsVar.d = joqVar;
        jbsVar.r = jnmVar;
        jbsVar.a = thqVar;
        jbsVar.g = thqVar.a();
        jbsVar.j = thqVar.b();
        jbsVar.k = jbpVar;
        jbsVar.m = 2132017155;
        jbsVar.i = 2132017156;
        jbsVar.h = 2132017154;
        jbsVar.n = 2132083336;
        jbsVar.e = iyxVar;
        jbsVar.o = str;
        jbsVar.t = false;
        defpackage.rmc rmcVarA = defpackage.rmd.a();
        defpackage.acsd acsdVar = defpackage.acsd.a;
        rmcVarA.c(acsdVar.fF().y());
        rmcVarA.b(1000);
        jbsVar.f = rmcVarA.a();
        jbsVar.u = jpdVar;
        defpackage.abor aborVarN = defpackage.jcb.a.n();
        boolean zU = acsdVar.fF().u();
        aborVarN.t();
        defpackage.jcb jcbVar = (defpackage.jcb) aborVarN.b;
        jcbVar.b |= 1;
        jcbVar.c = zU;
        boolean zD = acsdVar.fF().D();
        aborVarN.t();
        defpackage.jcb jcbVar2 = (defpackage.jcb) aborVarN.b;
        jcbVar2.b |= 2;
        jcbVar2.d = zD;
        long jN = acsdVar.fF().n();
        aborVarN.t();
        defpackage.jcb jcbVar3 = (defpackage.jcb) aborVarN.b;
        jcbVar3.b |= 4;
        jcbVar3.e = jN;
        long jQ = acsdVar.fF().q();
        aborVarN.t();
        defpackage.jcb jcbVar4 = (defpackage.jcb) aborVarN.b;
        jcbVar4.b |= 16;
        jcbVar4.g = jQ;
        long jB = acsdVar.fF().b();
        aborVarN.t();
        defpackage.jcb jcbVar5 = (defpackage.jcb) aborVarN.b;
        jcbVar5.b |= 64;
        jcbVar5.i = jB;
        long jM = acsdVar.fF().m();
        aborVarN.t();
        defpackage.jcb jcbVar6 = (defpackage.jcb) aborVarN.b;
        jcbVar6.b |= 8;
        jcbVar6.f = jM;
        long jP = acsdVar.fF().p();
        aborVarN.t();
        defpackage.jcb jcbVar7 = (defpackage.jcb) aborVarN.b;
        jcbVar7.b |= 32;
        jcbVar7.h = jP;
        long jA = acsdVar.fF().a();
        aborVarN.t();
        defpackage.jcb jcbVar8 = (defpackage.jcb) aborVarN.b;
        jcbVar8.b |= 128;
        jcbVar8.j = jA;
        boolean zN = defpackage.a.N();
        aborVarN.t();
        defpackage.jcb jcbVar9 = (defpackage.jcb) aborVarN.b;
        jcbVar9.b |= 256;
        jcbVar9.k = zN;
        defpackage.acnz acnzVar = defpackage.acnz.a;
        boolean zE = acnzVar.fF().e();
        aborVarN.t();
        defpackage.jcb jcbVar10 = (defpackage.jcb) aborVarN.b;
        jcbVar10.b |= 512;
        jcbVar10.l = zE;
        int iG = (int) acsdVar.fF().g();
        aborVarN.t();
        defpackage.jcb jcbVar11 = (defpackage.jcb) aborVarN.b;
        jcbVar11.b |= 1024;
        jcbVar11.m = iG;
        int iH = (int) acsdVar.fF().h();
        aborVarN.t();
        defpackage.jcb jcbVar12 = (defpackage.jcb) aborVarN.b;
        jcbVar12.b |= 2048;
        jcbVar12.n = iH;
        boolean zB = acsdVar.fF().B();
        aborVarN.t();
        defpackage.jcb jcbVar13 = (defpackage.jcb) aborVarN.b;
        jcbVar13.b |= 4096;
        jcbVar13.o = zB;
        boolean z2 = acsdVar.fF().z();
        aborVarN.t();
        defpackage.jcb jcbVar14 = (defpackage.jcb) aborVarN.b;
        jcbVar14.b |= 8192;
        jcbVar14.p = z2;
        boolean zD2 = acnzVar.fF().d();
        aborVarN.t();
        defpackage.jcb jcbVar15 = (defpackage.jcb) aborVarN.b;
        jcbVar15.b |= 16384;
        jcbVar15.q = zD2;
        jbsVar.v = (defpackage.jcb) aborVarN.q();
        jbsVar.l = "GmsCore_OpenSSL";
        jbsVar.w = new defpackage.wdb(imiVar, i4);
        if (i2 == 1) {
            defpackage.jaf jafVarA = defpackage.jag.a();
            jafVarA.e(jbsVar.v);
            jafVarA.c(1);
            jbsVar.p = jafVarA.a();
        } else if (i2 == 2) {
            defpackage.jaf jafVarA2 = defpackage.jag.a();
            jafVarA2.e(jbsVar.v);
            jafVarA2.c(2);
            int i5 = jbsVar.v.m;
            if (i5 > 0) {
                jafVarA2.d(i5);
            }
            int i6 = jbsVar.v.n;
            if (i6 > 0) {
                jafVarA2.b(i6);
            }
            jbsVar.p = jafVarA2.a();
        }
        final boolean z3 = android.os.Build.VERSION.SDK_INT >= 30;
        jbsVar.y = new defpackage.fbl(new defpackage.jdb() { // from class: jeg
            @Override // defpackage.jdb
            public final defpackage.jdc a(defpackage.jbq jbqVar) {
                int i7 = jbqVar.u;
                boolean z4 = z;
                if (i7 == 1) {
                    return new defpackage.jeh(z4, 0);
                }
                if (i7 == 9) {
                    return defpackage.jdc.a;
                }
                if (i7 == 3 || i7 == 4 || i7 == 5) {
                    return z4 ? defpackage.jdc.b : defpackage.jdc.a;
                }
                return defpackage.jdc.b;
            }
        }, new defpackage.jdb() { // from class: jef
            @Override // defpackage.jdb
            public final defpackage.jdc a(defpackage.jbq jbqVar) {
                int i7 = jbqVar.u;
                boolean z4 = z;
                if (i7 == 1) {
                    return new defpackage.jeh(z4, 1);
                }
                if (i7 == 7) {
                    return z3 ? defpackage.jdc.b : defpackage.jdc.a;
                }
                if (i7 == 9) {
                    return defpackage.jdc.a;
                }
                if (i7 == 3 || i7 == 4 || i7 == 5) {
                    return z4 ? defpackage.jdc.b : defpackage.jdc.a;
                }
                return defpackage.jdc.b;
            }
        });
        jbsVar.q = new defpackage.jcy(new defpackage.jdb() { // from class: jeg
            @Override // defpackage.jdb
            public final defpackage.jdc a(defpackage.jbq jbqVar) {
                int i7 = jbqVar.u;
                boolean z4 = z;
                if (i7 == 1) {
                    return new defpackage.jeh(z4, 0);
                }
                if (i7 == 9) {
                    return defpackage.jdc.a;
                }
                if (i7 == 3 || i7 == 4 || i7 == 5) {
                    return z4 ? defpackage.jdc.b : defpackage.jdc.a;
                }
                return defpackage.jdc.b;
            }
        }, new defpackage.jdb() { // from class: jef
            @Override // defpackage.jdb
            public final defpackage.jdc a(defpackage.jbq jbqVar) {
                int i7 = jbqVar.u;
                boolean z4 = z;
                if (i7 == 1) {
                    return new defpackage.jeh(z4, 1);
                }
                if (i7 == 7) {
                    return z3 ? defpackage.jdc.b : defpackage.jdc.a;
                }
                if (i7 == 9) {
                    return defpackage.jdc.a;
                }
                if (i7 == 3 || i7 == 4 || i7 == 5) {
                    return z4 ? defpackage.jdc.b : defpackage.jdc.a;
                }
                return defpackage.jdc.b;
            }
        });
        if (acsdVar.fF().C()) {
            defpackage.absn absnVarT = acsdVar.fF().t();
            defpackage.abor aborVarN2 = defpackage.xjw.a.n();
            defpackage.abor aborVarN3 = defpackage.xnh.a.n();
            int i7 = absnVarT.e;
            aborVarN3.t();
            defpackage.xnh xnhVar = (defpackage.xnh) aborVarN3.b;
            xnhVar.b |= 8;
            xnhVar.f = i7;
            int i8 = absnVarT.b;
            aborVarN3.t();
            defpackage.xnh xnhVar2 = (defpackage.xnh) aborVarN3.b;
            xnhVar2.b |= 1;
            xnhVar2.c = i8;
            int i9 = absnVarT.c;
            aborVarN3.t();
            defpackage.xnh xnhVar3 = (defpackage.xnh) aborVarN3.b;
            xnhVar3.b |= 2;
            xnhVar3.d = i9;
            int i10 = absnVarT.d;
            aborVarN3.t();
            defpackage.xnh xnhVar4 = (defpackage.xnh) aborVarN3.b;
            xnhVar4.b |= 4;
            xnhVar4.e = i10;
            defpackage.xnh xnhVar5 = (defpackage.xnh) aborVarN3.q();
            aborVarN2.t();
            defpackage.xjw xjwVar = (defpackage.xjw) aborVarN2.b;
            xnhVar5.getClass();
            xjwVar.c = xnhVar5;
            xjwVar.b |= 1;
            jbsVar.s = (defpackage.xjw) aborVarN2.q();
            ((defpackage.yqj) yqmVar.l().ai((char) 2520)).y("Set GAL connection ping configuration Ping to: %s", absnVarT);
        }
        defpackage.jbw jbwVar = new defpackage.jbw(jbsVar);
        defpackage.skd skdVar = new defpackage.skd(joqVar);
        joqVar.l = jbwVar;
        joqVar.z = skdVar;
        this.h = new defpackage.joz(joqVar, rxrVar);
        handler.post(new defpackage.aq((defpackage.jnp) joqVar, rxrVar, 19));
    }

    public final defpackage.jnp d() {
        f();
        defpackage.joz jozVar = this.h;
        jozVar.getClass();
        return jozVar.a;
    }

    public final java.lang.Long e() {
        f();
        if (j()) {
            return java.lang.Long.valueOf(((defpackage.joq) d()).c);
        }
        return null;
    }

    public final void f() {
        defpackage.ysr.bk(this.d.getLooper() == android.os.Looper.myLooper(), "Must be called on the connection session manager thread");
    }

    public final void g(int i, long j) {
        f();
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 2530)).u("Revoking active session");
        this.h = null;
        defpackage.jqb jqbVar = (defpackage.jqb) this.f;
        jqbVar.i.set(-1, false);
        java.util.Set set = jqbVar.d;
        synchronized (set) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                defpackage.qxc qxcVar = (defpackage.qxc) it.next();
                try {
                    qxcVar.c();
                } catch (android.os.RemoteException unused) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.jqb.a.f()).ai(2587)).y("RemoteException notifying listener %s onDisconnected.", new defpackage.zkf(defpackage.zke.a, qxcVar));
                    it.remove();
                }
            }
        }
        if (i == 1) {
            if (jqbVar.j.remove(java.lang.Long.valueOf(j))) {
                jqbVar.g.c(defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, defpackage.zbe.CAR_SERVICE, defpackage.zbd.ui).l());
            } else {
                ((defpackage.yqj) ((defpackage.yqj) defpackage.jqb.a.h()).ai(2586)).x("Car connection with sessionId %d not started", j);
                jqbVar.g.c(defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, defpackage.zbe.CAR_SERVICE, defpackage.zbd.uj).l());
            }
        }
    }

    public final void h() {
        if (this.j) {
            l();
            if (android.os.Build.VERSION.SDK_INT >= 33 && defpackage.acve.a.fF().a()) {
                this.e.post(new defpackage.jmy(this, 5));
            }
            this.j = false;
        }
    }

    public final void i() {
        f();
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 2547)).u("Tearing down active session");
        defpackage.jnp jnpVarD = d();
        defpackage.joq joqVar = (defpackage.joq) jnpVarD;
        g(joqVar.d, joqVar.c);
        this.e.post(new defpackage.jmy(jnpVarD, 7, null));
    }

    public final boolean j() {
        f();
        return this.h != null;
    }

    public final boolean k(long j) {
        f();
        return j() && ((defpackage.joq) d()).c == j;
    }
}
