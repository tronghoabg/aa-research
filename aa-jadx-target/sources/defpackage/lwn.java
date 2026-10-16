package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lwn {
    private final defpackage.mbw a;
    private final defpackage.oim b;
    private final android.content.Context c;

    static {
        defpackage.yqm.c("GH.MsgPiMgr");
    }

    public lwn(android.content.Context context, defpackage.oim oimVar, defpackage.mbw mbwVar) {
        this.b = oimVar;
        this.a = mbwVar;
        this.c = context;
    }

    public static defpackage.lwn a() {
        return (defpackage.lwn) defpackage.mkp.a.i(defpackage.lwn.class);
    }

    private static final void d(android.app.PendingIntent pendingIntent) {
        try {
            pendingIntent.send();
            android.util.Log.v("GH.MsgPiMgr", "#send called on mark-as-read PendingIntent");
        } catch (android.app.PendingIntent.CanceledException e) {
            android.util.Log.w("GH.MsgPiMgr", "Failed to send mark-as-read PendingIntent", e);
        }
    }

    private final void e(android.app.PendingIntent pendingIntent, dut dutVar, java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putCharSequence(dutVar.a, str);
        android.content.Intent intent = new android.content.Intent();
        android.app.RemoteInput.addResultsToIntent(dut.a(new dut[]{dutVar}), intent, bundle);
        try {
            pendingIntent.send(this.c, 0, intent);
            android.util.Log.d("GH.MsgPiMgr", "#send called on reply PendingIntent");
        } catch (android.app.PendingIntent.CanceledException e) {
            android.util.Log.w("GH.MsgPiMgr", "Failed to send reply to SBN", e);
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final void b(java.lang.String str) {
        mbu mbuVarA = this.a.a(str);
        if (mbuVarA == null) {
            defpackage.lxy.e();
            defpackage.lxy.j(defpackage.zbe.MESSAGING, defpackage.zbd.nD, defpackage.zaa.MESSAGING_MARK_AS_READ_SBN_NOT_FOUND_RACE_CONDITION, null);
            return;
        }
        j$.util.Optional optionalEmpty = j$.util.Optional.empty();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        mbv mbvVarA = mbuVarA.a(optionalEmpty, j$.util.Optional.of(bool), j$.util.Optional.empty(), j$.util.Optional.of(bool), j$.util.Optional.empty());
        android.service.notification.StatusBarNotification statusBarNotification = mbvVarA.a;
        java.lang.String packageName = statusBarNotification.getPackageName();
        android.content.ComponentName componentName = new android.content.ComponentName(packageName, "");
        if (mbvVarA.b) {
            defpackage.oim oimVar = this.b;
            defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MESSAGING, defpackage.zbd.mB);
            rrvVarH.p(componentName);
            oimVar.F(rrvVarH.l());
        }
        if (mbvVarA.d) {
            defpackage.oim oimVar2 = this.b;
            defpackage.rrv rrvVarH2 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MESSAGING, defpackage.zbd.mD);
            rrvVarH2.p(componentName);
            oimVar2.F(rrvVarH2.l());
        }
        defpackage.lwk lwkVar = new defpackage.lwk(statusBarNotification, false);
        if (lwkVar.k()) {
            defpackage.lxy.e();
            defpackage.lxy.j(defpackage.zbe.MESSAGING, defpackage.zbd.nC, defpackage.zaa.MESSAGING_MARK_AS_READ_USING_NOTIFICATION_ACTION, packageName);
        } else if (lwkVar.e != null) {
            defpackage.lxy.e();
            defpackage.lxy.j(defpackage.zbe.MESSAGING, defpackage.zbd.nB, defpackage.zaa.MESSAGING_MARK_AS_READ_USING_CAR_EXTENDER, packageName);
        }
        defpackage.dta dtaVarC = lwkVar.c();
        dtaVarC.getClass();
        android.app.PendingIntent pendingIntent = dtaVarC.k;
        pendingIntent.getClass();
        d(pendingIntent);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final void c(java.lang.String str, java.lang.String str2) {
        mbu mbuVarA = this.a.a(str);
        if (mbuVarA == null) {
            defpackage.lxy.e();
            defpackage.lxy.j(defpackage.zbe.MESSAGING, defpackage.zbd.nA, defpackage.zaa.MESSAGING_REPLY_SBN_NOT_FOUND_RACE_CONDITION, null);
            return;
        }
        j$.util.Optional optionalEmpty = j$.util.Optional.empty();
        j$.util.Optional optionalEmpty2 = j$.util.Optional.empty();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        mbv mbvVarA = mbuVarA.a(optionalEmpty, optionalEmpty2, j$.util.Optional.of(bool), j$.util.Optional.empty(), j$.util.Optional.of(bool));
        android.service.notification.StatusBarNotification statusBarNotification = mbvVarA.a;
        java.lang.String packageName = statusBarNotification.getPackageName();
        android.content.ComponentName componentName = new android.content.ComponentName(packageName, "");
        if (mbvVarA.c) {
            defpackage.oim oimVar = this.b;
            defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MESSAGING, defpackage.zbd.mC);
            rrvVarH.p(componentName);
            oimVar.F(rrvVarH.l());
        }
        if (mbvVarA.e) {
            defpackage.oim oimVar2 = this.b;
            defpackage.rrv rrvVarH2 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MESSAGING, defpackage.zbd.mE);
            rrvVarH2.p(componentName);
            oimVar2.F(rrvVarH2.l());
        }
        defpackage.lwk lwkVar = new defpackage.lwk(statusBarNotification, false);
        if (lwkVar.l()) {
            defpackage.lxy.e();
            defpackage.lxy.j(defpackage.zbe.MESSAGING, defpackage.zbd.nz, defpackage.zaa.MESSAGING_REPLY_USING_NOTIFICATION_ACTION, packageName);
        } else if (lwkVar.e != null) {
            defpackage.lxy.e();
            defpackage.lxy.j(defpackage.zbe.MESSAGING, defpackage.zbd.ny, defpackage.zaa.MESSAGING_REPLY_USING_CAR_EXTENDER, packageName);
        }
        defpackage.dta dtaVarD = lwkVar.d();
        dtaVarD.getClass();
        android.app.PendingIntent pendingIntent = dtaVarD.k;
        pendingIntent.getClass();
        dut[] dutVarArr = dtaVarD.b;
        dutVarArr.getClass();
        e(pendingIntent, dutVarArr[0], str2);
    }
}
