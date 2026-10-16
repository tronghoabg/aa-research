package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class oez implements ngs {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.DialerQuickFdbkPrvdr");
    private final defpackage.ngy b;
    private final android.content.Context c;
    private final java.util.Random d;

    public oez(defpackage.ngy ngyVar, android.content.Context context) {
        java.util.Random random = new java.util.Random();
        this.b = ngyVar;
        this.c = context;
        this.d = random;
    }

    public final /* bridge */ /* synthetic */ ngx a(ngt ngtVar) {
        android.content.ComponentName componentNameA;
        if (ngtVar != ngu.d && !(ngtVar instanceof ngv)) {
            return null;
        }
        defpackage.ngy ngyVar = this.b;
        if (ngyVar.a() <= ngyVar.n() || this.d.nextDouble() >= defpackage.acrf.b()) {
            return null;
        }
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 5630)).u("Showing dialer quick feedback notification.");
        if (ngtVar instanceof ngv) {
            componentNameA = ((ngv) ngtVar).a;
        } else if (defpackage.ogv.i()) {
            defpackage.mqj mqjVarA = defpackage.ogv.d().a();
            mqjVarA.getClass();
            componentNameA = mqjVarA.a();
        } else {
            componentNameA = defpackage.mkt.b;
        }
        android.content.ComponentName componentName = componentNameA;
        return new nwc(this.c, 2132083264, 0, "Dialer Quick Feedback Notification", com.google.android.apps.auto.components.graphics.icon.GhIcon.j(componentName), defpackage.zbe.CSAT_PHONE_CALL, componentName, (nwe) null);
    }
}
