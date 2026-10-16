package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mal implements defpackage.lhn, defpackage.mph {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.GhNavLifetimeComp");

    @Override // defpackage.lhn
    public final void d() {
        defpackage.mpj.b().j(this);
    }

    @Override // defpackage.mph
    public final void e(android.content.Intent intent, com.google.android.gms.car.display.CarRegionId carRegionId) {
        defpackage.mqj mqjVarA;
        defpackage.mqi mqiVarB = defpackage.mpk.a().b(intent);
        if (mqiVarB == null || (mqjVarA = defpackage.ler.a().a(defpackage.kit.b().e(), mqiVarB)) == null) {
            return;
        }
        defpackage.mqg mqgVar = mqjVarA.b;
        defpackage.mqg mqgVar2 = defpackage.mqg.NAVIGATION;
        if (mqgVar == mqgVar2) {
            android.content.ComponentName componentNameA = mqjVarA.a();
            defpackage.luq.a().g(componentNameA);
            if (defpackage.acyc.aP()) {
                ((defpackage.yqj) a.l().ai((char) 4626)).y("onAppStarted storing nav app %s", componentNameA);
                defpackage.lhc.a().f(mqgVar2, componentNameA);
            }
        }
    }

    @Override // defpackage.lhn
    public final void eQ() {
        defpackage.mpj.b().g(this);
    }

    @Override // defpackage.mph
    public final /* synthetic */ void a(android.content.Intent intent, com.google.android.gms.car.display.CarRegionId carRegionId) {
    }

    @Override // defpackage.mph
    public final /* synthetic */ void b(android.content.Intent intent, com.google.android.gms.car.display.CarRegionId carRegionId) {
    }

    @Override // defpackage.mph
    public final /* synthetic */ void f(android.content.Intent intent, com.google.android.gms.car.display.CarRegionId carRegionId) {
    }
}
