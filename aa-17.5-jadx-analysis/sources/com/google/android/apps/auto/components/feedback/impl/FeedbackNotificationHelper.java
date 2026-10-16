package com.google.android.apps.auto.components.feedback.impl;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.service.notification.StatusBarNotification;
import com.google.android.apps.auto.components.feedback.csat.postdrive.CsatPostdriveActivity;
import com.google.android.apps.auto.components.feedback.csat.postdrive.LegacyCsatPostdriveActivity;
import com.google.android.apps.auto.components.feedback.hats.HatsSurveyActivity;
import com.google.android.libraries.surveys.SurveyData;
import com.google.android.projection.gearhead.R;
import defpackage.acpo;
import defpackage.acxa;
import defpackage.dss;
import defpackage.dsw;
import defpackage.dsx;
import defpackage.dug;
import defpackage.ebf;
import defpackage.ikk;
import defpackage.lbt;
import defpackage.lcc;
import defpackage.lcq;
import defpackage.lcv;
import defpackage.lcy;
import defpackage.lda;
import defpackage.ldb;
import defpackage.ldc;
import defpackage.ldd;
import defpackage.ldf;
import defpackage.ldg;
import defpackage.lfn;
import defpackage.lnm;
import defpackage.mas;
import defpackage.mdd;
import defpackage.oit;
import defpackage.vky;
import defpackage.wdu;
import defpackage.yfq;
import defpackage.yls;
import defpackage.ype;
import defpackage.yph;
import defpackage.yzk;
import defpackage.yzy;
import defpackage.yzz;
import defpackage.zfq;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class FeedbackNotificationHelper {
    public static final yph a = yph.c("GH.FeedbackNotifHelper");
    private static final Duration b = Duration.ofMinutes(90);
    private static final Duration c = Duration.ofMinutes(30);

    /* loaded from: classes2.dex */
    public static class NotificationCancelReceiver extends mdd {
        public static PendingIntent c(Context context, String str) {
            return d(context, str, new Bundle(), 0);
        }

        public static PendingIntent d(Context context, String str, Bundle bundle, int i) {
            Intent intentPutExtras = new Intent(context, (Class<?>) NotificationCancelReceiver.class).setAction(str).putExtras(bundle);
            ClipData clipData = wdu.a;
            return wdu.c(context, i, intentPutExtras, 1140850688);
        }

        @Override // defpackage.mdd
        protected final vky a() {
            return new vky("NotificationCancelReceiver");
        }

        @Override // defpackage.mdd
        public final void b(Context context, Intent intent) {
            yph yphVar = FeedbackNotificationHelper.a;
            ((ype) yphVar.l().ai((char) 3749)).y("onReceive(%s)", intent);
            ldf ldcVar = null;
            if (intent.getAction() != null) {
                String action = intent.getAction();
                int iHashCode = action.hashCode();
                if (iHashCode != -1262024778) {
                    if (iHashCode != 1268163692) {
                        if (iHashCode == 1723559135 && action.equals("com.google.android.gearhead.feedback.CSAT_DISMISS")) {
                            ldcVar = ldb.a;
                        }
                    } else if (action.equals("com.google.android.gearhead.feedback.CSAT_RESPONSE")) {
                        int intExtra = intent.getIntExtra("com.google.android.gearhead.feedback.CSAT_RESPONSE_ACTION", -1);
                        yzy yzyVarB = yzy.b(intExtra);
                        if (yzyVarB == null) {
                            ((ype) ((ype) yphVar.g()).ai((char) 3756)).w("Unknown response action %d", intExtra);
                        } else {
                            ldcVar = new ldc(yzyVarB);
                        }
                    }
                } else if (action.equals("com.google.android.gearhead.feedback.CSAT_TIMEOUT")) {
                    ldcVar = ldg.a;
                }
            }
            if ("com.google.android.gearhead.feedback.TIMEOUT_HATS_NOTIFICATION".equals(intent.getAction())) {
                ((ype) yphVar.l().ai((char) 3755)).u("Received intent to timeout HaTS notification.");
                ebf.j().o(yzz.HATS_SURVEY, yzy.hl);
                FeedbackNotificationHelper.d(context);
                return;
            }
            if ("com.google.android.gearhead.feedback.DISMISS_HATS_NOTIFICATION".equals(intent.getAction())) {
                ((ype) yphVar.l().ai((char) 3754)).u("Received intent that the HaTS notification was dismissed.");
                ebf.j().o(yzz.HATS_SURVEY, yzy.hm);
                FeedbackNotificationHelper.e(context, "com.google.android.gearhead.feedback.TIMEOUT_HATS_NOTIFICATION");
                return;
            }
            if ("com.google.android.gearhead.feedback.DISMISS_RATING_PROMPT_NOTIFICATION".equals(intent.getAction())) {
                ((ype) yphVar.l().ai((char) 3753)).u("Received intent that the rating prompt notification was dismissed.");
                ebf.j().l(yzk.NOTIFICATION_DISMISSED);
                return;
            }
            if ("com.google.android.gearhead.feedback.DISMISS_AUTOLAUNCH_PROMPT_NOTIFICATION".equals(intent.getAction())) {
                ((ype) yphVar.l().ai((char) 3752)).u("Received intent that the autolaunch prompt notification was dismissed.");
                ebf.j().o(yzz.AUTOLAUNCH_PROMPT, yzy.hW);
                return;
            }
            if (ldcVar != null) {
                FeedbackNotificationHelper.c(context, false);
                int intExtra2 = intent.getIntExtra("com.google.android.gearhead.feedback.CSAT_SURVEY_CONTEXT", -1);
                ConcurrentHashMap concurrentHashMap = lbt.a;
                lbt lbtVarP = lnm.P(intExtra2);
                if (lbtVarP == null) {
                    ((ype) ((ype) yphVar.g()).ai((char) 3751)).w("Unknown survey for context %d", intExtra2);
                    return;
                }
                ((ype) yphVar.l().ai(3750)).M("Received %s intent for CSAT survey %s.", ldcVar.a().sn, lbtVarP.name());
                lda.a().c(lbtVarP, ldcVar);
                if (ldcVar instanceof ldc) {
                    lcq.a().b(context);
                }
            }
        }
    }

    public static dsx a(Context context, Intent intent, int i, int i2) {
        return h(context, intent, i, context.getString(i2));
    }

    public static dsx b(Context context, Intent intent, String str, int i, String str2) {
        String string = context.getString(i);
        ((ype) ((ype) a.f()).ai(3757)).S("Creating notification, intent: %s, channelId:%s, title:%s, body: %s", intent, str, string, str2);
        dsx dsxVar = new dsx(context, str);
        ClipData clipData = wdu.a;
        dsxVar.g = wdu.b(context, 0, intent, 335544320);
        dsxVar.i(string);
        dsxVar.h(str2);
        dsxVar.n(2131231121);
        dsxVar.t = context.getResources().getColor(R.color.gearhead_sdk_light_blue_500);
        dsw dswVar = new dsw();
        dswVar.d(str2);
        dsxVar.o(dswVar);
        dsxVar.l();
        dsxVar.e(16, true);
        return dsxVar;
    }

    public static void c(Context context, boolean z) {
        Bundle bundle;
        if (z) {
            for (StatusBarNotification statusBarNotification : ((NotificationManager) context.getSystemService(NotificationManager.class)).getActiveNotifications()) {
                if ("com.google.android.projection.gearhead".equals(statusBarNotification.getPackageName()) && statusBarNotification.getId() == R.id.csat_notification_id && (bundle = statusBarNotification.getNotification().extras) != null) {
                    int i = bundle.getInt("com.google.android.gearhead.feedback.CSAT_SURVEY_CONTEXT", -1);
                    ConcurrentHashMap concurrentHashMap = lbt.a;
                    lbt lbtVarP = lnm.P(i);
                    if (lbtVarP != null) {
                        lda.a().c(lbtVarP, ldd.a);
                    }
                }
            }
        }
        new dug(context).a(null, R.id.csat_notification_id);
        e(context, "com.google.android.gearhead.feedback.CSAT_TIMEOUT");
    }

    public static void d(Context context) {
        new dug(context).a(null, R.id.hats_notification_id);
        e(context, "com.google.android.gearhead.feedback.TIMEOUT_HATS_NOTIFICATION");
    }

    public static void e(Context context, String str) {
        ((AlarmManager) context.getSystemService("alarm")).cancel(NotificationCancelReceiver.c(context, str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void f(Context context, lbt lbtVar) {
        Intent intent;
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gearhead.feedback.CSAT_SURVEY_CONTEXT", lbtVar.a());
        int i = 1;
        if (acxa.ad()) {
            int i2 = CsatPostdriveActivity.m;
            context.getClass();
            lbtVar.getClass();
            intent = new Intent(context, (Class<?>) CsatPostdriveActivity.class);
            intent.putExtra("SURVEY_CONTEXT", lbtVar.a());
            intent.putExtra("RANDOMIZE_RESPONSES", true);
            intent.setFlags(268468224);
        } else {
            int i3 = LegacyCsatPostdriveActivity.m;
            context.getClass();
            lbtVar.getClass();
            intent = new Intent(context, (Class<?>) LegacyCsatPostdriveActivity.class);
            intent.putExtra("SURVEY_CONTEXT", lbtVar.a());
            intent.putExtra("RANDOMIZE_RESPONSES", true);
            intent.setFlags(268468224);
        }
        dsx dsxVarH = h(context, intent, R.string.csat_prompt_text, lbtVar.d(context));
        dsxVarH.s = new Bundle(bundle);
        int i4 = 0;
        dsxVarH.j(NotificationCancelReceiver.d(context, "com.google.android.gearhead.feedback.CSAT_DISMISS", bundle, 0));
        yfq yfqVar = lbtVar.t.b;
        int i5 = ((yls) yfqVar).c;
        if (i5 <= 3) {
            for (int i6 = 0; i6 < i5; i6++) {
                lcc lccVar = (lcc) yfqVar.get(i6);
                Bundle bundle2 = new Bundle(bundle);
                int iA = lccVar.a.a();
                bundle2.putInt("com.google.android.gearhead.feedback.CSAT_RESPONSE_ACTION", iA);
                dss dssVar = new dss(lccVar.b, lccVar.a(context), NotificationCancelReceiver.d(context, "com.google.android.gearhead.feedback.CSAT_RESPONSE", bundle2, iA));
                dssVar.b = true;
                Integer num = lccVar.d;
                if (num != null) {
                    dssVar.a = num.intValue();
                }
                dsxVarH.g(dssVar.a());
            }
        }
        new dug(context).b(null, R.id.csat_notification_id, dsxVarH.a());
        i(context, c, "com.google.android.gearhead.feedback.CSAT_TIMEOUT", bundle);
        lda ldaVarA = lda.a();
        lbtVar.getClass();
        lda.b.l().y("Survey %s: impression shown", lbtVar.name());
        lnm.M(lbtVar, yzy.FL);
        lcy lcyVar = ldaVarA.d;
        if (acpo.c()) {
            lcy.a(lcyVar.e.E(new lcv(i4)));
        } else {
            lcy.a(lcyVar.d.a(new ikk(new lfn(i), 13), zfq.a));
        }
    }

    public static void g(Context context, SurveyData surveyData, PersistableBundle persistableBundle, int i) {
        int i2;
        int i3;
        Intent component = new Intent().setComponent(new ComponentName("com.google.android.projection.gearhead", HatsSurveyActivity.class.getCanonicalName()));
        component.putExtra("gh_hats_survey_data", surveyData);
        component.putExtra("gh_hats_survey_psd", persistableBundle);
        if (i - 1 != 1) {
            i2 = R.string.hats_notification_body;
            i3 = R.string.hats_notification_title;
        } else {
            i2 = R.string.hats_lapse_notification_body;
            i3 = R.string.hats_lapse_notification_title;
        }
        dsx dsxVarA = a(context, component, i3, i2);
        dsxVarA.j(NotificationCancelReceiver.c(context, "com.google.android.gearhead.feedback.DISMISS_HATS_NOTIFICATION"));
        new dug(context).b(null, R.id.hats_notification_id, dsxVarA.a());
        i(context, b, "com.google.android.gearhead.feedback.TIMEOUT_HATS_NOTIFICATION", new Bundle());
        ebf.j().o(yzz.HATS_SURVEY, yzy.hk);
    }

    private static dsx h(Context context, Intent intent, int i, String str) {
        mas.c();
        return b(context, intent, "gearhead_surveys_and_feedback", i, str);
    }

    private static void i(Context context, Duration duration, String str, Bundle bundle) {
        oit.a();
        ((AlarmManager) context.getSystemService("alarm")).set(1, Instant.now().toEpochMilli() + duration.toMillis(), NotificationCancelReceiver.d(context, str, bundle, 0));
    }
}
