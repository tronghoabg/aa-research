package defpackage;

import android.app.NotificationChannel;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.service.personalcontext.hint.ContextHint;
import android.service.personalcontext.hint.NotificationEvent;
import android.service.personalcontext.hint.NotificationHint;
import android.service.personalcontext.insight.ContextInsight;
import android.service.personalcontext.insight.DisplayInsight;
import android.service.personalcontext.insight.InsightDisplayDetails;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class jrf implements max {
    public static final yph a = yph.c("GH.AceInsights");
    public final Map b = new ConcurrentHashMap();

    @Override // defpackage.max
    public final /* synthetic */ boolean a(StatusBarNotification statusBarNotification, int i, boolean z) {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 2698)).y("Notification posted: %s", statusBarNotification.getPackageName());
        ContextInsight contextInsightBuild = new DisplayInsight.Builder(new InsightDisplayDetails.Builder("Fake Insight for ".concat(String.valueOf(statusBarNotification.getPackageName()))).build()).build();
        ContextHint contextHintE = hdd.e(new hou("PERSON_PHONE"));
        NotificationListenerService.RankingMap rankingMapB = lxr.l().b();
        if (rankingMapB == null) {
            ((ype) ((ype) yphVar.h()).ai((char) 2697)).u("No ranking map");
        } else {
            this.b.put(contextInsightBuild, ygr.p(contextHintE, new NotificationHint.Builder(new NotificationEvent.NotificationEnqueuedEvent(statusBarNotification, new NotificationChannel("id", "name", 4), rankingMapB)).build()));
        }
        jre.a().e(contextInsightBuild);
        return false;
    }

    @Override // defpackage.max
    public final boolean b(StatusBarNotification statusBarNotification) {
        return false;
    }
}
