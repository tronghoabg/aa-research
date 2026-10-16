package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jzd extends defpackage.moz implements defpackage.jwm {
    public jzd() {
        super(defpackage.mkt.k, "NavigationAppHost");
    }

    @Override // defpackage.jwm
    public final android.content.Intent a(android.content.ComponentName componentName) {
        android.content.Intent component = new android.content.Intent().setComponent(componentName);
        c(component, new defpackage.qrh());
        return component;
    }

    @Override // defpackage.moz
    protected final void c(android.content.Intent intent, defpackage.qrh qrhVar) {
        android.content.ComponentName component = intent.getComponent();
        component.getClass();
        g(intent);
        jsg.l(intent, defpackage.mpr.b(component));
        intent.setComponent(defpackage.mkt.k);
    }

    @Override // defpackage.mpb
    protected final boolean d(android.content.Intent intent, defpackage.qrh qrhVar) {
        defpackage.mqi mqiVarB;
        com.google.android.gms.car.display.CarRegionId carRegionId = qrhVar.e;
        if ((carRegionId == null || com.google.android.gms.car.display.CarDisplayId.b(carRegionId.h)) && (mqiVarB = defpackage.mqi.b(intent)) != null) {
            return j$.util.Collection.-EL.stream(defpackage.jzg.a().b(defpackage.kit.b().e(), defpackage.nze.a())).map(new defpackage.jvi(9)).anyMatch(new defpackage.ghv(mqiVarB, 15));
        }
        return false;
    }
}
