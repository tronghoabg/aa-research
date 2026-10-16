package com.google.android.apps.auto.components.headunit;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import defpackage.htm;
import defpackage.ikj;
import defpackage.mdd;
import defpackage.mmc;
import defpackage.rpz;
import defpackage.rrb;
import defpackage.rrc;
import defpackage.vky;
import defpackage.xwx;
import defpackage.yfq;
import defpackage.yph;
import defpackage.yxy;
import defpackage.yzy;
import defpackage.yzz;
import kotlin.Metadata;

/* loaded from: classes.dex */
public final class HeadUnitUpdateManager {
    public static final yph a = yph.c("GH.HeadUnitUpdate");
    public final Context b;
    public final rpz c;
    public final yfq d;
    public Notification e;
    public boolean f;
    public String g;
    public int h;
    public String i;
    public String j;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000B\t\b\u0016¢\u0006\u0004\b\b\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/google/android/apps/auto/components/headunit/HeadUnitUpdateManager$NotificationActionBroadcastReceiver;", "Lcom/google/android/apps/auto/components/performance/TracedBroadcastReceiver;", "clock", "Lcom/google/android/libraries/clock/Clock;", "carTelemetryLoggerFactory", "Lcom/google/common/base/Function;", "Landroid/content/Context;", "Lcom/google/android/gms/car/log/CarTelemetryLogger;", "<init>", "(Lcom/google/android/libraries/clock/Clock;Lcom/google/common/base/Function;)V", "()V", "doReceive", "", "context", "intent", "Landroid/content/Intent;", "openUrl", "url", "", "getClassNameNotObfuscated", "Lcom/google/android/libraries/performance/primes/NoPiiString;", "java.com.google.android.apps.auto.components.headunit_headunit"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class NotificationActionBroadcastReceiver extends mdd {
        private final xwx a = new ikj(7);

        @Override // defpackage.mdd
        protected final vky a() {
            return new vky("NotificationActionBroadcastReceiver");
        }

