package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class lrq implements defpackage.eqt {
    static {
        defpackage.yqm.c("GH.MediaPlayOnStMetrics");
    }

    public static void b(defpackage.eqp eqpVar, defpackage.eqg eqgVar) {
        defpackage.rox.q(eqpVar, eqgVar, new defpackage.lrq());
    }

    @Override // defpackage.eqt
    public final /* bridge */ /* synthetic */ void ea(java.lang.Object obj) {
        android.content.ComponentName componentName = (android.content.ComponentName) obj;
        if (componentName == null) {
            return;
        }
        defpackage.oim oimVarU = defpackage.omf.u();
        defpackage.rro rroVarH = defpackage.rrp.h(defpackage.yzd.GEARHEAD, 20, defpackage.zaa.MEDIA_SESSION_ALREADY_PLAYING);
        rroVarH.e(componentName.getPackageName());
        oimVarU.F(rroVarH.l());
    }
}
