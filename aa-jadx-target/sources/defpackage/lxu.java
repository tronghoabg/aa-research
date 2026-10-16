package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class lxu extends defpackage.mck {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.SbnConverter");

    static lxf e(android.service.notification.StatusBarNotification statusBarNotification) {
        defpackage.mcl.b();
        long jA = defpackage.mcl.a(statusBarNotification);
        android.app.Notification notification = statusBarNotification.getNotification();
        lxf lxfVar = new lxf();
        ((moh) lxfVar).h = jA;
        ((lxh) lxfVar).e = defpackage.lnt.k().a(jA);
        ((moh) lxfVar).i = statusBarNotification.getPackageName();
        lxfVar.b = statusBarNotification;
        ((moh) lxfVar).B = defpackage.lxy.l().a(statusBarNotification);
        ((moh) lxfVar).y = notification.icon;
        ((moh) lxfVar).w = notification.color;
        return lxfVar;
    }

    static void f(lxg lxgVar) {
        lxgVar.s(defpackage.lwz.d().i());
        lxgVar.g(defpackage.lnt.k().j(lxgVar));
    }

    static void g(qkg qkgVar, android.service.notification.StatusBarNotification statusBarNotification, java.lang.String str, android.graphics.drawable.Icon icon) {
        qkgVar.a = statusBarNotification;
        qkgVar.c = str;
        qkgVar.h = statusBarNotification.getPackageName();
        qkgVar.i = icon;
        qkgVar.g = str;
    }

    static final boolean j(java.lang.String str) {
        return defpackage.kmv.c(defpackage.acus.b(), str);
    }

    protected abstract boolean b(android.service.notification.StatusBarNotification statusBarNotification);

    @Override // defpackage.mck
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean i(android.content.Context context, android.service.notification.StatusBarNotification statusBarNotification) {
        if (!j(statusBarNotification.getPackageName())) {
            return false;
        }
        if (jrl.a(defpackage.mkp.a.c, statusBarNotification.getPackageName()) != null) {
            return b(statusBarNotification);
        }
        ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 4444)).y("Car message notification with null appName (maybe '%s' is an invalid package?)", statusBarNotification.getPackageName());
        return false;
    }

    @Override // defpackage.mck
    public final boolean k(android.service.notification.StatusBarNotification statusBarNotification) {
        return true;
    }

    @Override // defpackage.mck
    public final boolean l(android.service.notification.StatusBarNotification statusBarNotification) {
        return true;
    }
}
