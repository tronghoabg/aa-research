package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class ref implements defpackage.rcz, defpackage.rpv, defpackage.rpw {
    public final defpackage.reu a;
    final defpackage.rda b;
    public final android.os.Looper c;
    public final java.util.UUID d;
    public final java.util.concurrent.atomic.AtomicMarkableReference e;
    public defpackage.rps f;
    public final defpackage.rkq g;
    public final defpackage.lam h;
    public final defpackage.lam i;
    public final defpackage.lam j;
    public final defpackage.lam k;

    protected ref(android.os.Looper looper) {
        defpackage.rkq rkqVar = new defpackage.rkq();
        final int i = 1;
        this.h = new defpackage.lam(new defpackage.rdj(this, i), new defpackage.rfa() { // from class: rdk
            @Override // defpackage.rfa
            public final void a(java.lang.Object obj) {
                int i2 = i;
                if (i2 == 0) {
                    ((defpackage.qvt) obj).a();
                    return;
                }
                if (i2 == 1) {
                    ((defpackage.qvq) obj).a();
                } else if (i2 != 2) {
                    ((defpackage.rqa) obj).a();
                } else {
                    ((defpackage.qvn) obj).a();
                }
            }
        });
        final int i2 = 0;
        this.i = new defpackage.lam(new defpackage.rdj(this, i2), new defpackage.rfa() { // from class: rdk
            @Override // defpackage.rfa
            public final void a(java.lang.Object obj) {
                int i3 = i2;
                if (i3 == 0) {
                    ((defpackage.qvt) obj).a();
                    return;
                }
                if (i3 == 1) {
                    ((defpackage.qvq) obj).a();
                } else if (i3 != 2) {
                    ((defpackage.rqa) obj).a();
                } else {
                    ((defpackage.qvn) obj).a();
                }
            }
        });
        final int i3 = 2;
        this.j = new defpackage.lam(new defpackage.rdj(this, i3), new defpackage.rfa() { // from class: rdk
            @Override // defpackage.rfa
            public final void a(java.lang.Object obj) {
                int i4 = i3;
                if (i4 == 0) {
                    ((defpackage.qvt) obj).a();
                    return;
                }
                if (i4 == 1) {
                    ((defpackage.qvq) obj).a();
                } else if (i4 != 2) {
                    ((defpackage.rqa) obj).a();
                } else {
                    ((defpackage.qvn) obj).a();
                }
            }
        });
        final int i4 = 3;
        this.k = new defpackage.lam(new defpackage.rdj(this, i4), new defpackage.rfa() { // from class: rdk
            @Override // defpackage.rfa
            public final void a(java.lang.Object obj) {
                int i5 = i4;
                if (i5 == 0) {
                    ((defpackage.qvt) obj).a();
                    return;
                }
                if (i5 == 1) {
                    ((defpackage.qvq) obj).a();
                } else if (i5 != 2) {
                    ((defpackage.rqa) obj).a();
                } else {
                    ((defpackage.qvn) obj).a();
                }
            }
        });
        this.a = new defpackage.reu();
        this.d = java.util.UUID.randomUUID();
        this.e = new java.util.concurrent.atomic.AtomicMarkableReference(null, false);
        this.f = new defpackage.rps(new defpackage.nyj(i3));
        this.c = looper;
        this.g = rkqVar;
        this.b = new defpackage.rec(this);
    }

    private final defpackage.zkf O() {
        return new defpackage.zkf(defpackage.zke.a, getClass().getName() + "@" + java.lang.Integer.toHexString(hashCode()));
    }

    @Override // defpackage.rpw
    public final int A(final java.lang.String str, final int i) throws defpackage.qst {
        return ((java.lang.Integer) this.f.e(new defpackage.rzz() { // from class: rea
            @Override // defpackage.rzz, java.util.concurrent.Callable
            public final java.lang.Object call() {
                return java.lang.Integer.valueOf(this.a.C().fn(str, i));
            }
        })).intValue();
    }

    public final int B(java.lang.String str, int i) {
        try {
            return A(str, i);
        } catch (defpackage.qst e) {
            defpackage.rrx.d(5, "CAR.CLIENT", e, "Unable to connect to car service to get %s. Using default value %s", str, java.lang.Integer.valueOf(i));
            return i;
        }
    }

    public abstract defpackage.qvl C() throws android.os.RemoteException;

    @Override // defpackage.rpw
    public final java.lang.String D(final java.lang.String str, final java.lang.String str2) throws defpackage.qst {
        return (java.lang.String) this.f.e(new defpackage.rzz() { // from class: rdh
            @Override // defpackage.rzz, java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.a.C().Y(str, str2);
            }
        });
    }

    public final void E() {
        if (defpackage.omv.c("CAR.CLIENT", 3)) {
            defpackage.zkf zkfVarO = O();
            defpackage.rda rdaVar = this.b;
            defpackage.zke zkeVar = defpackage.zke.a;
            defpackage.rrx.d(3, "CAR.CLIENT", null, "onClientConnected() %s, registering localCarConnectionListener %s with multiplex listener %s", zkfVarO, new defpackage.zkf(zkeVar, rdaVar), new defpackage.zkf(zkeVar, this.a));
        }
        defpackage.reu reuVar = this.a;
        reuVar.f(this.b);
        if (defpackage.omv.c("CAR.CLIENT", 3)) {
            defpackage.rrx.d(3, "CAR.CLIENT", null, "Registering multiplex listener %s with car service", new defpackage.zkf(defpackage.zke.a, reuVar));
        }
        defpackage.rps rpsVar = this.f;
        try {
            new defpackage.saa() { // from class: rdr
                @Override // defpackage.saa
                public final void a() throws android.os.RemoteException {
                    defpackage.ref refVar = this.a;
                    refVar.C().aM(refVar.a);
                }
            }.a();
        } catch (android.os.RemoteException e) {
            rpsVar.i(e);
        }
    }

    public final void F(defpackage.rda rdaVar) {
        if (defpackage.omv.c("CAR.CLIENT", 3)) {
            defpackage.zke zkeVar = defpackage.zke.a;
            defpackage.rrx.d(3, "CAR.CLIENT", null, "Registering CarConnectionListener %s with multiplex listener %s", new defpackage.zkf(zkeVar, rdaVar), new defpackage.zkf(zkeVar, this.a));
        }
        this.a.f(rdaVar);
    }

    public void G() {
        int i = 3;
        if (defpackage.omv.c("CAR.CLIENT", 3)) {
            defpackage.rrx.d(3, "CAR.CLIENT", null, "tearDown() %s", O());
        }
        defpackage.reu reuVar = this.a;
        reuVar.g(this.b);
        reuVar.c();
        reuVar.d();
        I();
        try {
            C().bg(reuVar);
        } catch (android.os.RemoteException | java.lang.IllegalStateException unused) {
        }
        this.e.set(null, false);
        defpackage.rkq rkqVar = this.g;
        rkqVar.f(qsp.class, new defpackage.rdi(i));
        rkqVar.e(defpackage.rkc.class);
    }

    protected final void H() {
        int i = 1;
        int i2 = 0;
        if (defpackage.omv.c("CAR.CLIENT", 3)) {
            defpackage.rrx.d(3, "CAR.CLIENT", null, "tearDownCarManagers() %s", O());
        }
        defpackage.rkq rkqVar = this.g;
        rkqVar.f(defpackage.ros.class, new defpackage.qhx(8));
        rkqVar.f(rfz.class, new defpackage.qhx(15));
        rkqVar.f(defpackage.rov.class, new defpackage.qhx(16));
        rkqVar.f(defpackage.qsb.class, new defpackage.qhx(17));
        rkqVar.f(defpackage.qsr.class, new defpackage.qhx(18));
        rkqVar.f(defpackage.roz.class, new defpackage.qhx(19));
        rkqVar.f(defpackage.rpb.class, new defpackage.qhx(20));
        rkqVar.f(qsv.class, new defpackage.rdi(i));
        rkqVar.f(defpackage.rpe.class, new defpackage.rdi(i2));
        rkqVar.f(defpackage.rkp.class, new defpackage.rdi(2));
        rkqVar.h(defpackage.sax.class, new defpackage.qhx(9));
        rkqVar.g(rpg.class);
        rkqVar.h(defpackage.ret.class, new defpackage.qhx(10));
        rkqVar.h(rko.class, new defpackage.qhx(11));
        rkqVar.f(defpackage.rjf.class, new defpackage.qhx(12));
        rkqVar.f(rif.class, new defpackage.qhx(13));
        rkqVar.h(rkn.class, new defpackage.qhx(14));
        try {
            rkqVar.g(defpackage.row.class);
        } catch (java.lang.NoClassDefFoundError e) {
            defpackage.rrx.d(5, "CAR.CLIENT", e, "Couldn't clear CarDisplayInfoManagerImpl cache as class not loaded from SDK.", new java.lang.Object[0]);
        }
    }

    public final void I() {
        if (defpackage.omv.c("CAR.CLIENT", 3)) {
            defpackage.rrx.d(3, "CAR.CLIENT", null, "tearDownProjectionSessionState() %s", O());
        }
        H();
        this.i.D();
        this.h.D();
        this.j.D();
        this.k.D();
        this.e.compareAndSet(null, null, true, false);
    }

    @java.lang.Deprecated
    public final void J(defpackage.rdf rdfVar) {
        try {
            L(com.google.android.gms.car.display.CarDisplayId.a).c(rdfVar);
        } catch (java.lang.IllegalStateException | defpackage.qst e) {
            defpackage.rrx.d(5, "CAR.CLIENT", e, "Couldn't unregister listener: %s", rdfVar);
        }
    }

    @Override // defpackage.rpv
    public final boolean K(defpackage.rpt rptVar) {
        defpackage.rps rpsVar = this.f;
        defpackage.rdx rdxVar = new defpackage.rdx(this, rptVar, 1);
        boolean z = rptVar.g;
        return ((java.lang.Boolean) rpsVar.d(rdxVar, java.lang.Boolean.FALSE)).booleanValue();
    }

    public final defpackage.ret L(com.google.android.gms.car.display.CarDisplayId carDisplayId) throws defpackage.qst {
        return (defpackage.ret) this.f.b(new defpackage.rdx(this, carDisplayId, 3));
    }

    public final defpackage.ret M(com.google.android.gms.car.display.CarDisplayId carDisplayId) throws android.os.RemoteException {
        return (defpackage.ret) this.g.c(defpackage.ret.class, carDisplayId.a(), new defpackage.rds(this, carDisplayId, 0));
    }

    @Override // defpackage.rpw
    public final boolean N(java.lang.String str) throws defpackage.qst {
        return ((java.lang.Boolean) this.f.e(new defpackage.rdx(this, str, 0))).booleanValue();
    }

    @Override // defpackage.rcz
    public final int a() throws defpackage.qst {
        return ((java.lang.Integer) this.f.b(new defpackage.rdg(this, 4))).intValue();
    }

    @Override // defpackage.rcz
    public final defpackage.qsb b() throws defpackage.qsu, defpackage.qst {
        return (defpackage.qsb) this.f.a(new defpackage.rdg(this, 17));
    }

    @Override // defpackage.rcz
    public final com.google.android.gms.car.CarInfo c() throws defpackage.qst {
        return (com.google.android.gms.car.CarInfo) this.f.b(new defpackage.rdo(this, 5));
    }

    @Override // defpackage.rcz
    public final qsv d() throws defpackage.qsu, defpackage.qst {
        return (qsv) this.f.a(new defpackage.rdg(this, 2));
    }

    @Override // defpackage.rcz
    public final defpackage.rjf e() throws defpackage.qsu, defpackage.qst {
        return (defpackage.rjf) this.f.a(new defpackage.rdo(this, 6));
    }

    @Override // defpackage.rcz
    public final defpackage.rkp f() throws defpackage.qsu, defpackage.qst {
        return (defpackage.rkp) this.f.a(new defpackage.rdo(this, 2));
    }

    @Override // defpackage.rcz
    public final defpackage.rkq g() throws defpackage.qsu, defpackage.qst {
        return (defpackage.rkq) this.f.a(new defpackage.rdo(this, 3));
    }

    @Override // defpackage.rcz
    public final defpackage.sax h(com.google.android.gms.car.display.CarDisplayId carDisplayId) throws defpackage.qsu, defpackage.qst {
        return (defpackage.sax) this.f.a(new defpackage.rdx(this, carDisplayId, 2));
    }

    @Override // defpackage.rcz
    public final java.util.List i(android.content.Intent intent, int i) throws defpackage.qst {
        return (java.util.List) this.f.b(new defpackage.rdl(this, intent, i, 2));
    }

    @Override // defpackage.rcz
    public final java.util.List j(android.content.Intent intent, int i) throws defpackage.qst {
        return (java.util.List) this.f.b(new defpackage.rdl(this, intent, i, 3));
    }

    @Override // defpackage.rcz
    public final java.util.List k(android.content.Intent intent, int i) throws defpackage.qst {
        return (java.util.List) this.f.b(new defpackage.rdl(this, intent, i, 1));
    }

    @Override // defpackage.rcz
    public final java.util.List l(android.content.Intent intent, int i) throws defpackage.qst {
        return (java.util.List) this.f.b(new defpackage.rdl(this, intent, i, 4));
    }

    @Override // defpackage.rcz
    public final void m(byte[] bArr, defpackage.yyh yyhVar) throws defpackage.qst {
        this.f.k(new defpackage.rdv(this, bArr, yyhVar, 3));
    }

    @Override // defpackage.rcz
    public final void n(final java.lang.String str, final boolean z) throws defpackage.qst {
        this.f.k(new defpackage.saa() { // from class: rdz
            @Override // defpackage.saa
            public final void a() throws android.os.RemoteException {
                this.a.C().aR(str, z);
            }
        });
    }

    @Override // defpackage.rcz
    public final void o(java.lang.String str, java.lang.String str2) throws defpackage.qst {
        this.f.k(new defpackage.rdv(this, str, str2, 0));
    }

    @Override // defpackage.rcz
    public final boolean p(defpackage.rbf rbfVar) {
        java.util.concurrent.atomic.AtomicMarkableReference atomicMarkableReference = this.e;
        defpackage.yhx yhxVar = (defpackage.yhx) atomicMarkableReference.getReference();
        if (yhxVar == null) {
            boolean z = defpackage.rrx.a;
            defpackage.rrx.d(4, "CAR.CLIENT", null, "carModuleFeaturesCache empty, retrieving from car service.", new java.lang.Object[0]);
            yhxVar = (defpackage.yhx) this.f.c(new defpackage.rdo(this, 0));
            if (yhxVar == null) {
                defpackage.rrx.d(5, "CAR.CLIENT", null, "Failed to get module features from car service. Returning false for hasCarModuleFeature(%s).", new defpackage.zkf(defpackage.zke.a, rbfVar.name()));
                return false;
            }
            if (yhxVar.isEmpty()) {
                defpackage.rrx.d(5, "CAR.CLIENT", null, "Module features are empty!", new java.lang.Object[0]);
            }
            if (atomicMarkableReference.compareAndSet(null, yhxVar, true, true)) {
                defpackage.rrx.d(4, "CAR.CLIENT", null, "Set carModuleFeaturesCache: %s", new defpackage.zkf(defpackage.zke.a, yhxVar));
            }
        }
        return yhxVar.contains(rbfVar.name());
    }

    @Override // defpackage.rcz
    public final boolean q(java.lang.String str, int i) throws defpackage.qst {
        return ((java.lang.Boolean) this.f.b(new defpackage.rdl(this, str, i, 0))).booleanValue();
    }

    @Override // defpackage.rcz
    public final defpackage.ros r() throws defpackage.qsu, defpackage.qst {
        return (defpackage.ros) this.f.a(new defpackage.rdg(this, 20));
    }

    @Override // defpackage.rcz
    public final defpackage.rov s() throws defpackage.qsu, defpackage.qst {
        return (defpackage.rov) this.f.a(new defpackage.rdg(this, 16));
    }

    @Override // defpackage.rcz
    public final defpackage.row t(com.google.android.gms.car.display.CarDisplayId carDisplayId) throws defpackage.qsu, defpackage.qst {
        return (defpackage.row) this.f.a(new defpackage.rdx(this, carDisplayId, 4));
    }

    @Override // defpackage.rcz
    public final defpackage.rox u() {
        return (defpackage.rox) this.g.d(defpackage.rox.class, new rdw(0));
    }

    @Override // defpackage.rcz
    public final defpackage.roy v() {
        return (defpackage.roy) this.g.d(defpackage.roy.class, new defpackage.kpe(this, 4));
    }

    @Override // defpackage.rcz
    public final defpackage.roz w() throws defpackage.qst {
        return (defpackage.roz) this.f.b(new defpackage.rdg(this, 8));
    }

    @Override // defpackage.rcz
    public final defpackage.rpb x() throws defpackage.qsu, defpackage.qst {
        return (defpackage.rpb) this.f.a(new defpackage.rdg(this, 7));
    }

    @Override // defpackage.rcz
    public final defpackage.rpe y() throws defpackage.qsu, defpackage.qst {
        return (defpackage.rpe) this.f.a(new defpackage.rdo(this, 4));
    }

    @Override // defpackage.rcz
    public final void z(final android.content.Intent intent, final android.os.Bundle bundle) throws defpackage.qst {
        if (p(defpackage.rbf.i)) {
            for (defpackage.oml omlVar : defpackage.qrf.a.values()) {
            }
            this.f.g(new defpackage.saa() { // from class: reb
                @Override // defpackage.saa
                public final void a() throws android.os.RemoteException {
                    defpackage.qvl qvlVarC = this.a.C();
                    android.content.Intent intent2 = intent;
                    if (!qvlVarC.bA(intent2, bundle)) {
                        throw new java.lang.IllegalArgumentException("No matching component for intent: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(intent2))));
                    }
                }
            });
            return;
        }
        if (defpackage.omv.c("CAR.CLIENT", 5)) {
            defpackage.rrx.d(5, "CAR.CLIENT", null, "startCarActivity(Intent, Bundle, boolean) not supported by module. Falling back to startCarActivity(Intent, boolean).", new java.lang.Object[0]);
        }
        for (defpackage.oml omlVar2 : defpackage.qrf.a.values()) {
        }
        this.f.g(new defpackage.rdp(this, intent, 3));
    }
}
