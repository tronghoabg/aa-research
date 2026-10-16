package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lvb implements defpackage.lhn {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.NotifMsgAppConn");
    private final java.util.Map b = new java.util.HashMap();
    private final defpackage.lxy c = new defpackage.lva(this);

    public static defpackage.lvb a() {
        return (defpackage.lvb) defpackage.mkp.a.b(defpackage.lvb.class, new defpackage.lqb(9));
    }

    public final lvc b(java.lang.String str, defpackage.mqh mqhVar) {
        android.util.Pair pair = new android.util.Pair(str, mqhVar);
        java.util.Map map = this.b;
        lvc lvcVar = (lvc) map.get(pair);
        if (lvcVar != null) {
            return lvcVar;
        }
        lvc lvcVar2 = new lvc(str);
        map.put(pair, lvcVar2);
        return lvcVar2;
    }

    @Override // defpackage.lhn
    public final void d() {
        defpackage.mca.a().g(this.c);
        this.b.clear();
    }

    public final void e(android.service.notification.StatusBarNotification statusBarNotification) {
        if (defpackage.luv.e().i(statusBarNotification.getPackageName())) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 4280)).y("Processing notification from package: %s", statusBarNotification.getPackageName());
            lvc lvcVarB = b(statusBarNotification.getPackageName(), defpackage.mqh.b);
            defpackage.yqm yqmVar = lvc.a;
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 4281)).y("update() called with SBN from %s", statusBarNotification.getPackageName());
            defpackage.lwk lwkVar = new defpackage.lwk(statusBarNotification, false);
            if (lwkVar.j()) {
                lwl lwlVar = lwkVar.c;
                if (lwlVar == null || !lwlVar.b()) {
                    android.content.Context context = defpackage.mkp.a.c;
                    defpackage.ygw ygwVarE = lwkVar.e();
                    if (defpackage.lwe.e(ygwVarE, statusBarNotification.getPackageName())) {
                        ((defpackage.yqj) yqmVar.l().ai((char) 4282)).y("Dropped bugle voice message in data store that contains null URI or Uri.EMPTY, sbn: %s", statusBarNotification);
                        return;
                    }
                    lul lulVar = new lul();
                    lulVar.b(statusBarNotification.getKey());
                    lulVar.f(lwkVar.f());
                    lulVar.e(ygwVarE);
                    lulVar.b = lwkVar.a(context);
                    lulVar.d(false);
                    lulVar.c(lwkVar.i());
                    lvcVarB.g(lulVar.a());
                }
            }
        }
    }

    @Override // defpackage.lhn
    public final void eQ() {
        defpackage.mca.a().f(this.c);
    }
}
