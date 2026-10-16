package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mpk implements defpackage.lhn, defpackage.qrm {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.ProjectionContext");
    public boolean b;
    private final java.util.List c = new java.util.ArrayList();
    private final java.util.List d = new java.util.ArrayList();
    private final java.util.List e = new java.util.ArrayList();
    private boolean f;

    public static defpackage.mpk a() {
        return (defpackage.mpk) defpackage.mkp.a.i(defpackage.mpk.class);
    }

    public final defpackage.mqi b(android.content.Intent intent) {
        defpackage.mqi mqiVarE = defpackage.mpb.e(intent);
        android.content.ComponentName componentName = mqiVarE == null ? null : mqiVarE.a;
        for (defpackage.moz mozVar : this.d) {
            if (mozVar.b.equals(componentName)) {
                defpackage.mqi mqiVarH = mozVar.h();
                if (mqiVarH == null) {
                    break;
                }
                return mqiVarH;
            }
        }
        return mqiVarE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.lhn
    public final void d() throws wfo {
        defpackage.wfp.c();
        if (this.b) {
            if (defpackage.kit.b().q()) {
                defpackage.mkp.a.g();
                defpackage.rei reiVarD = ((defpackage.qtv) defpackage.kit.b().e()).d();
                if (defpackage.omv.c("CAR.CLIENT", 3)) {
                    defpackage.rrx.a("CAR.CLIENT", null, "UnregisterCarActivityLifecycleEventProcessor");
                }
                reiVarD.i.F(new defpackage.rdn(this, 2));
            }
            this.b = false;
        }
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f = false;
    }

    @Override // defpackage.qrm
    public final void e(android.content.Intent intent) {
        if (this.f) {
            i(intent);
        } else {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 5160)).y("Attempting to start %s out of lifetime. Doing nothing", intent);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.lhn
    public final void eQ() throws wfo {
        defpackage.wfp.c();
        defpackage.kgu.d(new defpackage.kyo(this, 8), "GH.ProjectionContext", defpackage.zbe.PROJECTION_CONTEXT, defpackage.zbd.py, "Error registering car activity start processor.", new java.lang.Object[0]);
        this.f = true;
    }

    public final void f(defpackage.mpa mpaVar) {
        this.e.add(mpaVar);
    }

    public final void g(defpackage.mpb mpbVar) {
        this.c.add(mpbVar);
    }

    public final void h(defpackage.moz mozVar) {
        this.d.add(mozVar);
    }

    public final void i(android.content.Intent intent) {
        k(intent, new defpackage.qrh());
    }

    public final void j(defpackage.mqi mqiVar) {
        i(mqiVar.a());
    }

    public final void k(android.content.Intent intent, defpackage.qrh qrhVar) {
        defpackage.qrh qrhVarB;
        for (defpackage.mpa mpaVar : this.e) {
            intent.getClass();
            if (mpaVar.b(intent)) {
                defpackage.yqm yqmVar = defpackage.mpa.b;
                defpackage.ypu ypuVarL = yqmVar.l();
                java.lang.String str = mpaVar.c;
                ypuVarL.M("%s intent interceptor will intercept the intent %s", str, intent);
                mpaVar.a(intent);
                yqmVar.l().M("%s intent interceptor intercepted the intent %s", str, intent);
                return;
            }
        }
        defpackage.mqi mqiVarB = defpackage.mqi.b(intent);
        if (mqiVarB != null) {
            defpackage.lhd lhdVarA = defpackage.ler.a();
            defpackage.qsh qshVarE = defpackage.kit.b().e();
            android.content.ComponentName componentName = mqiVarB.a;
            defpackage.mqj mqjVarA = lhdVarA.a(qshVarE, new defpackage.mqi(componentName));
            if (mqjVarA != null) {
                defpackage.mqg mqgVar = mqjVarA.b;
                defpackage.mqg mqgVar2 = defpackage.mqg.NAVIGATION;
                if (mqgVar == mqgVar2 && !componentName.equals(defpackage.mkt.A)) {
                    defpackage.lhc.a().f(mqgVar2, componentName);
                }
            }
            mqiVarB.d(intent);
        }
        java.util.Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((defpackage.mpb) it.next()).f(intent, qrhVar);
        }
        java.util.Iterator it2 = this.d.iterator();
        while (it2.hasNext()) {
            ((defpackage.moz) it2.next()).f(intent, qrhVar);
        }
        ((defpackage.yqj) a.l().ai((char) 5161)).M("startCarActivity(intent:%s, activityOptions:%s)", intent, qrhVar);
        com.google.android.gms.car.display.CarRegionId carRegionId = qrhVar.e;
        if (carRegionId == null) {
            carRegionId = com.google.android.gms.car.display.CarRegionId.a;
        }
        boolean booleanExtra = intent.getBooleanExtra("ANDROID_AUTO_APP_LAUNCHER_INTENT", false);
        defpackage.yqm yqmVar2 = defpackage.mpj.a;
        boolean booleanExtra2 = intent.getBooleanExtra("EXTRA_STARTED_BY_DASHBOARD", false);
        if (!defpackage.lee.a().c(defpackage.kit.b().e()) || !carRegionId.equals(com.google.android.gms.car.display.CarRegionId.a) || booleanExtra || booleanExtra2) {
            qrhVarB = carRegionId.equals(com.google.android.gms.car.display.CarRegionId.a) ? defpackage.qrh.b(defpackage.mkp.a.c, 2130772024, 2130772027) : defpackage.qrh.b(defpackage.mkp.a.c, 2130772024, 2130772025);
        } else {
            defpackage.ntj ntjVarA = defpackage.edd.A();
            android.content.Context context = defpackage.mkp.a.c;
            com.google.android.gms.car.display.CarDisplayId carDisplayId = com.google.android.gms.car.display.CarDisplayId.a;
            qrhVarB = ntjVarA.g(carDisplayId) ? ntjVarA.k(carDisplayId) ? defpackage.qrh.b(context, 2130771983, 2130771985) : defpackage.qrh.b(context, 2130771982, 2130771984) : defpackage.qrh.b(context, 2130771986, 2130771981);
            qrhVarB.e = carRegionId;
        }
        java.lang.String str2 = qrhVar.a;
        if (str2 != null) {
            qrhVarB.a = str2;
        }
        if (qrhVar.b == 1) {
            qrhVarB.b = 1;
            qrhVarB.c = qrhVar.c;
            qrhVarB.d = qrhVar.d;
        }
        qrhVarB.e = qrhVar.e;
        defpackage.kgu.d(new defpackage.mjh(intent, qrhVarB.a(), 3, null), "GH.ProjectionContext", defpackage.zbe.PROJECTION_CONTEXT, defpackage.zbd.pw, "Car no longer connected, unable to start %s", intent.toUri(0));
    }
}