        @Override // defpackage.mdd
        public final void b(Context context, Intent intent) {
            context.getClass();
            intent.getClass();
            HeadUnitUpdateManager.a.l().M("onReceive(%s, %s)", context, intent);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            String stringExtra = intent.getStringExtra("url_extra");
            stringExtra.getClass();
            if (stringExtra.length() <= 0) {
                throw new IllegalStateException("Must provide a valid URL to open");
            }
            long longExtra = intent.getLongExtra("notification_created_ms", -1L);
            if (longExtra < 0) {
                throw new IllegalStateException("Intent does not include the time the notification was created.");
            }
            if (longExtra > jElapsedRealtime) {
                throw new IllegalStateException("Intent claims notification was created in the future!");
            }
            mmc mmcVarE = e();
            Object objA = this.a.a(context);
            objA.getClass();
            rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.HEAD_UNIT_UPDATER, yzy.Kv);
            rrbVarH.u(jElapsedRealtime - longExtra);
            ((rpz) objA).c(rrbVarH.l());
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(stringExtra));
            intent2.addFlags(268435456);
            context.startActivity(intent2);
            mmcVarE.i();
        }
    }

    public HeadUnitUpdateManager(Context context) {
        context.getClass();
        rpz rpzVarA = rpz.a(context);
        rpzVarA.getClass();
        yfq yfqVarQ = yfq.q(new htm((char[]) null, (char[]) null));
        this.b = context;
        this.c = rpzVarA;
        this.d = yfqVarQ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.android.gms.car.CarInfo r7, android.content.SharedPreferences r8, java.lang.String r9, java.lang.String r10) {
        /*
            r6 = this;
            yxy r0 = defpackage.yxy.GEARHEAD
            r1 = 41
            yyv r2 = defpackage.yyv.HEAD_UNIT_NEEDS_UPDATE
            rqu r0 = defpackage.rqv.h(r0, r1, r2)
            yxq r1 = r7.a()
            r0.f(r1)
            rqy r0 = r0.l()
            rpz r1 = r6.c
            r1.c(r0)
            yph r0 = com.google.android.apps.auto.components.headunit.HeadUnitUpdateManager.a
            yop r1 = r0.f()
            ype r1 = (defpackage.ype) r1
            java.lang.String r2 = "Head unit needs update %s"
            r1.y(r2, r7)
            java.lang.String r1 = defpackage.lnm.C(r7)
            r2 = 0
            int r1 = r8.getInt(r1, r2)
            java.lang.String r3 = defpackage.lnm.D(r7)
            int r8 = r8.getInt(r3, r2)
            long r3 = defpackage.acrt.c()
            int r3 = (int) r3
            long r4 = defpackage.acrt.b()
            int r4 = (int) r4
            r5 = 1
            if (r4 < 0) goto L52
            if (r4 > r8) goto L52
            yop r8 = r0.l()
            java.lang.String r0 = "Head unit softwar needs update, but too many messages shown"
            r8.u(r0)
        L50:
            r8 = r2
            goto L65
        L52:
            if (r1 == 0) goto L64
            if (r3 != 0) goto L60
            yop r8 = r0.l()
            java.lang.String r0 = "Head unit software needs update, but message already shown"
            r8.u(r0)
            goto L50
        L60:
            int r8 = r1 % r3
            if (r8 != 0) goto L50
        L64:
            r8 = r5
        L65:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r0) goto L6b
            goto L6d
        L6b:
            int r0 = r1 + 1
        L6d:
            if (r5 != r8) goto L70
            r0 = r5
        L70:
            r6.h = r0
            java.lang.String r0 = defpackage.lnm.C(r7)
            r6.i = r0
            r6.g = r9
            if (r8 == 0) goto Le8
            java.lang.String r7 = defpackage.lnm.D(r7)
            r6.j = r7
            r6.f = r5
            if (r10 == 0) goto Le8
            int r7 = r10.length()
            if (r7 != 0) goto L8d
            goto Le8
        L8d:
            android.content.Context r7 = r6.b
            android.content.Intent r8 = new android.content.Intent
            android.content.Context r9 = r7.getApplicationContext()
            java.lang.Class<com.google.android.apps.auto.components.headunit.HeadUnitUpdateManager$NotificationActionBroadcastReceiver> r0 = com.google.android.apps.auto.components.headunit.HeadUnitUpdateManager.NotificationActionBroadcastReceiver.class
            r8.<init>(r9, r0)
            java.lang.String r9 = "notification_created_ms"
            long r0 = android.os.SystemClock.elapsedRealtime()
            r8.putExtra(r9, r0)
            java.lang.String r9 = "url_extra"
            android.content.Intent r8 = r8.putExtra(r9, r10)
            r8.getClass()
            android.content.ClipData r9 = defpackage.wdu.a
            r9 = 1409286144(0x54000000, float:2.1990233E12)
            android.app.PendingIntent r8 = defpackage.wdu.c(r7, r2, r8, r9)
            dsx r9 = new dsx
            defpackage.mas.c()
            java.lang.String r10 = "gearhead_alerts"
            r9.<init>(r7, r10)
            r10 = 2131231572(0x7f080354, float:1.8079229E38)
            r9.n(r10)
            r10 = 2132084624(0x7f150790, float:1.9809424E38)
            java.lang.String r10 = r7.getString(r10)
            r9.i(r10)
            r10 = 2132084618(0x7f15078a, float:1.9809412E38)
            java.lang.String r7 = r7.getString(r10)
            r9.h(r7)
            r9.g = r8
            r7 = 16
            r9.e(r7, r5)
            android.app.Notification r7 = r9.a()
            r7.getClass()
            r6.e = r7
        Le8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.auto.components.headunit.HeadUnitUpdateManager.a(com.google.android.gms.car.CarInfo, android.content.SharedPreferences, java.lang.String, java.lang.String):void");
    }
}
