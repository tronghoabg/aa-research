package com.google.android.apps.auto.components.headunit;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class HeadUnitUpdateManager {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.HeadUnitUpdate");
    public final android.content.Context b;
    public final defpackage.rqt c;
    public final defpackage.ygw d;
    public android.app.Notification e;
    public boolean f;
    public java.lang.String g;
    public int h;
    public java.lang.String i;
    public java.lang.String j;

    public HeadUnitUpdateManager(android.content.Context context) {
        context.getClass();
        defpackage.rqt rqtVarA = defpackage.rqt.a(context);
        rqtVarA.getClass();
        defpackage.ygw ygwVarQ = defpackage.ygw.q(new defpackage.htw((char[]) null, (char[]) null));
        this.b = context;
        this.c = rqtVarA;
        this.d = ygwVarQ;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006b  */
    /* JADX WARN: Code duplicated, block: B:18:0x006f  */
    /* JADX WARN: Code duplicated, block: B:21:0x007c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0086  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    public final void a(com.google.android.gms.car.CarInfo carInfo, android.content.SharedPreferences sharedPreferences, java.lang.String str, java.lang.String str2) {
        boolean z;
        int i;
        defpackage.rro rroVarH = defpackage.rrp.h(defpackage.yzd.GEARHEAD, 41, defpackage.zaa.HEAD_UNIT_NEEDS_UPDATE);
        rroVarH.f(carInfo.a());
        this.c.c(rroVarH.l());
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.f()).y("Head unit needs update %s", carInfo);
        int i2 = sharedPreferences.getInt(defpackage.kzi.v(carInfo), 0);
        int i3 = sharedPreferences.getInt(defpackage.kzi.w(carInfo), 0);
        int iC = (int) defpackage.acsv.c();
        int iB = (int) defpackage.acsv.b();
        if (iB < 0 || iB > i3) {
            if (i2 != 0) {
                if (iC != 0) {
                    if (i2 % iC == 0) {
                    }
                    i = i2 != Integer.MAX_VALUE ? i2 + 1 : Integer.MAX_VALUE;
                    if (true == z) {
                        i = 1;
                    }
                    this.h = i;
                    this.i = defpackage.kzi.v(carInfo);
                    this.g = str;
                    if (z) {
                        this.j = defpackage.kzi.w(carInfo);
                        this.f = true;
                        if (str2 != null || str2.length() == 0) {
                        }
                        android.content.Context context = this.b;
                        android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) com.google.android.apps.auto.components.headunit.HeadUnitUpdateManager.NotificationActionBroadcastReceiver.class);
                        intent.putExtra("notification_created_ms", android.os.SystemClock.elapsedRealtime());
                        android.content.Intent intentPutExtra = intent.putExtra("url_extra", str2);
                        intentPutExtra.getClass();
                        android.content.ClipData clipData = wer.a;
                        android.app.PendingIntent pendingIntentC = wer.c(context, 0, intentPutExtra, 1409286144);
                        defpackage.maz.c();
                        defpackage.dte dteVar = new defpackage.dte(context, "gearhead_alerts");
                        dteVar.n(2131231572);
                        dteVar.i(context.getString(2132084648));
                        dteVar.h(context.getString(2132084642));
                        dteVar.g = pendingIntentC;
                        dteVar.e(16, true);
                        android.app.Notification notificationA = dteVar.a();
                        notificationA.getClass();
                        this.e = notificationA;
                        return;
                    }
                }
                yqmVar.l().u("Head unit software needs update, but message already shown");
            }
            z = true;
            if (i2 != Integer.MAX_VALUE) {
            }
            if (true == z) {
                i = 1;
            }
            this.h = i;
            this.i = defpackage.kzi.v(carInfo);
            this.g = str;
            if (z) {
                this.j = defpackage.kzi.w(carInfo);
                this.f = true;
                if (str2 != null) {
                }
            }
        }
        yqmVar.l().u("Head unit softwar needs update, but too many messages shown");
        z = false;
        if (i2 != Integer.MAX_VALUE) {
        }
        if (true == z) {
            i = 1;
        }
        this.h = i;
        this.i = defpackage.kzi.v(carInfo);
        this.g = str;
        if (z) {
            this.j = defpackage.kzi.w(carInfo);
            this.f = true;
            if (str2 != null) {
            }
        }
    }
}
