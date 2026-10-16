package com.google.android.apps.auto.components.feedback.impl;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class FeedbackNotificationHelper {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.FeedbackNotifHelper");
    private static final j$.time.Duration b = j$.time.Duration.ofMinutes(90);
    private static final j$.time.Duration c = j$.time.Duration.ofMinutes(30);

    public static defpackage.dte a(android.content.Context context, android.content.Intent intent, int i, int i2) {
        return h(context, intent, i, context.getString(i2));
    }

    public static defpackage.dte b(android.content.Context context, android.content.Intent intent, java.lang.String str, int i, java.lang.String str2) {
        java.lang.String string = context.getString(i);
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(3760)).S("Creating notification, intent: %s, channelId:%s, title:%s, body: %s", intent, str, string, str2);
        defpackage.dte dteVar = new defpackage.dte(context, str);
        android.content.ClipData clipData = wer.a;
        dteVar.g = wer.b(context, 0, intent, 335544320);
        dteVar.i(string);
        dteVar.h(str2);
        dteVar.n(2131231121);
        dteVar.t = context.getResources().getColor(2131100587);
        dtd dtdVar = new dtd();
        dtdVar.d(str2);
        dteVar.o(dtdVar);
        dteVar.l();
        dteVar.e(16, true);
        return dteVar;
    }

    public static void c(android.content.Context context, boolean z) {
        android.os.Bundle bundle;
        if (z) {
            for (android.service.notification.StatusBarNotification statusBarNotification : ((android.app.NotificationManager) context.getSystemService(android.app.NotificationManager.class)).getActiveNotifications()) {
                if ("com.google.android.projection.gearhead".equals(statusBarNotification.getPackageName()) && statusBarNotification.getId() == 2131427878 && (bundle = statusBarNotification.getNotification().extras) != null) {
                    int i = bundle.getInt("com.google.android.gearhead.feedback.CSAT_SURVEY_CONTEXT", -1);
                    j$.util.concurrent.ConcurrentHashMap concurrentHashMap = defpackage.lby.a;
                    defpackage.lby lbyVarJ = defpackage.jzl.j(i);
                    if (lbyVarJ != null) {
                        defpackage.ldf.a().c(lbyVarJ, ldi.a);
                    }
                }
            }
        }
        new defpackage.dun(context).a(null, 2131427878);
        e(context, "com.google.android.gearhead.feedback.CSAT_TIMEOUT");
    }

    public static void d(android.content.Context context) {
        new defpackage.dun(context).a(null, 2131428326);
        e(context, "com.google.android.gearhead.feedback.TIMEOUT_HATS_NOTIFICATION");
    }

    public static void e(android.content.Context context, java.lang.String str) {
        ((android.app.AlarmManager) context.getSystemService("alarm")).cancel(com.google.android.apps.auto.components.feedback.impl.FeedbackNotificationHelper.NotificationCancelReceiver.c(context, str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void f(android.content.Context context, defpackage.lby lbyVar) {
        android.content.Intent intent;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("com.google.android.gearhead.feedback.CSAT_SURVEY_CONTEXT", lbyVar.a());
        if (defpackage.acyc.ae()) {
            int i = com.google.android.apps.auto.components.feedback.csat.postdrive.CsatPostdriveActivity.m;
            context.getClass();
            lbyVar.getClass();
            intent = new android.content.Intent(context, (java.lang.Class<?>) com.google.android.apps.auto.components.feedback.csat.postdrive.CsatPostdriveActivity.class);
            intent.putExtra("SURVEY_CONTEXT", lbyVar.a());
            intent.putExtra("RANDOMIZE_RESPONSES", true);
            intent.setFlags(268468224);
        } else {
            int i2 = com.google.android.apps.auto.components.feedback.csat.postdrive.LegacyCsatPostdriveActivity.m;
            context.getClass();
            lbyVar.getClass();
            intent = new android.content.Intent(context, (java.lang.Class<?>) com.google.android.apps.auto.components.feedback.csat.postdrive.LegacyCsatPostdriveActivity.class);
            intent.putExtra("SURVEY_CONTEXT", lbyVar.a());
            intent.putExtra("RANDOMIZE_RESPONSES", true);
            intent.setFlags(268468224);
        }
        defpackage.dte dteVarH = h(context, intent, 2132083850, lbyVar.d(context));
        dteVarH.s = new android.os.Bundle(bundle);
        dteVarH.j(com.google.android.apps.auto.components.feedback.impl.FeedbackNotificationHelper.NotificationCancelReceiver.d(context, "com.google.android.gearhead.feedback.CSAT_DISMISS", bundle, 0));
        defpackage.ygw ygwVar = lbyVar.t.b;
        int i3 = ((defpackage.ymx) ygwVar).c;
        if (i3 <= 3) {
            for (int i4 = 0; i4 < i3; i4++) {
                defpackage.lch lchVar = (defpackage.lch) ygwVar.get(i4);
                android.os.Bundle bundle2 = new android.os.Bundle(bundle);
                int iA = lchVar.a.a();
                bundle2.putInt("com.google.android.gearhead.feedback.CSAT_RESPONSE_ACTION", iA);
                dsz dszVar = new dsz(lchVar.b, lchVar.a(context), com.google.android.apps.auto.components.feedback.impl.FeedbackNotificationHelper.NotificationCancelReceiver.d(context, "com.google.android.gearhead.feedback.CSAT_RESPONSE", bundle2, iA));
                dszVar.b = true;
                java.lang.Integer num = lchVar.d;
                if (num != null) {
                    dszVar.a = num.intValue();
                }
                dteVarH.g(dszVar.a());
            }
        }
        new defpackage.dun(context).b(null, 2131427878, dteVarH.a());
        i(context, c, "com.google.android.gearhead.feedback.CSAT_TIMEOUT", bundle);
        defpackage.ldf ldfVarA = defpackage.ldf.a();
        lbyVar.getClass();
        defpackage.ldf.b.l().y("Survey %s: impression shown", lbyVar.name());
        defpackage.jzl.g(lbyVar, defpackage.zbd.FP);
        defpackage.ldd lddVar = ldfVarA.d;
        if (defpackage.acqq.c()) {
            defpackage.ldd.a(lddVar.e.E(new lda(0)));
        } else {
            defpackage.ldd.a(lddVar.d.a(new defpackage.iku(new lfs(1), 13), defpackage.zgt.INSTANCE));
        }
    }

    public static void g(android.content.Context context, com.google.android.libraries.surveys.SurveyData surveyData, android.os.PersistableBundle persistableBundle, int i) {
        int i2;
        int i3;
        android.content.Intent component = new android.content.Intent().setComponent(new android.content.ComponentName("com.google.android.projection.gearhead", com.google.android.apps.auto.components.feedback.hats.HatsSurveyActivity.class.getCanonicalName()));
        component.putExtra("gh_hats_survey_data", (android.os.Parcelable) surveyData);
        component.putExtra("gh_hats_survey_psd", persistableBundle);
        if (i - 1 != 1) {
            i2 = 2132084221;
            i3 = 2132084222;
        } else {
            i2 = 2132084219;
            i3 = 2132084220;
        }
        defpackage.dte dteVarA = a(context, component, i3, i2);
        dteVarA.j(com.google.android.apps.auto.components.feedback.impl.FeedbackNotificationHelper.NotificationCancelReceiver.c(context, "com.google.android.gearhead.feedback.DISMISS_HATS_NOTIFICATION"));
        new defpackage.dun(context).b(null, 2131428326, dteVarA.a());
        i(context, b, "com.google.android.gearhead.feedback.TIMEOUT_HATS_NOTIFICATION", new android.os.Bundle());
        defpackage.omf.u().o(defpackage.zbe.HATS_SURVEY, defpackage.zbd.hk);
    }

    private static defpackage.dte h(android.content.Context context, android.content.Intent intent, int i, java.lang.String str) {
        defpackage.maz.c();
        return b(context, intent, "gearhead_surveys_and_feedback", i, str);
    }

    private static void i(android.content.Context context, j$.time.Duration duration, java.lang.String str, android.os.Bundle bundle) {
        defpackage.ojm.a();
        ((android.app.AlarmManager) context.getSystemService("alarm")).set(1, j$.time.Instant.now().toEpochMilli() + duration.toMillis(), com.google.android.apps.auto.components.feedback.impl.FeedbackNotificationHelper.NotificationCancelReceiver.d(context, str, bundle, 0));
    }
}
