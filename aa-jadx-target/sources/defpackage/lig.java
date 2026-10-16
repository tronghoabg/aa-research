package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class lig implements java.lang.Runnable {
    final /* synthetic */ java.util.function.Supplier a;
    final /* synthetic */ defpackage.lih b;

    public lig(defpackage.lih lihVar, java.util.function.Supplier supplier) {
        this.a = supplier;
        this.b = lihVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        defpackage.yqm yqmVar = defpackage.lin.a;
        defpackage.rro rroVarH = defpackage.rrp.h(defpackage.yzd.GEARHEAD, 8, defpackage.zaa.LIFETIME_HEARTBEAT);
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            defpackage.lin.l((com.google.android.gms.car.AnalyticsSessionInfo) a$.ExternalSyntheticApiModelOutline2.m(this.a), rroVarH);
        }
        defpackage.omf.u().F(rroVarH.l());
        this.b.a.postDelayed(this, defpackage.lih.a());
    }
}
