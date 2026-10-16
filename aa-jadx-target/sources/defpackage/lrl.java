package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class lrl implements defpackage.eqt {
    static {
        defpackage.yqm.c("GH.MediaImgTypeMetrics");
    }

    @Override // defpackage.eqt
    public final /* synthetic */ void ea(java.lang.Object obj) {
        defpackage.lrg lrgVar = (defpackage.lrg) obj;
        android.content.ComponentName componentName = lrgVar.a;
        defpackage.lmk lmkVar = lrgVar.b;
        if (componentName == null) {
            return;
        }
        android.net.Uri uri = (android.net.Uri) defpackage.sqs.aJ(lmkVar, new defpackage.lmd(13));
        if (uri != null && defpackage.mlv.v(uri)) {
            defpackage.oio oioVarA = defpackage.oio.a();
            defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MEDIA_FACET, defpackage.zbd.fB);
            rrvVarH.p(componentName);
            oioVarA.b((defpackage.rrw) rrvVarH.l());
        }
        if (((android.graphics.Bitmap) defpackage.sqs.aJ(lmkVar, new defpackage.lmd(14))) == null || uri != null) {
            return;
        }
        defpackage.oio oioVarA2 = defpackage.oio.a();
        defpackage.rrv rrvVarH2 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MEDIA_FACET, defpackage.zbd.fA);
        rrvVarH2.p(componentName);
        oioVarA2.b((defpackage.rrw) rrvVarH2.l());
    }
}
