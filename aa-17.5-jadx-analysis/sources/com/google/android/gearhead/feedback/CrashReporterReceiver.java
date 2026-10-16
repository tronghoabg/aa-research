package com.google.android.gearhead.feedback;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.auto.components.bugreport.BugreporterReceiver;
import com.google.android.apps.auto.components.feedback.impl.FeedbackNotificationHelper;
import com.google.android.projection.gearhead.R;
import defpackage.acvz;
import defpackage.dsx;
import defpackage.dug;
import defpackage.lbj;
import defpackage.ldm;
import defpackage.mas;
import defpackage.mdd;
import defpackage.qie;
import defpackage.rpz;
import defpackage.rqv;
import defpackage.vky;
import defpackage.wdu;
import defpackage.ype;
import defpackage.yph;
import defpackage.yxy;
import defpackage.yyv;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public final class CrashReporterReceiver extends mdd {
    private static final yph a = yph.c("GH.CrashReporterReceive");

    static {
        Executors.newSingleThreadExecutor();
    }

    @Override // defpackage.mdd
    protected final vky a() {
        return new vky("CrashReporterReceiver");
    }

    @Override // defpackage.mdd
    public final void b(Context context, Intent intent) {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 7309)).y("Starting crash reporter receiver. %s", intent);
        if (intent == null) {
            ((ype) ((ype) yphVar.g()).ai((char) 7312)).u("Intent is null");
            return;
        }
        if (lbj.a.contains(Integer.valueOf((int) acvz.b()))) {
            yph yphVar2 = ldm.b;
            if (intent.getBooleanExtra("request_user_feedback", true)) {
                ((ype) ((ype) yphVar.f()).ai((char) 7311)).u("Requesting user to send feedback.");
                rpz.a(context).c(rqv.h(yxy.GEARHEAD, 30, yyv.CRASH_NOTIFIER_STARTED).l());
                yph yphVar3 = qie.a;
                Bundle extras = intent.getExtras();
                Intent intentC = BugreporterReceiver.c("ORIGIN_CRASH", context.getString(R.string.crash_bugreport_title));
                intentC.putExtras(extras);
                yph yphVar4 = FeedbackNotificationHelper.a;
                mas.c();
                dsx dsxVarB = FeedbackNotificationHelper.b(context, intentC, "gearhead_alerts", R.string.crash_notification_title, context.getString(R.string.crash_notification_subtitle));
                dsxVarB.g = wdu.c(context, 0, intentC, 1140850688);
                dsxVarB.n(2131233246);
                new dug(context).b(null, R.id.crash_bugreport_notification_id, dsxVarB.a());
                return;
            }
        }
        ((ype) ((ype) yphVar.h()).ai((char) 7310)).u("Received a request for user feedback when we shouldn't have");
    }
}
