package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lxn extends defpackage.lxu {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.yqm b = defpackage.yqm.c("GH.SSbnConverter.CE");

    @Override // defpackage.mnz
    public final /* synthetic */ mog a(android.content.Context context, java.lang.Object obj) {
        android.service.notification.StatusBarNotification statusBarNotification = (android.service.notification.StatusBarNotification) obj;
        if (!i(context, statusBarNotification)) {
            return null;
        }
        ((defpackage.yqj) b.l().ai((char) 4434)).y("Using CarExtender to convert %s", obj);
        defpackage.omf.u().C(defpackage.zaa.SI_CREATION_USED_CAR_EXTENDER_ONLY, statusBarNotification.getPackageName());
        defpackage.ojm.a();
        long epochMilli = j$.time.Instant.now().toEpochMilli() - statusBarNotification.getPostTime();
        defpackage.lxy.e();
        defpackage.zbe zbeVar = defpackage.zbe.MESSAGING;
        defpackage.lxy.i(zbeVar, defpackage.zbd.nj, statusBarNotification.getPackageName(), epochMilli);
        defpackage.lxy.e();
        defpackage.lxy.i(zbeVar, defpackage.zbd.nk, statusBarNotification.getPackageName(), epochMilli);
        defpackage.lwk lwkVar = new defpackage.lwk(statusBarNotification, false);
        defpackage.ygw ygwVarE = lwkVar.e();
        defpackage.dta dtaVarC = lwkVar.c();
        defpackage.dta dtaVarD = lwkVar.d();
        qkg qkgVar = new qkg();
        lxl.e(qkgVar, dtaVarC, dtaVarD);
        g(qkgVar, statusBarNotification, lwkVar.f(), lwkVar.b());
        int i = ((defpackage.ymx) ygwVarE).c;
        for (int i2 = 0; i2 < i; i2++) {
            mesquite.messaging.model.Message message = (mesquite.messaging.model.Message) ygwVarE.get(i2);
            qkgVar.a(new qkh(message.e.a.toString(), ((mesquite.messaging.model.BaseEntity) message).a, message.b, message.f));
        }
        defpackage.lwh lwhVar = lwkVar.e;
        int iA = lwhVar.c() ? lwhVar.a() : statusBarNotification.getNotification().color;
        defpackage.lui luiVarK = defpackage.lnt.k();
        defpackage.mcl.b();
        boolean zI = luiVarK.i(defpackage.mcl.a(statusBarNotification));
        lxf lxfVarE = e(statusBarNotification);
        lxfVarE.a = new com.google.android.gearhead.sdk.assistant.MessagingInfo(qkgVar);
        ((moh) lxfVarE).w = iA;
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
        return lwkVar.j() && lwkVar.e != null;
    }
}
