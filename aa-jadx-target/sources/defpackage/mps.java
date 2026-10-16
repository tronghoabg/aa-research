package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mps {
    public static final android.content.ComponentName a(com.google.android.gms.car.display.CarDisplayId carDisplayId, defpackage.rke rkeVar, defpackage.nta ntaVar) {
        defpackage.wfp.c();
        if (ntaVar == defpackage.nta.a || ntaVar == defpackage.nta.s) {
            return g(carDisplayId, rkeVar, ntaVar).a();
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static final com.google.android.gms.car.lifecycle.CarActivityLayoutConfig b(defpackage.qsh qshVar, java.util.Collection collection) throws wfo {
        defpackage.ygw ymxVar;
        defpackage.ygw ygwVar;
        android.graphics.Rect rect;
        defpackage.qrg qrgVar;
        defpackage.ygw ygwVarC;
        defpackage.wfp.c();
        int i = 4;
        defpackage.ygr ygrVar = new defpackage.ygr(4);
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            defpackage.ntb ntbVar = (defpackage.ntb) it.next();
            int i2 = defpackage.ygw.d;
            defpackage.ygr ygrVar2 = new defpackage.ygr(i);
            defpackage.ygw ygwVarS = ntbVar.s();
            int size = ygwVarS.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size) {
                com.google.android.gms.car.display.CarRegionId carRegionId = (com.google.android.gms.car.display.CarRegionId) ygwVarS.get(i4);
                defpackage.nta ntaVarK = ntbVar.k(carRegionId);
                com.google.android.gms.car.display.CarDisplayId carDisplayId = ntbVar.o;
                defpackage.rke rkeVar = ntbVar.q;
                defpackage.wfp.c();
                defpackage.nta ntaVar = defpackage.nta.a;
                android.content.Intent intentB = (ntaVarK == ntaVar || ntaVarK == defpackage.nta.s || ntaVarK == defpackage.nta.t) ? g(carDisplayId, rkeVar, ntaVarK).b(qshVar) : new android.content.Intent();
                intentB.putExtra("com.google.android.gms.car.EXTRA_CAR_ACTIVITY_FLAGS", intentB.getIntExtra("com.google.android.gms.car.EXTRA_CAR_ACTIVITY_FLAGS", i3) | 1);
                intentB.putExtra("com.google.android.projection.gearhead.system.projectiontrampoline.EXTRA_FOR_STARTUP", true);
                android.content.Intent component = new android.content.Intent().setComponent(a(carDisplayId, rkeVar, ntaVarK));
                component.putExtra("com.google.android.gms.car.EXTRA_CAR_ACTIVITY_FLAGS", component.getIntExtra("com.google.android.gms.car.EXTRA_CAR_ACTIVITY_FLAGS", 0) | 1);
                android.graphics.Rect rectH = ntbVar.h(ntaVarK);
                if (rectH == null) {
                    qrgVar = null;
                    it = it;
                } else {
                    android.graphics.Rect rectI = ntbVar.i(ntaVarK);
                    if (ntaVarK == defpackage.nta.s && ntbVar.B && defpackage.acyc.a.fF().ah()) {
                        android.view.ViewGroup viewGroup = ntbVar.n;
                        viewGroup.getClass();
                        int dimensionPixelSize = viewGroup.getContext().getResources().getDimensionPixelSize(2131165571);
                        rect = new android.graphics.Rect(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                    } else {
                        rect = new android.graphics.Rect();
                    }
                    defpackage.dzp dzpVarJ = ntbVar.j(ntaVarK);
                    defpackage.qrg qrgVar2 = new defpackage.qrg(rectH.width(), rectH.height());
                    qrgVar2.c = rectH.left;
                    qrgVar2.d = rectH.top;
                    qrgVar2.f = rectI;
                    qrgVar2.g = rect;
                    qrgVar2.m = ((java.lang.Integer) ntbVar.t(ntaVarK, new defpackage.mmf(12), 0)).intValue();
                    qrgVar2.j = (com.google.android.gms.car.animation.ProjectionWindowAnimationParams) dzpVarJ.a;
                    qrgVar2.k = (com.google.android.gms.car.animation.ProjectionWindowAnimationParams) dzpVarJ.b;
                    qrgVar2.h = ntbVar.u(ntaVarK);
                    qrgVar2.i = ntbVar.p(ntaVarK);
                    qrgVar2.e = ntbVar.f(ntaVarK);
                    qrgVar2.l = ntbVar.b(ntaVarK);
                    qrgVar = qrgVar2;
                }
                ntaVarK.toString();
                java.lang.String.valueOf(carRegionId);
                qrgVar.getClass();
                com.google.android.gms.car.CarActivityLayoutParams carActivityLayoutParams = new com.google.android.gms.car.CarActivityLayoutParams(qrgVar.a, qrgVar.b, qrgVar.c, qrgVar.d, qrgVar.e, qrgVar.f, qrgVar.h, qrgVar.i, qrgVar.j, qrgVar.k, qrgVar.l, qrgVar.m, qrgVar.g);
                com.google.android.gms.car.display.CarRegionGroup carRegionGroupQ = ntbVar.q(carRegionId);
                if (defpackage.acvt.a.fF().l()) {
                    ygwVarC = (ntaVarK == ntaVar || ntaVarK == defpackage.nta.s || ntaVarK == defpackage.nta.b) ? g(carDisplayId, rkeVar, ntaVarK).c() : defpackage.ymx.a;
                } else {
                    ygwVarC = defpackage.ymx.a;
                }
                ygrVar2.i(new com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig(intentB, component, carRegionId, carActivityLayoutParams, carRegionGroupQ, ygwVarC));
                i4++;
                it = it;
                ygwVarS = ygwVarS;
                size = size;
                i3 = 0;
            }
            java.util.Iterator it2 = it;
            defpackage.ygw ygwVarG = ygrVar2.g();
            com.google.android.gms.car.display.CarDisplayId carDisplayId2 = ntbVar.o;
            java.lang.String string = ntbVar.v().toString();
            if (ntbVar.u) {
                defpackage.ydi ydiVarA = ntbVar.h.a();
                defpackage.nta ntaVar2 = defpackage.nta.B;
                if (ydiVarA.get(ntaVar2) != 0) {
                    ymxVar = defpackage.ygw.r(ntaVar2, defpackage.nta.z);
                } else {
                    java.lang.Object[] objArr = {defpackage.nta.k};
                    defpackage.ysr.B(objArr, 1);
                    ymxVar = new defpackage.ymx(objArr, 1);
                }
                ygwVar = (defpackage.ygw) j$.util.Collection.-EL.stream(ymxVar).map(new defpackage.mjc(ntbVar, 9)).filter(new mrx(7)).collect(defpackage.yds.a);
            } else {
                ygwVar = defpackage.ymx.a;
            }
            ygrVar.i(new com.google.android.gms.car.lifecycle.CarDisplayLayoutConfig(carDisplayId2, ygwVarG, string, ygwVar));
            it = it2;
            i = 4;
        }
        return new com.google.android.gms.car.lifecycle.CarActivityLayoutConfig(ygrVar.g());
    }

    public static void c() {
        defpackage.wfp.c();
    }

    public static android.os.Bundle d(defpackage.qsh qshVar) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("MULTI_REGION_ENABLED", true);
        bundle.putInt("MULTI_REGION_EXPERIMENT_ID", -1);
        defpackage.yqm yqmVar = defpackage.nte.a;
        bundle.putBoolean("MULTI_REGION_ELIGIBLE", ((defpackage.nte) defpackage.mkp.a.i(defpackage.nte.class)).j(defpackage.nti.e));
        bundle.putBoolean("COOLWALK_UI_ENABLED", true);
        bundle.putInt("REDUCED_STATUS_BAR_NOTIFICATION_RATE_EXPERIMENT_ID", 22168596);
        bundle.putBoolean("IGNORE_ON_ANDROID_AUTO_START_WHEN_FLUSHING", true);
        bundle.putBoolean("GH_CIELO_UI_ENABLED", defpackage.lee.a.a().c(qshVar));
        bundle.putBoolean("EDGE_TO_EDGE_RENDERING_ENABLED", defpackage.acyc.a.fF().ah());
        return bundle;
    }

    public static final defpackage.eqp e() {
        defpackage.yqm yqmVar = defpackage.mpj.a;
        defpackage.mpi mpiVar = ((defpackage.mpj) defpackage.mkp.a.i(defpackage.mpj.class)).h;
        defpackage.ltq ltqVar = new defpackage.ltq(10);
        defpackage.afdo afdoVar = defpackage.tcu.a;
        defpackage.eqp eqpVarF = defpackage.ebo.f(mpiVar, ltqVar);
        defpackage.eqp eqpVarA = defpackage.muj.h.a().a();
        defpackage.mui muiVar = defpackage.mui.a;
        eqpVarA.getClass();
        defpackage.eqp eqpVarA2 = defpackage.tcu.a(eqpVarF, defpackage.ebo.f(eqpVarA, new defpackage.nnp(muiVar, 12)));
        android.content.ComponentName componentName = defpackage.nye.a;
        return defpackage.tcu.a(eqpVarA2, defpackage.ebo.f(((defpackage.nye) defpackage.mkp.a.i(defpackage.nye.class)).b, new defpackage.tci(2)));
    }

    public static final defpackage.eqp f() {
        defpackage.yqm yqmVar = defpackage.nte.a;
        return defpackage.ebo.g(((defpackage.nte) defpackage.mkp.a.i(defpackage.nte.class)).b().A, new defpackage.ltq(9));
    }

    private static defpackage.mpz g(com.google.android.gms.car.display.CarDisplayId carDisplayId, defpackage.rke rkeVar, defpackage.nta ntaVar) {
        int iOrdinal = rkeVar.ordinal();
        if (iOrdinal == 0) {
            int iOrdinal2 = ntaVar.ordinal();
            if (iOrdinal2 == 0) {
                return (defpackage.mqe) defpackage.mkp.a.i(defpackage.mqe.class);
            }
            if (iOrdinal2 == 1) {
                return (mpv) defpackage.mkp.a.b(mpv.class, new defpackage.mbf(12));
            }
            if (iOrdinal2 != 18) {
                return iOrdinal2 != 19 ? (defpackage.mpz) defpackage.rox.o("GH.ALCFactory", "No configuration defined for region type %s", ntaVar.name()) : (defpackage.mqd) defpackage.mkp.a.b(defpackage.mqd.class, new defpackage.lga(9));
            }
            return (defpackage.mqc) defpackage.mkp.a.b(defpackage.mqc.class, new defpackage.lga(8));
        }
        if (iOrdinal == 1) {
            defpackage.ysr.aY(ntaVar == defpackage.nta.a, "Only the activity region is supported on the cluster display");
            return defpackage.mqa.d();
        }
        if (iOrdinal != 2) {
            return (defpackage.mpz) defpackage.rox.o("GH.ALCFactory", "No configuration defined for car display type: %s", rkeVar);
        }
        defpackage.ysr.aY(ntaVar == defpackage.nta.a, "Only the activity region is supported on a auxiliary display");
        defpackage.yqm yqmVar = defpackage.mpy.a;
        defpackage.mpy mpyVar = (defpackage.mpy) defpackage.mkp.a.i(defpackage.mpy.class);
        mpyVar.d();
        return mpyVar.b(mpyVar.c(carDisplayId));
    }
}
