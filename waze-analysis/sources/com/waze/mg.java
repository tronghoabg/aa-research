package com.waze;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import androidx.core.content.ContextCompat;
import com.waze.config.ConfigValues;
import com.waze.navigate.NavigationInfoNativeManager;
import com.waze.settings.SettingsNativeManager;
import com.waze.sharedui.views.WazeEditTextBase;
import com.waze.view.text.InstantAutoComplete;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class mg extends Application implements com.waze.am.i, org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    public static final lx f29780a = new lx();

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.af f29781b = kotlinx.coroutines.aj.f();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f29782c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    private final CompletableDeferred f29783d = kotlinx.coroutines.bo.j();

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.af f29784e = kotlinx.coroutines.aj.e(kotlinx.coroutines.av.b());

    public mg() {
        int i2 = com.waze.perf.c.f33035a;
        com.waze.perf.c.c();
        int i3 = com.waze.native_managers.o.f30705a;
        com.waze.an.a.a.bd.h().start();
        kotlinx.coroutines.aj.z(kotlinx.coroutines.aj.f(), null, null, new lw(null, 0), 3);
    }

    public static final Context a() {
        return f29780a.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x04ef, code lost:
    
        if (kotlinx.coroutines.b.ai.i(r0, r4, r2) != r3) goto L140;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03c7 A[PHI: r12
  0x03c7: PHI (r12v29 int) = (r12v23 int), (r12v34 int) binds: [B:113:0x03c5, B:17:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0301  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object c(com.waze.mg r24, h.c.e r25) {
        /*
            Method dump skipped, instructions count: 1284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.mg.c(com.waze.mg, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00af, code lost:
    
        if (r8.c(r0) != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(h.c.e r8) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.mg.f(h.c.e):java.lang.Object");
    }

    private final void g() {
        com.waze.sharedui.a.f.a((getResources().getConfiguration().uiMode & 32) != 0);
    }

    @Override // com.waze.am.i
    public final Object d(h.c.e eVar) {
        if (this.f29782c.getAndSet(true)) {
            com.waze.shared_infra.i.h.b("WazeInitializer", "initialization already started");
        } else {
            kotlinx.coroutines.aj.z(this.f29781b, null, null, new ly(this, (h.c.e) null, 0), 3);
        }
        Object objC = this.f29783d.c(eVar);
        return objC == h.c.a.a.f48038a ? objC : h.ab.f48028a;
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        h.g.b.x.f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application
    public void onCreate() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        boolean z;
        org.a.d.k.b bVarC2;
        h.g.b.m mVar2;
        org.a.d.k.b bVarC3;
        h.g.b.m mVar3;
        org.a.d.k.b bVarC4;
        h.g.b.m mVar4;
        org.a.d.k.b bVarC5;
        h.g.b.m mVar5;
        org.a.d.k.b bVarC6;
        h.g.b.m mVar6;
        org.a.d.k.b bVarC7;
        h.g.b.m mVar7;
        org.a.d.k.b bVarC8;
        h.g.b.m mVar8;
        org.a.d.a.a aVar;
        Object objA;
        org.a.d.k.b bVarC9;
        h.g.b.m mVar9;
        org.a.d.k.b bVarC10;
        h.g.b.m mVar10;
        Object objA2;
        org.a.d.k.b bVarC11;
        h.g.b.m mVar11;
        org.a.d.k.b bVarC12;
        h.g.b.m mVar12;
        org.a.d.k.b bVarC13;
        h.g.b.m mVar13;
        org.a.d.k.b bVarC14;
        h.g.b.m mVar14;
        org.a.d.k.b bVarC15;
        h.g.b.m mVar15;
        org.a.d.k.b bVarC16;
        h.g.b.m mVar16;
        org.a.d.k.b bVarC17;
        h.g.b.m mVar17;
        org.a.d.k.b bVarC18;
        h.g.b.m mVar18;
        org.a.d.k.b bVarC19;
        h.g.b.m mVar19;
        org.a.d.k.b bVarC20;
        h.g.b.m mVar20;
        org.a.d.k.b bVarC21;
        h.g.b.m mVar21;
        org.a.d.k.b bVarC22;
        h.g.b.m mVar22;
        org.a.d.k.b bVarC23;
        h.g.b.m mVar23;
        org.a.d.k.b bVarC24;
        h.g.b.m mVar24;
        org.a.d.k.b bVarC25;
        h.g.b.m mVar25;
        Object objA3;
        com.waze.perf.c.a(com.waze.perf.b.f33023a);
        super.onCreate();
        Thread.setDefaultUncaughtExceptionHandler(new be());
        com.b.b.a.u.e(getApplicationContext());
        Context applicationContext = getApplicationContext();
        h.g.b.x.e(applicationContext, "getApplicationContext(...)");
        ActivityManager activityManager = (ActivityManager) ContextCompat.getSystemService(applicationContext, ActivityManager.class);
        if (activityManager != null && !activityManager.getAppTasks().isEmpty()) {
            List<ActivityManager.AppTask> appTasks = activityManager.getAppTasks();
            h.g.b.x.e(appTasks, "getAppTasks(...)");
            ActivityManager.RecentTaskInfo taskInfo = ((ActivityManager.AppTask) h.a.i.P(appTasks)).getTaskInfo();
            if (taskInfo != null) {
                com.waze.shared_infra.i.d dVar = com.waze.shared_infra.i.d.f37887b;
                Integer numValueOf = Integer.valueOf(taskInfo.numActivities);
                Objects.toString(numValueOf);
                com.waze.shared_infra.i.h.m(dVar, "", "Number of active activities: ".concat(numValueOf.toString()));
                if (taskInfo.numActivities > 1) {
                    com.waze.shared_infra.i.h.m(com.waze.shared_infra.i.d.f37888c, "", "WazeApplication has been respawned, restarting...");
                    Intent intent = new Intent(f29780a.a(), (Class<?>) FreeMapAppActivity.class);
                    intent.setFlags(268468224);
                    getApplicationContext().startActivity(intent);
                    System.exit(0);
                    throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
                }
            }
        }
        mg mgVar = this;
        boolean z2 = mgVar instanceof org.a.d.a.b;
        if (z2) {
            bVarC = ((org.a.d.a.b) mgVar).l();
            int i2 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(bd.class);
        } else {
            bVarC = mgVar.getKoin().a().c();
            int i3 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(bd.class);
        }
        if (((bd) bVarC.a(mVar, null, null)).a()) {
            if (z2) {
                objA3 = ((org.a.d.a.b) mgVar).l().a(new h.g.b.m(com.waze.stats.ax.class), null, null);
                z = true;
            } else {
                objA3 = mgVar.getKoin().a().c().a(new h.g.b.m(com.waze.stats.ax.class), null, null);
                z = false;
            }
            l.a.ez ezVarNewBuilder = l.a.fb.newBuilder();
            ezVarNewBuilder.d(l.a.ff.newBuilder());
            l.a.fb fbVarBuild = ezVarNewBuilder.build();
            h.g.b.x.e(fbVarBuild, "build(...)");
            com.waze.sharedui.utils.o.h((com.waze.stats.ax) objA3, fbVarBuild);
        } else {
            z = z2;
        }
        if (z) {
            bVarC2 = ((org.a.d.a.b) mgVar).l();
            mVar2 = new h.g.b.m(ao.class);
        } else {
            bVarC2 = mgVar.getKoin().a().c();
            mVar2 = new h.g.b.m(ao.class);
        }
        ao aoVar = (ao) bVarC2.a(mVar2, null, null);
        mg mgVar2 = this;
        aoVar.c(mgVar2);
        if (z) {
            bVarC3 = ((org.a.d.a.b) mgVar).l();
            mVar3 = new h.g.b.m(com.waze.sdk.bd.class);
        } else {
            bVarC3 = mgVar.getKoin().a().c();
            mVar3 = new h.g.b.m(com.waze.sdk.bd.class);
        }
        ((com.waze.sdk.bd) bVarC3.a(mVar3, null, null)).x();
        kotlinx.coroutines.b.k kVarK = ConfigValues.CONFIG_VALUE_GENERAL_LOG_LEVEL.k();
        h.g.b.x.e(kVarK, "getFlow(...)");
        kotlinx.coroutines.b.k kVarK2 = kotlinx.coroutines.b.ai.K(kVarK, new mb(null, 0));
        kotlinx.coroutines.af afVar = this.f29781b;
        kotlinx.coroutines.b.ai.m(kVarK2, afVar);
        if (com.b.b.a.u.d().a() == m.f25473a) {
            com.waze.bj.c.g(mgVar2);
        }
        kotlinx.coroutines.aj.z(afVar, null, null, new lz(this, (h.c.e) null, 0), 3);
        t.k(mgVar2);
        com.waze.ui.z.as.j(getResources());
        NativeManager.runOnNativeManagerReady(new com.waze.navigate.ay(5));
        int i4 = com.waze.sharedui.c.b.f38844a;
        com.waze.sharedui.c.b.c((com.waze.shared_infra.f.b) org.a.b.b.d.e().a().c().a(new h.g.b.m(com.waze.bh.a.a.class), null, null));
        com.waze.sharedui.c.b.c(new com.waze.settings.b.c((com.waze.settings.e.a.e) org.a.b.b.d.e().a().c().a(new h.g.b.m(com.waze.settings.e.a.e.class), null, null), (SettingsNativeManager) org.a.b.b.d.e().a().c().a(new h.g.b.m(SettingsNativeManager.class), null, null), null));
        com.waze.sharedui.c.b.c((com.waze.shared_infra.f.b) org.a.b.b.d.e().a().c().a(new h.g.b.m(com.waze.y.g.class), null, null));
        com.waze.sharedui.c.b.c((com.waze.shared_infra.f.b) org.a.b.b.d.e().a().c().a(new h.g.b.m(com.waze.inbox.a.class), null, null));
        com.waze.sharedui.c.b.c((com.waze.shared_infra.f.b) org.a.b.b.d.e().a().c().a(new h.g.b.m(com.waze.sound.br.class), null, null));
        com.waze.sharedui.c.b.c((com.waze.shared_infra.f.b) org.a.b.b.d.e().a().c().a(new h.g.b.m(com.waze.sound.ii.class), null, null));
        com.waze.sharedui.c.b.c((com.waze.shared_infra.f.b) org.a.b.b.d.e().a().c().a(new h.g.b.m(com.waze.cg.a.class), null, null));
        if (z) {
            bVarC4 = ((org.a.d.a.b) mgVar).l();
            mVar4 = new h.g.b.m(com.waze.sharedrive.d.as.class);
        } else {
            bVarC4 = mgVar.getKoin().a().c();
            mVar4 = new h.g.b.m(com.waze.sharedrive.d.as.class);
        }
        com.waze.sound.br brVarA = ((com.waze.sharedrive.d.as) bVarC4.a(mVar4, null, null)).a();
        if (brVarA != null) {
            com.waze.sharedui.c.b.c(brVarA);
        }
        if (z) {
            bVarC5 = ((org.a.d.a.b) mgVar).l();
            mVar5 = new h.g.b.m(com.waze.crash.c.class);
        } else {
            bVarC5 = mgVar.getKoin().a().c();
            mVar5 = new h.g.b.m(com.waze.crash.c.class);
        }
        ((com.waze.crash.c) bVarC5.a(mVar5, null, null)).f();
        com.waze.utils.i.a().b(getApplicationContext());
        com.waze.ui.x.u.m(getApplicationContext());
        kotlinx.coroutines.aj.z(afVar, null, null, new lw((h.c.e) null, 2, (char[]) null), 3);
        if (z) {
            bVarC6 = ((org.a.d.a.b) mgVar).l();
            mVar6 = new h.g.b.m(bn.class);
        } else {
            bVarC6 = mgVar.getKoin().a().c();
            mVar6 = new h.g.b.m(bn.class);
        }
        ((bn) bVarC6.a(mVar6, null, null)).a();
        com.waze.view.popups.b.b bVar = new com.waze.view.popups.b.b();
        WazeEditTextBase.k(bVar);
        InstantAutoComplete.d(bVar);
        registerActivityLifecycleCallbacks(lm.d());
        if (z) {
            bVarC7 = ((org.a.d.a.b) mgVar).l();
            mVar7 = new h.g.b.m(com.waze.app_nav.hub.a.e.class);
        } else {
            bVarC7 = mgVar.getKoin().a().c();
            mVar7 = new h.g.b.m(com.waze.app_nav.hub.a.e.class);
        }
        com.waze.app_nav.hub.a.e eVar = (com.waze.app_nav.hub.a.e) bVarC7.a(mVar7, null, null);
        NavigationInfoNativeManager navigationInfoNativeManager = NavigationInfoNativeManager.getInstance();
        h.g.b.x.e(navigationInfoNativeManager, "getInstance(...)");
        kotlinx.coroutines.af afVarF = kotlinx.coroutines.aj.f();
        boolean z3 = false;
        h.g.b.x.f(navigationInfoNativeManager, "<this>");
        h.g.b.x.f(afVarF, "scope");
        com.waze.navigate.er erVar = new com.waze.navigate.er(kotlinx.coroutines.b.ai.y(com.waze.navigate.et.t(navigationInfoNativeManager)), 1);
        int i5 = kotlinx.coroutines.b.bz.f51630a;
        eVar.b(kotlinx.coroutines.b.ai.aa(erVar, afVarF, kotlinx.coroutines.b.by.b()));
        com.waze.uid.d.p pVar = com.waze.uid.d.q.f44463a;
        com.waze.sharedui.c.b.c(new com.waze.uid.state_impl.email.y(pVar.a().f44467e, com.waze.shared_infra.o.b.a()));
        com.waze.sharedui.c.b.c(new com.waze.y.g(pVar.a().f44467e, 1));
        if (z) {
            bVarC8 = ((org.a.d.a.b) mgVar).l();
            mVar8 = new h.g.b.m(ar.class);
        } else {
            bVarC8 = mgVar.getKoin().a().c();
            mVar8 = new h.g.b.m(ar.class);
        }
        bVarC8.a(mVar8, null, null);
        com.waze.sharedui.profile.b bVarA = com.waze.sharedui.profile.b.a();
        h.g.b.x.e(bVarA, "getInstance(...)");
        org.a.d.a.a aVar2 = com.waze.app_nav.hub.c.e.f15298c;
        com.waze.app_nav.hub.c.f fVar = com.waze.app_nav.hub.c.f.f15299a;
        h.g.b.x.f(fVar, "priority");
        org.a.d.a.a aVar3 = aVar2;
        org.a.d.i.c cVar = new org.a.d.i.c(new h.g.b.m(com.waze.app_nav.hub.service.a.class));
        boolean z4 = aVar3 instanceof org.a.d.a.b;
        if (z4) {
            aVar = mgVar;
            objA = ((org.a.d.a.b) aVar3).l().a(new h.g.b.m(com.waze.app_nav.hub.c.e.class), cVar, null);
        } else {
            aVar = mgVar;
            objA = aVar3.getKoin().a().c().a(new h.g.b.m(com.waze.app_nav.hub.c.e.class), cVar, null);
        }
        com.waze.app_nav.hub.c.e eVarA = com.waze.app_nav.hub.c.d.a((com.waze.app_nav.hub.c.e) objA, fVar);
        com.waze.b.y yVar = (com.waze.b.y) org.a.b.b.d.e().a().c().a(new h.g.b.m(com.waze.b.y.class), null, null);
        com.waze.b.o oVar = (com.waze.b.o) org.a.b.b.d.e().a().c().a(new h.g.b.m(com.waze.b.o.class), null, null);
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d(com.waze.a.a.e.class.getCanonicalName());
        h.g.b.x.e(eVarD, "create(...)");
        com.waze.a.a.e eVar2 = new com.waze.a.a.e(bVarA, eVarA, yVar, oVar, eVarD);
        ix ixVar = new ix();
        com.waze.app_nav.hub.c.f fVar2 = com.waze.app_nav.hub.c.f.f15300b;
        h.g.b.x.f(fVar2, "priority");
        org.a.d.i.c cVar2 = new org.a.d.i.c(new h.g.b.m(com.waze.app_nav.hub.b.k.class));
        if (z4) {
            bVarC9 = ((org.a.d.a.b) aVar3).l();
            mVar9 = new h.g.b.m(com.waze.app_nav.hub.c.e.class);
        } else {
            bVarC9 = aVar3.getKoin().a().c();
            mVar9 = new h.g.b.m(com.waze.app_nav.hub.c.e.class);
        }
        com.waze.app_nav.hub.c.e eVarA2 = com.waze.app_nav.hub.c.d.a((com.waze.app_nav.hub.c.e) bVarC9.a(mVar9, cVar2, null), fVar2);
        ConfigManager configManager = (ConfigManager) org.a.b.b.d.e().a().c().a(new h.g.b.m(ConfigManager.class), null, null);
        com.waze.b.u uVar = (com.waze.b.u) org.a.b.b.d.e().a().c().a(new h.g.b.m(com.waze.b.u.class), null, null);
        com.waze.shared_infra.o.a aVar4 = (com.waze.shared_infra.o.a) org.a.b.b.d.e().a().c().a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d(com.waze.uid.d.class.getCanonicalName());
        h.g.b.x.e(eVarD2, "create(...)");
        com.waze.uid.d dVar2 = new com.waze.uid.d(eVarA2, configManager, uVar, aVar4, eVarD2);
        com.waze.shared_infra.a.c[] cVarArr = new com.waze.shared_infra.a.c[14];
        com.waze.sharedui.profile.b bVarA2 = com.waze.sharedui.profile.b.a();
        h.g.b.x.e(bVarA2, "getInstance(...)");
        com.waze.shared_infra.o.a aVar5 = (com.waze.shared_infra.o.a) org.a.b.b.d.e().a().c().a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
        com.waze.b.o oVar2 = (com.waze.b.o) org.a.b.b.d.e().a().c().a(new h.g.b.m(com.waze.b.o.class), null, null);
        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d(com.waze.cb.s.class.getCanonicalName());
        h.g.b.x.e(eVarD3, "create(...)");
        com.waze.cb.j jVar = (com.waze.cb.j) org.a.b.b.d.e().a().c().a(new h.g.b.m(com.waze.cb.j.class), null, null);
        com.waze.uid.b.z zVar = com.waze.uid.b.ab.f44136a;
        cVarArr[0] = new com.waze.cb.s(bVarA2, aVar5, oVar2, eVarD3, jVar, zVar.a(), new android.support.v4.a.a.c(8), new android.support.v4.a.a.c(9));
        com.waze.sharedui.profile.b bVarA3 = com.waze.sharedui.profile.b.a();
        h.g.b.x.e(bVarA3, "getInstance(...)");
        com.waze.b.u uVar2 = (com.waze.b.u) org.a.b.b.d.e().a().c().a(new h.g.b.m(com.waze.b.u.class), null, null);
        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d(com.waze.uid.al.class.getCanonicalName());
        h.g.b.x.e(eVarD4, "create(...)");
        cVarArr[1] = new com.waze.uid.al(zVar, bVarA3, uVar2, eVarD4, ixVar);
        List listI = h.a.i.i(eVar2, dVar2);
        if (z2) {
            bVarC10 = ((org.a.d.a.b) aVar).l();
            mVar10 = new h.g.b.m(com.waze.sharedui.h.l.class);
        } else {
            bVarC10 = aVar.getKoin().a().c();
            mVar10 = new h.g.b.m(com.waze.sharedui.h.l.class);
        }
        kotlinx.coroutines.b.k kVarB = com.waze.uid.b.z.b(com.waze.shared_infra.s.h.a(((com.waze.sharedui.h.l) bVarC10.a(mVar10, null, null)).b()));
        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("PostUidLogin");
        h.g.b.x.e(eVarD5, "create(...)");
        cVarArr[2] = new com.waze.shared_infra.a.f(listI, kVarB, eVarD5);
        cVarArr[3] = new com.waze.g.j(new com.airbnb.lottie.b.q(this, 7));
        org.a.d.i.a aVarA = com.waze.network.r.a();
        if (z2) {
            objA2 = ((org.a.d.a.b) aVar).l().a(new h.g.b.m(com.waze.shared_infra.a.c.class), aVarA, null);
            z3 = true;
        } else {
            objA2 = aVar.getKoin().a().c().a(new h.g.b.m(com.waze.shared_infra.a.c.class), aVarA, null);
        }
        cVarArr[4] = objA2;
        org.a.d.i.a aVarC = com.waze.install.g.c();
        if (z3) {
            bVarC11 = ((org.a.d.a.b) aVar).l();
            mVar11 = new h.g.b.m(com.waze.shared_infra.a.c.class);
        } else {
            bVarC11 = aVar.getKoin().a().c();
            mVar11 = new h.g.b.m(com.waze.shared_infra.a.c.class);
        }
        cVarArr[5] = bVarC11.a(mVar11, aVarC, null);
        org.a.d.i.a aVarC2 = com.waze.network.r.c();
        if (z3) {
            bVarC12 = ((org.a.d.a.b) aVar).l();
            mVar12 = new h.g.b.m(com.waze.shared_infra.a.c.class);
        } else {
            bVarC12 = aVar.getKoin().a().c();
            mVar12 = new h.g.b.m(com.waze.shared_infra.a.c.class);
        }
        cVarArr[6] = bVarC12.a(mVar12, aVarC2, null);
        org.a.d.i.a aVarB = com.waze.network.r.b();
        if (z3) {
            bVarC13 = ((org.a.d.a.b) aVar).l();
            mVar13 = new h.g.b.m(com.waze.shared_infra.a.c.class);
        } else {
            bVarC13 = aVar.getKoin().a().c();
            mVar13 = new h.g.b.m(com.waze.shared_infra.a.c.class);
        }
        cVarArr[7] = bVarC13.a(mVar13, aVarB, null);
        if (z3) {
            bVarC14 = ((org.a.d.a.b) aVar).l();
            mVar14 = new h.g.b.m(com.waze.d.h.class);
        } else {
            bVarC14 = aVar.getKoin().a().c();
            mVar14 = new h.g.b.m(com.waze.d.h.class);
        }
        cVarArr[8] = bVarC14.a(mVar14, null, null);
        com.waze.aa.e eVarA3 = com.waze.perf.t.a();
        if (z3) {
            bVarC15 = ((org.a.d.a.b) aVar).l();
            mVar15 = new h.g.b.m(com.waze.shared_infra.a.c.class);
        } else {
            bVarC15 = aVar.getKoin().a().c();
            mVar15 = new h.g.b.m(com.waze.shared_infra.a.c.class);
        }
        cVarArr[9] = bVarC15.a(mVar15, eVarA3, null);
        if (z3) {
            bVarC16 = ((org.a.d.a.b) aVar).l();
            mVar16 = new h.g.b.m(com.waze.network.ar.class);
        } else {
            bVarC16 = aVar.getKoin().a().c();
            mVar16 = new h.g.b.m(com.waze.network.ar.class);
        }
        cVarArr[10] = bVarC16.a(mVar16, null, null);
        if (z3) {
            bVarC17 = ((org.a.d.a.b) aVar).l();
            mVar17 = new h.g.b.m(com.waze.profile.l.class);
        } else {
            bVarC17 = aVar.getKoin().a().c();
            mVar17 = new h.g.b.m(com.waze.profile.l.class);
        }
        cVarArr[11] = bVarC17.a(mVar17, null, null);
        if (z3) {
            bVarC18 = ((org.a.d.a.b) aVar).l();
            mVar18 = new h.g.b.m(com.waze.location.a.w.class);
        } else {
            bVarC18 = aVar.getKoin().a().c();
            mVar18 = new h.g.b.m(com.waze.location.a.w.class);
        }
        cVarArr[12] = bVarC18.a(mVar18, null, null);
        if (z3) {
            bVarC19 = ((org.a.d.a.b) aVar).l();
            mVar19 = new h.g.b.m(com.waze.network.b.ag.class);
        } else {
            bVarC19 = aVar.getKoin().a().c();
            mVar19 = new h.g.b.m(com.waze.network.b.ag.class);
        }
        cVarArr[13] = bVarC19.a(mVar19, null, null);
        List listI2 = h.a.i.i(cVarArr);
        if (z3) {
            bVarC20 = ((org.a.d.a.b) aVar).l();
            mVar20 = new h.g.b.m(com.waze.shared_infra.a.k.class);
        } else {
            bVarC20 = aVar.getKoin().a().c();
            mVar20 = new h.g.b.m(com.waze.shared_infra.a.k.class);
        }
        com.waze.shared_infra.a.k kVar = (com.waze.shared_infra.a.k) bVarC20.a(mVar20, null, null);
        Iterator it = listI2.iterator();
        while (it.hasNext()) {
            kVar.f((com.waze.shared_infra.a.c) it.next());
        }
        com.waze.sharedui.h.l(new nc());
        int i6 = com.waze.sharedui.b.d.f38836a;
        if (z) {
            bVarC21 = ((org.a.d.a.b) aVar).l();
            mVar21 = new h.g.b.m(com.waze.sharedui.b.d.class);
        } else {
            bVarC21 = aVar.getKoin().a().c();
            mVar21 = new h.g.b.m(com.waze.sharedui.b.d.class);
        }
        com.waze.sharedui.b.c.b((com.waze.sharedui.b.d) bVarC21.a(mVar21, null, null));
        com.waze.nightmode.t.f32494a.e(mgVar2);
        if (z) {
            bVarC22 = ((org.a.d.a.b) aVar).l();
            mVar22 = new h.g.b.m(com.waze.g.d.class);
        } else {
            bVarC22 = aVar.getKoin().a().c();
            mVar22 = new h.g.b.m(com.waze.g.d.class);
        }
        com.waze.g.d dVar3 = (com.waze.g.d) bVarC22.a(mVar22, null, null);
        if (z) {
            bVarC23 = ((org.a.d.a.b) aVar).l();
            mVar23 = new h.g.b.m(com.waze.network.f.ag.class);
        } else {
            bVarC23 = aVar.getKoin().a().c();
            mVar23 = new h.g.b.m(com.waze.network.f.ag.class);
        }
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(((com.waze.network.f.ag) bVarC23.a(mVar23, null, null)).d(), new eh(dVar3, (h.c.e) null, 3)), afVar);
        if (z) {
            bVarC24 = ((org.a.d.a.b) aVar).l();
            mVar24 = new h.g.b.m(com.waze.shared_infra.r.y.class);
        } else {
            bVarC24 = aVar.getKoin().a().c();
            mVar24 = new h.g.b.m(com.waze.shared_infra.r.y.class);
        }
        com.waze.shared_infra.r.y yVar2 = (com.waze.shared_infra.r.y) bVarC24.a(mVar24, null, null);
        if (z) {
            bVarC25 = ((org.a.d.a.b) aVar).l();
            mVar25 = new h.g.b.m(com.waze.network.f.ag.class);
        } else {
            bVarC25 = aVar.getKoin().a().c();
            mVar25 = new h.g.b.m(com.waze.network.f.ag.class);
        }
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(kotlinx.coroutines.b.ai.y(new dn(((com.waze.network.f.ag) bVarC25.a(mVar25, null, null)).d(), 8)), new ej(yVar2, (h.c.e) null, 2)), afVar);
        com.waze.perf.c.a(com.waze.perf.b.f33024b);
        g();
    }

    @Override // android.app.Application
    public final void onTerminate() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        super.onTerminate();
        mg mgVar = this;
        if (mgVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) mgVar).l();
            int i2 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(ao.class);
        } else {
            bVarC = mgVar.getKoin().a().c();
            int i3 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(ao.class);
        }
        ((ao) bVarC.a(mVar, null, null)).d();
    }
}
