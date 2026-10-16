package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lxm extends defpackage.lxu {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.yqm b = defpackage.yqm.c("GH.SSbnConverter.BPS");

    @Override // defpackage.mnz
    public final /* synthetic */ mog a(android.content.Context context, java.lang.Object obj) {
        android.service.notification.StatusBarNotification statusBarNotification = (android.service.notification.StatusBarNotification) obj;
        defpackage.ysr.aX(i(context, statusBarNotification));
        ((defpackage.yqj) b.l().ai((char) 4433)).y("Using BigPicture to convert %s", obj);
        defpackage.omf.u().C(defpackage.zaa.SI_CREATION_USED_BIG_PICTURE_STYLE_ONLY, statusBarNotification.getPackageName());
        defpackage.ojm.a();
        long epochMilli = j$.time.Instant.now().toEpochMilli() - statusBarNotification.getPostTime();
        defpackage.lxy.e();
        defpackage.zbe zbeVar = defpackage.zbe.MESSAGING;
        defpackage.lxy.i(zbeVar, defpackage.zbd.nj, statusBarNotification.getPackageName(), epochMilli);
        defpackage.lxy.e();
        defpackage.lxy.i(zbeVar, defpackage.zbd.nm, statusBarNotification.getPackageName(), epochMilli);
        android.app.Notification notification = statusBarNotification.getNotification();
        defpackage.lwk lwkVar = new defpackage.lwk(statusBarNotification, false);
        java.lang.String string = notification.extras.getString("android.title");
        java.lang.String string2 = context.getString(2132083203);
        defpackage.dta dtaVarC = lwkVar.c();
        defpackage.dta dtaVarD = lwkVar.d();
        qkg qkgVar = new qkg();
        g(qkgVar, statusBarNotification, string, lwkVar.b());
        lxl.e(qkgVar, dtaVarC, dtaVarD);
        qkgVar.a(new qkh(string, string, string2, statusBarNotification.getPostTime()));
        defpackage.lui luiVarK = defpackage.lnt.k();
        defpackage.mcl.b();
        boolean zI = luiVarK.i(defpackage.mcl.a(statusBarNotification));
        lxf lxfVarE = e(statusBarNotification);
        lxfVarE.a = new com.google.android.gearhead.sdk.assistant.MessagingInfo(qkgVar);
        lxfVarE.d(lwkVar.a(context));
        lxg lxgVar = new lxg(lxfVarE);
        if (!zI) {
            f(lxgVar);
        }
        return lxgVar;
    }

    @Override // defpackage.lxu
    protected final boolean b(android.service.notification.StatusBarNotification statusBarNotification) {
        defpackage.lwk lwkVar = new defpackage.lwk(statusBarNotification, false);
        return lwkVar.j() && lwkVar.d != null;
    }
}
