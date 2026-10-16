package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lxx extends defpackage.lxu {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.yqm b = defpackage.yqm.c("GH.SSbnConverter.MS");

    @Override // defpackage.mnz
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final /* synthetic */ mog a(android.content.Context context, java.lang.Object obj) {
        java.lang.Long l;
        android.service.notification.StatusBarNotification statusBarNotification = (android.service.notification.StatusBarNotification) obj;
        if (!i(context, statusBarNotification)) {
            return null;
        }
        defpackage.yqm yqmVar = b;
        ((defpackage.yqj) yqmVar.l().ai((char) 4446)).y("Using MessagingStyle to convert %s", obj);
        boolean z = false;
        defpackage.lwk lwkVar = new defpackage.lwk(statusBarNotification, false);
        java.lang.String strF = lwkVar.f();
        lwl lwlVar = lwkVar.c;
        lwlVar.getClass();
        if (lwlVar.b()) {
            return null;
        }
        defpackage.ygw ygwVarE = lwkVar.e();
        if (defpackage.lwe.e(ygwVarE, statusBarNotification.getPackageName())) {
            ((defpackage.yqj) yqmVar.l().ai((char) 4449)).y("Dropped bugle voice message that contains null URI or Uri.EMPTY, sbn: %s", obj);
            return null;
        }
        defpackage.dta dtaVarC = lwkVar.c();
        dtaVarC.getClass();
        defpackage.dta dtaVarD = lwkVar.d();
        dtaVarD.getClass();
        qkg qkgVar = new qkg();
        qkgVar.m = lwkVar.i();
        g(qkgVar, statusBarNotification, strF, lwkVar.b());
        lxl.e(qkgVar, dtaVarC, dtaVarD);
        defpackage.you youVarListIterator = ygwVarE.listIterator(0);
        while (youVarListIterator.hasNext()) {
            mesquite.messaging.model.Message message = (mesquite.messaging.model.Message) youVarListIterator.next();
            dur durVar = message.e;
            defpackage.nub nubVar = new defpackage.nub(durVar.d);
            java.lang.CharSequence charSequence = durVar.a;
            nubVar.l((java.lang.String) defpackage.sqs.aJ(charSequence, new lta(3)));
            java.lang.String str = (java.lang.String) nubVar.i(strF);
            java.lang.String str2 = (java.lang.String) defpackage.sqs.aJ(charSequence, new lta(3));
            java.lang.String str3 = true == android.text.TextUtils.isEmpty(str2) ? strF : str2;
            java.lang.String string = message.b;
            if (android.text.TextUtils.isEmpty(string)) {
                string = context.getString(2132084440);
            }
            qkgVar.a(new qkh(str3, str, string, message.f, message.c, message.d));
        }
        defpackage.lwm.a();
        lwi lwiVarB = defpackage.lwm.b(statusBarNotification);
        defpackage.mcl.b();
        long jA = defpackage.mcl.a(statusBarNotification);
        if (lwiVarB != null) {
            lyt lytVarA = lyt.a();
            java.util.HashMap map = lytVarA.d;
            if (map.containsKey(lwiVarB) && ((l = (java.lang.Long) map.get(lwiVarB)) == null || jA != l.longValue())) {
                ((defpackage.yqj) lytVarA.c.g()).u("Inconsistent conversation/notification ID mapping detected.");
            }
            map.put(lwiVarB, java.lang.Long.valueOf(jA));
        }
        boolean zI = defpackage.lnt.k().i(jA);
        lxf lxfVarE = e(statusBarNotification);
        lxfVarE.a = new com.google.android.gearhead.sdk.assistant.MessagingInfo(qkgVar);
        lxfVarE.d(lwkVar.a(context));
        lxg lxgVar = new lxg(lxfVarE);
        if (!zI) {
            f(lxgVar);
        }
        mog mogVarA = defpackage.lxy.o().a(((moi) lxgVar).j, ((moi) lxgVar).k);
        if (mogVarA != null && (!(mogVarA instanceof lxg) || lxgVar.h(mogVarA))) {
            return lxgVar;
        }
        java.lang.String packageName = statusBarNotification.getPackageName();
        boolean zI2 = lwkVar.i();
        lwlVar.getClass();
        boolean z2 = false;
        boolean z3 = false;
        for (dts dtsVar : lwlVar.a()) {
            if (dtsVar.c != null) {
                java.lang.String str4 = dtsVar.d;
                if (!android.text.TextUtils.isEmpty(str4)) {
                    boolean zStartsWith = str4.startsWith("image");
                    z3 |= !zStartsWith;
                    z |= zStartsWith;
                    if (str4.startsWith("audio")) {
                        z2 = true;
                    }
                }
            }
        }
        if (zI2) {
            defpackage.lxy.e();
            defpackage.lxy.h(defpackage.zbe.MESSAGING_PARSING, defpackage.zbd.lZ, packageName);
        }
        if (z) {
            defpackage.lxy.e();
            defpackage.lxy.h(defpackage.zbe.MESSAGING_PARSING, defpackage.zbd.ma, packageName);
        }
        if (z2) {
            defpackage.lxy.e();
            defpackage.lxy.h(defpackage.zbe.MESSAGING_PARSING, defpackage.zbd.mb, packageName);
        }
        if (z3) {
            defpackage.lxy.e();
            defpackage.lxy.h(defpackage.zbe.MESSAGING_PARSING, defpackage.zbd.mc, packageName);
        }
        defpackage.oim oimVarU = defpackage.omf.u();
        defpackage.rro rroVarH = defpackage.rrp.h(defpackage.yzd.GEARHEAD, 14, defpackage.zaa.SI_CREATION_USED_MESSAGING_STYLE_ONLY);
        rroVarH.e(packageName);
        oimVarU.F(rroVarH.l());
        defpackage.ojm.a();
        long epochMilli = j$.time.Instant.now().toEpochMilli() - statusBarNotification.getPostTime();
        defpackage.lxy.e();
        defpackage.zbe zbeVar = defpackage.zbe.MESSAGING;
        defpackage.lxy.i(zbeVar, defpackage.zbd.nj, packageName, epochMilli);
        defpackage.lxy.e();
        defpackage.lxy.i(zbeVar, defpackage.zbd.nl, packageName, epochMilli);
        ((defpackage.yqj) yqmVar.l().ai((char) 4448)).y("Message timestamp: %s", new java.text.SimpleDateFormat("HH:mm:ss.SSS", java.util.Locale.US).format(new java.util.Date(lxgVar.b())));
        return lxgVar;
    }

    @Override // defpackage.lxu
    protected final boolean b(android.service.notification.StatusBarNotification statusBarNotification) {
        defpackage.lwk lwkVar = new defpackage.lwk(statusBarNotification, false);
        return lwkVar.j() && lwkVar.c != null;
    }
}
