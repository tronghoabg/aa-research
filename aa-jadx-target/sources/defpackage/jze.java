package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jze extends defpackage.moz implements defpackage.jwm {
    public jze() {
        super(defpackage.mkt.l, "ClusterAppHost");
    }

    @Override // defpackage.jwm
    public final android.content.Intent a(android.content.ComponentName componentName) {
        throw new java.lang.IllegalStateException("ClusterIntentProcessor can't give display-less intents");
    }

    @Override // defpackage.moz
    protected final void c(android.content.Intent intent, defpackage.qrh qrhVar) {
        android.content.ComponentName component = intent.getComponent();
        component.getClass();
        g(intent);
        jsg.l(intent, defpackage.mpr.b(component));
        com.google.android.gms.car.display.CarRegionId carRegionId = qrhVar.e;
        carRegionId.getClass();
        if (defpackage.nte.c().a(carRegionId.h).q == defpackage.rke.b) {
            intent.setComponent(defpackage.mkt.l);
        } else {
            intent.setComponent(defpackage.mkt.m);
        }
    }

    @Override // defpackage.mpb
    protected final boolean d(android.content.Intent intent, defpackage.qrh qrhVar) {
        defpackage.mqi mqiVarB;
        com.google.android.gms.car.display.CarRegionId carRegionId = qrhVar.e;
        if (carRegionId == null || (mqiVarB = defpackage.mqi.b(intent)) == null) {
            return false;
        }
        defpackage.rke rkeVar = defpackage.nte.c().a(carRegionId.h).q;
        if (rkeVar == defpackage.rke.b || rkeVar == defpackage.rke.c) {
            return j$.util.Collection.-EL.stream(jzi.a().b(defpackage.kit.b().e(), defpackage.nze.a())).map(new defpackage.jvi(10)).anyMatch(new defpackage.ghv(mqiVarB, 16));
        }
        return false;
    }
}
