package com.google.android.apps.auto.components.firstdrive;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class FirstDriveNotificationManager implements defpackage.lhn {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.FirstDrive");
    final oip b = new lec();
    public boolean c;

    public static com.google.android.apps.auto.components.firstdrive.FirstDriveNotificationManager a() {
        return (com.google.android.apps.auto.components.firstdrive.FirstDriveNotificationManager) defpackage.mkp.a.c(com.google.android.apps.auto.components.firstdrive.FirstDriveNotificationManager.class, defpackage.ygw.q(defpackage.mko.b), new defpackage.jqx(19));
    }

    public static final void b(defpackage.zbd zbdVar) {
        defpackage.omf.u().F((defpackage.rrw) defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.FIRST_DRIVE, zbdVar).l());
    }

    public static final android.app.PendingIntent e(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent(defpackage.mkp.a.c, (java.lang.Class<?>) com.google.android.apps.auto.components.firstdrive.FirstDriveNotificationManager.Receiver.class);
        intent.setAction("ACTION_ACCEPT");
        android.content.ClipData clipData = wer.a;
        return wer.c(context, 0, intent, 201326592);
    }

    @Override // defpackage.lhn
    public final void d() {
        defpackage.omf.t().f(this.b);
    }

    @Override // defpackage.lhn
    public final void eQ() {
        if (defpackage.acru.d()) {
            defpackage.omf.t().d(this.b, defpackage.ygw.q(defpackage.yyh.NON_UI));
        }
    }
}
