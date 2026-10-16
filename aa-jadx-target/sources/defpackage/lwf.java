package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lwf implements mbe {
    private final java.lang.String a;
    private final android.os.UserHandle b;

    public lwf() {
        defpackage.htw htwVar = new defpackage.htw(defpackage.mkp.a.c);
        this.a = android.provider.Telephony.Sms.getDefaultSmsPackage(defpackage.mkp.a.c);
        this.b = android.os.Build.VERSION.SDK_INT >= 30 ? htwVar.p() : null;
    }

    public final /* synthetic */ boolean a(android.service.notification.StatusBarNotification statusBarNotification, int i, boolean z) {
        defpackage.zbd zbdVar;
        boolean zJ = new defpackage.lwk(statusBarNotification, false).j();
        java.lang.String packageName = statusBarNotification.getPackageName();
        defpackage.lwm.a();
        lwi lwiVarB = defpackage.lwm.b(statusBarNotification);
        if (defpackage.lwk.m(statusBarNotification)) {
            defpackage.lxy.e();
            defpackage.zbe zbeVar = defpackage.zbe.MESSAGING_SBN;
            if (zJ) {
                zbdVar = lwiVarB == null ? defpackage.zbd.lT : defpackage.zbd.nJ;
            } else {
                zbdVar = defpackage.zbd.lS;
            }
            defpackage.lxy.h(zbeVar, zbdVar, packageName);
        }
        if (zJ && statusBarNotification.getUser().equals(this.b)) {
            defpackage.lxy.e();
            defpackage.zbe zbeVar2 = defpackage.zbe.MESSAGING_SBN;
            defpackage.lxy.i(zbeVar2, defpackage.zbd.np, packageName, 0L);
            if (!defpackage.luv.e().i(packageName)) {
                defpackage.lxy.e();
                defpackage.lxy.i(zbeVar2, defpackage.zbd.nq, packageName, 0L);
            }
        }
        java.lang.String str = this.a;
        if (android.text.TextUtils.equals(str, packageName)) {
            defpackage.lxy.e();
            defpackage.lxy.h(defpackage.zbe.MESSAGING_SBN, defpackage.zbd.lU, str);
        }
        if (defpackage.kmv.c(defpackage.acyu.b(), packageName)) {
            defpackage.lxy.e();
            defpackage.lxy.h(defpackage.zbe.MESSAGING_SBN, defpackage.zbd.md, packageName);
        }
        return false;
    }

    public final boolean b(android.service.notification.StatusBarNotification statusBarNotification) {
        return false;
    }
}
