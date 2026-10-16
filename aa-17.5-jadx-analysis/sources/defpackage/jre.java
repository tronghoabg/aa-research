package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.service.notification.StatusBarNotification;
import android.service.personalcontext.PersonalContextManager;
import android.service.personalcontext.hint.NotificationEvent;
import android.service.personalcontext.hint.NotificationHint;
import android.service.personalcontext.hint.PublishedContextHint;
import android.service.personalcontext.insight.ContextInsight;
import android.service.personalcontext.insight.InsightCollection;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class jre implements lhg {
    public static final yph a = yph.c("GH.AceInsights");
    static final ComponentName b = new ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.components.ace.AceInsightRendererService");
    public final List c = new CopyOnWriteArrayList();
    public final Map d = new ConcurrentHashMap();
    public final Handler e = new Handler(Looper.getMainLooper());
    private jrf f;

    public static jre a() {
        return (jre) mki.a.b(jre.class, new jqw(0));
    }

    public static boolean f() {
        boolean z = e.a;
        if (Build.VERSION.SDK_INT < 37) {
            if (!e.a) {
                e.a();
            }
            if (!e.b) {
                return false;
            }
        }
        if (acll.c() != yzy.lw.a()) {
            return false;
        }
        Context context = mki.a.c;
        if (context.checkSelfPermission("android.permission.PERSONAL_CONTEXT_READ_SETTINGS") != 0) {
            ((ype) ((ype) a.h()).ai((char) 2660)).u("Permission not granted");
            return false;
        }
        PersonalContextManager personalContextManager = (PersonalContextManager) context.getSystemService(PersonalContextManager.class);
        if (personalContextManager != null && personalContextManager.isEnabled()) {
            return true;
        }
        ((ype) a.l().ai((char) 2659)).u("ACE disabled");
        return false;
    }

    private final jrc g(ContextInsight contextInsight) {
        long postTime = -1;
        jra jraVar = null;
        for (NotificationHint notificationHint : b(contextInsight)) {
            if (notificationHint instanceof NotificationHint) {
                NotificationEvent.NotificationEnqueuedEvent notificationEvent = notificationHint.getNotificationEvent();
                if (notificationEvent instanceof NotificationEvent.NotificationEnqueuedEvent) {
                    StatusBarNotification statusBarNotification = notificationEvent.getStatusBarNotification();
                    int id = statusBarNotification.getId();
                    String packageName = statusBarNotification.getPackageName();
                    if (id == -1 || packageName == null) {
                        ((ype) ((ype) a.h()).ai(2663)).K("Invalid NotificationEnqueuedEvent: %s %d", packageName, id);
                    } else if (jraVar == null) {
                        jraVar = new jra(packageName, id);
                        postTime = statusBarNotification.getPostTime();
                        ((ype) a.l().ai(2665)).L("Notification enqueued: %s at %d", jraVar, postTime);
                    } else {
                        ((ype) ((ype) a.h()).ai(2664)).K("Ignoring additional valid NotificationEnqueuedEvent: %s %d", packageName, id);
                    }
                }
            }
        }
        if (jraVar != null) {
            return new jrc(jraVar, postTime);
        }
        return null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:446:0x0745. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x0756 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:627:0x0741 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v3, types: [jqz] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void h(android.service.personalcontext.insight.ContextInsight r10, boolean r11, java.util.List r12) {
        /*
            Method dump skipped, instructions count: 2542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jre.h(android.service.personalcontext.insight.ContextInsight, boolean, java.util.List):void");
    }

    private static void i(boolean z) {
        mki.a.c.getPackageManager().setComponentEnabledSetting(b, true != z ? 2 : 1, 1);
    }

    private final void j(jra jraVar, long j, List list) {
        this.e.post(new jqx(this, jraVar, j, list, 0));
    }

    final Set b(ContextInsight contextInsight) {
        jrf jrfVar = this.f;
        if (jrfVar != null) {
            Set set = (Set) jrfVar.b.get(contextInsight);
            return set != null ? set : yly.a;
        }
        Set originHints = contextInsight.getOriginHints();
        HashSet hashSet = new HashSet();
        Iterator it = originHints.iterator();
        while (it.hasNext()) {
            hashSet.add(((PublishedContextHint) it.next()).getContextHint());
        }
        return hashSet;
    }

    @Override // defpackage.lhg
    public final void c() {
        if (f()) {
            yph yphVar = a;
            ((ype) yphVar.l().ai((char) 2690)).u("Starting");
            if (!acll.g()) {
                i(true);
                return;
            }
            ((ype) yphVar.l().ai((char) 2691)).u("Fake insight generation enabled, not enabling real service");
            jrf jrfVar = new jrf();
            this.f = jrfVar;
            ((ype) jrf.a.l().ai((char) 2699)).u("Registering as notification listener");
            lxr.l().e(jrfVar);
        }
    }

    @Override // defpackage.lhg
    public final void d() {
        if (f()) {
            ((ype) a.l().ai((char) 2692)).u("Stopping");
            i(false);
            this.c.clear();
            this.d.clear();
            jrf jrfVar = this.f;
            if (jrfVar != null) {
                ((ype) jrf.a.l().ai((char) 2700)).u("Unregistering as notification listener");
                lxr.l().f(jrfVar);
                jrfVar.b.clear();
                this.f = null;
            }
        }
    }

    public final void e(ContextInsight contextInsight) {
        if (f()) {
            if (lbh.d().h()) {
                ((ype) ((ype) a.h()).ai((char) 2678)).u("Received insight after stop");
                i(false);
                return;
            }
            hnj hnjVarC = hdg.c(contextInsight);
            if (hnjVarC != null) {
                jrc jrcVarG = g(contextInsight);
                if (jrcVarG == null) {
                    ((ype) ((ype) a.h()).ai((char) 2677)).u("No insight metadata found for prototype insight");
                    return;
                }
                yph yphVar = a;
                ype ypeVar = (ype) yphVar.l().ai(2675);
                hnm hnmVar = hnjVarC.a;
                jra jraVar = jrcVarG.a;
                ypeVar.M("Prototype insight %s for %s", hnmVar, jraVar);
                if (hnjVarC instanceof hos) {
                    ((ype) yphVar.l().ai((char) 2676)).y("Empty insight for %s", jraVar);
                    long j = jrcVarG.b;
                    int i = yfq.d;
                    j(jraVar, j, yls.a);
                    return;
                }
                return;
            }
            jrc jrcVarG2 = g(contextInsight);
            if (jrcVarG2 == null) {
                ((ype) ((ype) a.h()).ai((char) 2674)).u("No insight metadata found for insight(s)");
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (contextInsight instanceof InsightCollection) {
                InsightCollection insightCollection = (InsightCollection) contextInsight;
                int size = insightCollection.getInsights().size();
                yph yphVar2 = a;
                ((ype) yphVar2.l().ai(2671)).w("InsightCollection size: %d", size);
                Iterator it = insightCollection.iterator();
                while (it.hasNext()) {
                    ContextInsight contextInsight2 = (ContextInsight) it.next();
                    if (contextInsight2 instanceof InsightCollection) {
                        ((ype) ((ype) yphVar2.h()).ai((char) 2673)).u("Skipping nested InsightCollection");
                    } else {
                        jrc jrcVarG3 = g(contextInsight2);
                        if (jrcVarG3 != null) {
                            jra jraVar2 = jrcVarG2.a;
                            jra jraVar3 = jrcVarG3.a;
                            if (!jraVar3.q(jraVar2)) {
                                ((ype) ((ype) yphVar2.h()).ai(2672)).M("Child insight key %s differs from collection key %s", jraVar3, jraVar2);
                            }
                        }
                        h(contextInsight2, true, arrayList);
                    }
                }
            } else {
                h(contextInsight, false, arrayList);
            }
            j(jrcVarG2.a, jrcVarG2.b, arrayList);
        }
    }
}
