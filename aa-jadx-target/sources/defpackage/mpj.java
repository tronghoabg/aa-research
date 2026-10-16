package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mpj implements defpackage.qrl, defpackage.lhn, defpackage.mnj {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.ActivityTracker");
    public static final defpackage.yhx b = defpackage.yhx.q("com.google.android.projection.gearhead.pctsverifier", "com.google.android.projection.gearhead", "com.google.android.googlequicksearchbox");
    public boolean f;
    public boolean g;
    public final defpackage.yhx c = defpackage.yhx.q(defpackage.mkt.y, defpackage.mkt.z, defpackage.mkt.g);
    public final java.util.List d = new java.util.concurrent.CopyOnWriteArrayList();
    public final java.util.Map e = new java.util.HashMap();
    public final defpackage.mpi h = new defpackage.mpi();
    public final defpackage.wyz i = new defpackage.wyz(this);
    private final defpackage.wyz j = new defpackage.wyz((java.lang.Object) this);

    public static defpackage.mpj b() {
        return (defpackage.mpj) defpackage.mkp.a.i(defpackage.mpj.class);
    }

    public static void l(java.lang.Object obj, com.google.android.gms.car.display.CarRegionId carRegionId, defpackage.eqs eqsVar) {
        android.util.ArrayMap arrayMap = new android.util.ArrayMap();
        java.util.Map map = (java.util.Map) eqsVar.e();
        if (map != null) {
            arrayMap.putAll(map);
        }
        if (obj == null) {
            arrayMap.remove(carRegionId);
        } else {
            arrayMap.put(carRegionId, obj);
        }
        defpackage.ntk ntkVarR = defpackage.lyd.r();
        defpackage.kit.b().e();
        defpackage.ygw ygwVarA = ntkVarR.a(carRegionId);
        int size = ygwVarA.size();
        for (int i = 0; i < size; i++) {
            com.google.android.gms.car.display.CarRegionId carRegionId2 = (com.google.android.gms.car.display.CarRegionId) ygwVarA.get(i);
            if (obj == null) {
                arrayMap.remove(carRegionId2);
            } else {
                arrayMap.put(carRegionId2, obj);
            }
        }
        eqsVar.m(arrayMap);
    }

    public static final boolean n(defpackage.mqj mqjVar, defpackage.mqj mqjVar2) {
        defpackage.mqi mqiVar = mqjVar2 == null ? null : mqjVar2.a;
        defpackage.mqi mqiVar2 = mqjVar != null ? mqjVar.a : null;
        return mqiVar2 != null && mqiVar2.equals(mqiVar);
    }

    public static int o(defpackage.mqg mqgVar) {
        int iOrdinal = mqgVar.ordinal();
        if (iOrdinal == 1) {
            return 2;
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? 5 : 4;
        }
        return 3;
    }

    public final defpackage.mpg a(com.google.android.gms.car.display.CarRegionId carRegionId) {
        java.util.Map map = this.e;
        if (!map.containsKey(carRegionId)) {
            map.put(carRegionId, new defpackage.mpg());
        }
        return (defpackage.mpg) map.get(carRegionId);
    }

    @Override // defpackage.lhn
    public final void d() {
        if (this.f) {
            int i = 0;
            this.f = false;
            java.util.Map map = this.e;
            for (com.google.android.gms.car.display.CarRegionId carRegionId : map.keySet()) {
                defpackage.mpg mpgVarA = a(carRegionId);
                if (j$.util.Objects.equals(mpgVarA.b, carRegionId)) {
                    ((defpackage.yqj) a.l().ai(5153)).M("Logging stop for car region %s current app %s", carRegionId, mpgVarA.c);
                    i(null, carRegionId);
                }
            }
            map.clear();
            defpackage.mpi mpiVar = this.h;
            mam mamVar = new mam(3);
            if (mpiVar.n()) {
                mpiVar.a = mamVar;
            } else {
                mpiVar.m(new java.util.HashMap());
            }
            if (defpackage.kit.b().q()) {
                defpackage.rei reiVarD = ((defpackage.qtv) defpackage.kit.b().e()).d();
                reiVarD.h.F(new defpackage.rdn(this, i));
                if (this.g) {
                    defpackage.qsh qshVarE = defpackage.kit.b().e();
                    defpackage.wyz wyzVar = this.i;
                    defpackage.rei reiVarD2 = ((defpackage.qtv) qshVarE).d();
                    if (defpackage.omv.c("CAR.CLIENT", 3)) {
                        defpackage.rrx.a("CAR.CLIENT", null, "Multi-display client enabled. UnregisterCarActivityLifecycleEventListener");
                    }
                    reiVarD2.j.F(new defpackage.rdn(wyzVar, 1));
                    this.g = false;
                }
            }
            this.d.clear();
            defpackage.lyd.r().f(this.j);
            defpackage.mni.a().d(defpackage.mnh.a);
        }
    }

    public final defpackage.mqj e(com.google.android.gms.car.display.CarRegionId carRegionId) {
        return a(carRegionId).c;
    }

    @Override // defpackage.lhn
    public final void eQ() {
        if (this.f) {
            return;
        }
        this.e.clear();
        this.h.m(new java.util.HashMap());
        defpackage.mkp.a.g();
        defpackage.kgu.d(new defpackage.kyo(this, 7), "GH.ActivityTracker", defpackage.zbe.ACTIVITY_TRACKER, defpackage.zbd.pd, "Error registering activity listener.", new java.lang.Object[0]);
        defpackage.lyd.r().e(this.j);
        defpackage.mni.a().b(defpackage.mnh.a, this);
    }

    public final defpackage.mqj f() {
        return e(com.google.android.gms.car.display.CarRegionId.a);
    }

    public final void g(defpackage.mph mphVar) {
        this.d.add(mphVar);
    }

    @Override // defpackage.mnj
    public final void h(java.io.PrintWriter printWriter) {
        for (java.util.Map.Entry entry : this.e.entrySet()) {
            printWriter.println("------- " + java.lang.String.valueOf(entry.getKey()) + " -------");
            printWriter.println("Current app " + java.lang.String.valueOf(((defpackage.mpg) entry.getValue()).c) + " on region " + java.lang.String.valueOf(((defpackage.mpg) entry.getValue()).b));
        }
        printWriter.println("activeProjectionApps: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.h.e()))));
    }

    public final void i(defpackage.mqj mqjVar, com.google.android.gms.car.display.CarRegionId carRegionId) {
        defpackage.mpg mpgVarA = a(carRegionId);
        defpackage.mqj mqjVar2 = mpgVarA.c;
        if (n(mqjVar, mqjVar2)) {
            return;
        }
        if (mqjVar2 != null) {
            com.google.android.gms.car.display.CarRegionId carRegionId2 = (com.google.android.gms.car.display.CarRegionId) new defpackage.nub(mpgVarA.b).i(carRegionId);
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - a(carRegionId2).d;
            android.content.ComponentName componentNameA = mqjVar2.a();
            defpackage.oim oimVarU = defpackage.omf.u();
            defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PROJECTION_CONTEXT, defpackage.zbd.Mv);
            rrvVarH.p(componentNameA);
            rrvVarH.u(jElapsedRealtime);
            rrvVarH.n(carRegionId2);
            oimVarU.F(rrvVarH.l());
            defpackage.omf.u().r(o(mqjVar2.b), componentNameA, jElapsedRealtime, carRegionId2);
        }
        if (mqjVar != null) {
            android.content.ComponentName componentNameA2 = mqjVar.a();
            defpackage.oim oimVarU2 = defpackage.omf.u();
            defpackage.rrv rrvVarH2 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PROJECTION_CONTEXT, defpackage.zbd.Mu);
            rrvVarH2.p(componentNameA2);
            rrvVarH2.n(carRegionId);
            oimVarU2.F(rrvVarH2.l());
            defpackage.omf.u().s(o(mqjVar.b), componentNameA2, carRegionId);
        }
    }

    public final void j(defpackage.mph mphVar) {
        this.d.remove(mphVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(com.google.android.gms.car.display.CarRegionId carRegionId, defpackage.mqj mqjVar, long j) {
        defpackage.ntk ntkVarR = defpackage.lyd.r();
        defpackage.kit.b().e();
        defpackage.ygw ygwVarA = ntkVarR.a(carRegionId);
        int size = ygwVarA.size();
        for (int i = 0; i < size; i++) {
            defpackage.mpg mpgVarA = a((com.google.android.gms.car.display.CarRegionId) ygwVarA.get(i));
            mpgVarA.c = mqjVar;
            if (mqjVar == null) {
                mpgVarA.b = null;
            } else {
                mpgVarA.b = carRegionId;
                mpgVarA.d = j;
            }
        }
    }

    public final boolean m() {
        if (this.f) {
            return defpackage.acyc.aN() && !defpackage.kit.b().p();
        }
        return true;
    }
}
