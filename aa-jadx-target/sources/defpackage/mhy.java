package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class mhy implements defpackage.mph {
    final /* synthetic */ defpackage.mib a;

    public mhy(defpackage.mib mibVar) {
        this.a = mibVar;
    }

    @Override // defpackage.mph
    public final void e(android.content.Intent intent, com.google.android.gms.car.display.CarRegionId carRegionId) {
        defpackage.mib mibVar;
        android.content.ComponentName componentName;
        defpackage.mqi mqiVarD = defpackage.mpr.d(intent);
        if (mqiVarD == null || (componentName = (mibVar = this.a).e) == null || !mqiVarD.a.equals(componentName)) {
            return;
        }
        for (defpackage.wyz wyzVar : mibVar.f) {
            defpackage.kit.b().e();
            defpackage.ntb ntbVar = (defpackage.ntb) wyzVar.a;
            if (!ntbVar.D) {
                ntbVar.D = true;
                ntbVar.M();
            }
        }
        java.lang.Runnable runnable = mibVar.c;
        if (runnable != null) {
            runnable.run();
            mibVar.c = null;
        }
    }

    @Override // defpackage.mph
    public final void f(android.content.Intent intent, com.google.android.gms.car.display.CarRegionId carRegionId) {
        defpackage.mib mibVar;
        android.content.ComponentName componentName;
        defpackage.mqi mqiVarD = defpackage.mpr.d(intent);
        if (mqiVarD == null || (componentName = (mibVar = this.a).e) == null || !mqiVarD.a.equals(componentName)) {
            return;
        }
        ((defpackage.yqj) defpackage.mib.a.l().ai((char) 4957)).y("Stopped %s", mqiVarD);
        mibVar.e = null;
        for (defpackage.wyz wyzVar : mibVar.f) {
            defpackage.kit.b().e();
            defpackage.ntb ntbVar = (defpackage.ntb) wyzVar.a;
            if (ntbVar.D) {
                ntbVar.D = false;
                ntbVar.M();
            }
        }
    }

    @Override // defpackage.mph
    public final /* synthetic */ void a(android.content.Intent intent, com.google.android.gms.car.display.CarRegionId carRegionId) {
    }

    @Override // defpackage.mph
    public final /* synthetic */ void b(android.content.Intent intent, com.google.android.gms.car.display.CarRegionId carRegionId) {
    }
}
