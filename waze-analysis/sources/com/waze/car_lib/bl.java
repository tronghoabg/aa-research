package com.waze.car_lib;

import android.content.Intent;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.util.Size;
import androidx.car.app.CarContext;
import androidx.car.app.Screen;
import androidx.car.app.Session;
import androidx.car.app.notification.CarNotificationManager;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.waze.ConfigManager;
import com.waze.NativeManager;
import com.waze.config.ConfigValues;
import com.waze.cq;
import com.waze.lm;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bl extends Session implements org.a.d.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final org.a.d.k.b f19192a;

    /* renamed from: b, reason: collision with root package name */
    private final h.f f19193b;

    /* renamed from: c, reason: collision with root package name */
    private final h.f f19194c;

    /* renamed from: d, reason: collision with root package name */
    private final h.f f19195d;

    /* renamed from: e, reason: collision with root package name */
    private final h.f f19196e;

    /* renamed from: f, reason: collision with root package name */
    private final h.f f19197f;

    /* renamed from: g, reason: collision with root package name */
    private final h.f f19198g;

    /* renamed from: h, reason: collision with root package name */
    private final h.f f19199h;

    public bl() {
        int i2 = z.f22053a;
        h.g.b.x.f(this, "<this>");
        bl blVar = this;
        org.a.d.k.b bVarB = org.a.b.b.d.e().b(blVar);
        getLifecycle().addObserver(new y(bVarB));
        this.f19192a = bVarB;
        h.h hVar = h.h.f48130a;
        this.f19193b = h.g.b(hVar, new au(blVar, 3, null));
        this.f19194c = h.g.b(hVar, new au(blVar, 4, null));
        this.f19195d = h.g.b(hVar, new au(blVar, 5, null));
        this.f19196e = h.g.b(hVar, new au(blVar, 6, null));
        this.f19197f = h.g.b(hVar, new au(blVar, 7, null));
        this.f19198g = h.g.b(hVar, new au(blVar, 8, null));
        this.f19199h = h.g.b(hVar, new au(blVar, 9, null));
    }

    static final void b(bl blVar) {
        a aVar = (a) blVar.f19198g.getValue();
        CarContext carContext = blVar.getCarContext();
        h.g.b.x.e(carContext, "getCarContext(...)");
        com.waze.shared_infra.i.h.j("Car Session: (aaHost:" + aVar.a(carContext) + ", carApiLevel:" + blVar.getCarContext().getCarAppApiLevel() + ")");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.waze.ifs.ui.z c() {
        return (com.waze.ifs.ui.z) this.f19194c.getValue();
    }

    private final void d(Intent intent) {
        ((cq) this.f19197f.getValue()).a(intent, new bj(this));
    }

    private final void e() {
        com.waze.sharedui.a.c.a(getCarContext().isDarkMode());
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }

    @Override // org.a.d.a.b
    public final org.a.d.k.b l() {
        return this.f19192a;
    }

    @Override // androidx.car.app.Session
    public final void onCarConfigurationChanged(Configuration configuration) {
        h.g.b.x.f(configuration, "newConfiguration");
        e();
    }

    @Override // androidx.car.app.Session
    public final Screen onCreateScreen(Intent intent) {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        Object objA;
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
        org.a.d.k.b bVarC9;
        h.g.b.m mVar9;
        org.a.d.k.b bVarC10;
        h.g.b.m mVar10;
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
        h.g.b.x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
        NativeManager.runOnNativeManagerReady(new be(this, 3));
        ((lm) this.f19193b.getValue()).j(getLifecycle());
        DisplayMetrics displayMetrics = getCarContext().getResources().getDisplayMetrics();
        Size size = new Size(displayMetrics.widthPixels, displayMetrics.heightPixels);
        bl blVar = this;
        boolean z2 = blVar instanceof org.a.d.a.b;
        if (z2) {
            bVarC = blVar.l();
            int i2 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(com.waze.ao.class);
        } else {
            bVarC = blVar.getKoin().a().c();
            int i3 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(com.waze.ao.class);
        }
        ((com.waze.ao) bVarC.a(mVar, null, null)).f(((com.waze.z) this.f19196e.getValue()) == com.waze.z.f45554b ? new com.waze.ak(size) : new com.waze.am(size));
        e();
        if (z2) {
            objA = blVar.l().a(new h.g.b.m(com.waze.car_lib.i.a.b.class), null, null);
            z = true;
        } else {
            objA = blVar.getKoin().a().c().a(new h.g.b.m(com.waze.car_lib.i.a.b.class), null, null);
            z = false;
        }
        CarContext carContext = getCarContext();
        h.g.b.x.e(carContext, "getCarContext(...)");
        Lifecycle lifecycle = getLifecycle();
        h.g.b.x.e(lifecycle, "<get-lifecycle>(...)");
        com.waze.car_lib.i.a.a aVarA = ((com.waze.car_lib.i.a.b) objA).a(carContext, lifecycle);
        if (z) {
            bVarC2 = blVar.l();
            mVar2 = new h.g.b.m(com.waze.car_lib.i.f.class);
        } else {
            bVarC2 = blVar.getKoin().a().c();
            mVar2 = new h.g.b.m(com.waze.car_lib.i.f.class);
        }
        com.waze.car_lib.i.f fVar = (com.waze.car_lib.i.f) bVarC2.a(mVar2, null, null);
        bd bdVar = (bd) this.f19199h.getValue();
        Lifecycle lifecycle2 = getLifecycle();
        h.g.b.x.e(lifecycle2, "<get-lifecycle>(...)");
        bl blVar2 = this;
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(blVar2);
        CarContext carContext2 = getCarContext();
        h.g.b.x.e(carContext2, "getCarContext(...)");
        fVar.b(bdVar, lifecycle2, aVarA, lifecycleScope, carContext2);
        if (z) {
            bVarC3 = blVar.l();
            mVar3 = new h.g.b.m(com.waze.car_lib.j.r.class);
        } else {
            bVarC3 = blVar.getKoin().a().c();
            mVar3 = new h.g.b.m(com.waze.car_lib.j.r.class);
        }
        com.waze.car_lib.j.r rVar = (com.waze.car_lib.j.r) bVarC3.a(mVar3, null, null);
        LifecycleCoroutineScope lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(blVar2);
        Lifecycle lifecycle3 = getLifecycle();
        h.g.b.x.e(lifecycle3, "<get-lifecycle>(...)");
        CarContext carContext3 = getCarContext();
        h.g.b.x.e(carContext3, "getCarContext(...)");
        rVar.h(lifecycleScope2, lifecycle3, carContext3);
        if (z) {
            bVarC4 = blVar.l();
            mVar4 = new h.g.b.m(com.waze.car_lib.j.g.class);
        } else {
            bVarC4 = blVar.getKoin().a().c();
            mVar4 = new h.g.b.m(com.waze.car_lib.j.g.class);
        }
        com.waze.car_lib.j.g gVar = (com.waze.car_lib.j.g) bVarC4.a(mVar4, null, null);
        LifecycleCoroutineScope lifecycleScope3 = LifecycleOwnerKt.getLifecycleScope(blVar2);
        CarContext carContext4 = getCarContext();
        h.g.b.x.e(carContext4, "getCarContext(...)");
        CarNotificationManager carNotificationManagerFrom = CarNotificationManager.from(getCarContext());
        h.g.b.x.e(carNotificationManagerFrom, "from(...)");
        gVar.e(lifecycleScope3, carContext4, carNotificationManagerFrom);
        if (z) {
            bVarC5 = blVar.l();
            mVar5 = new h.g.b.m(com.waze.car_lib.b.ap.class);
        } else {
            bVarC5 = blVar.getKoin().a().c();
            mVar5 = new h.g.b.m(com.waze.car_lib.b.ap.class);
        }
        com.waze.car_lib.b.ap apVar = (com.waze.car_lib.b.ap) bVarC5.a(mVar5, null, null);
        CarContext carContext5 = getCarContext();
        h.g.b.x.e(carContext5, "getCarContext(...)");
        apVar.L(carContext5, LifecycleOwnerKt.getLifecycleScope(blVar2));
        if (z) {
            bVarC6 = blVar.l();
            mVar6 = new h.g.b.m(com.waze.car_lib.q.g.class);
        } else {
            bVarC6 = blVar.getKoin().a().c();
            mVar6 = new h.g.b.m(com.waze.car_lib.q.g.class);
        }
        com.waze.car_lib.q.g gVar2 = (com.waze.car_lib.q.g) bVarC6.a(mVar6, null, null);
        CarContext carContext6 = getCarContext();
        h.g.b.x.e(carContext6, "getCarContext(...)");
        gVar2.i(carContext6);
        com.waze.g.g gVar3 = new com.waze.g.g(this, 1);
        getLifecycle().addObserver(new bk(this, gVar3, 0));
        c().b(gVar3);
        if (z) {
            bVarC7 = blVar.l();
            mVar7 = new h.g.b.m(com.waze.car_lib.b.h.class);
        } else {
            bVarC7 = blVar.getKoin().a().c();
            mVar7 = new h.g.b.m(com.waze.car_lib.b.h.class);
        }
        CarNotificationManager carNotificationManagerFrom2 = CarNotificationManager.from(getCarContext());
        h.g.b.x.e(carNotificationManagerFrom2, "from(...)");
        h.g.b.x.f(carNotificationManagerFrom2, "notificationManager");
        com.waze.car_lib.m.c.d(carNotificationManagerFrom2, "Waze Alerters", 4);
        if (z) {
            bVarC8 = blVar.l();
            mVar8 = new h.g.b.m(com.waze.car_lib.b.as.class);
        } else {
            bVarC8 = blVar.getKoin().a().c();
            mVar8 = new h.g.b.m(com.waze.car_lib.b.as.class);
        }
        com.waze.car_lib.b.as asVar = (com.waze.car_lib.b.as) bVarC8.a(mVar8, null, null);
        CarContext carContext7 = getCarContext();
        h.g.b.x.e(carContext7, "getCarContext(...)");
        Lifecycle lifecycle4 = getLifecycle();
        h.g.b.x.e(lifecycle4, "<get-lifecycle>(...)");
        asVar.d(carContext7, lifecycle4);
        if (z) {
            bVarC9 = blVar.l();
            mVar9 = new h.g.b.m(com.waze.car_lib.h.b.class);
        } else {
            bVarC9 = blVar.getKoin().a().c();
            mVar9 = new h.g.b.m(com.waze.car_lib.h.b.class);
        }
        com.waze.car_lib.h.b bVar = (com.waze.car_lib.h.b) bVarC9.a(mVar9, null, null);
        CarContext carContext8 = getCarContext();
        h.g.b.x.e(carContext8, "getCarContext(...)");
        bVar.a(carContext8);
        if (z) {
            bVarC10 = blVar.l();
            mVar10 = new h.g.b.m(com.waze.car_lib.h.a.class);
        } else {
            bVarC10 = blVar.getKoin().a().c();
            mVar10 = new h.g.b.m(com.waze.car_lib.h.a.class);
        }
        com.waze.car_lib.h.a aVar = (com.waze.car_lib.h.a) bVarC10.a(mVar10, null, null);
        CarContext carContext9 = getCarContext();
        h.g.b.x.e(carContext9, "getCarContext(...)");
        aVar.a(carContext9);
        if (z) {
            bVarC11 = blVar.l();
            mVar11 = new h.g.b.m(com.waze.car_lib.i.b.u.class);
        } else {
            bVarC11 = blVar.getKoin().a().c();
            mVar11 = new h.g.b.m(com.waze.car_lib.i.b.u.class);
        }
        com.waze.car_lib.i.b.u uVar = (com.waze.car_lib.i.b.u) bVarC11.a(mVar11, null, null);
        h.g.b.x.e(getCarContext(), "getCarContext(...)");
        uVar.b(!com.waze.car_lib.r.bq.j(r11));
        if (((ConfigManager) this.f19195d.getValue()).getConfigValueBool(ConfigValues.CONFIG_VALUE_CAR_LIB_TRANSPORTATION_SDK_ENABLED)) {
            if (z) {
                bVarC15 = blVar.l();
                mVar15 = new h.g.b.m(bh.class);
            } else {
                bVarC15 = blVar.getKoin().a().c();
                mVar15 = new h.g.b.m(bh.class);
            }
            bh bhVar = (bh) bVarC15.a(mVar15, null, null);
            CarContext carContext10 = getCarContext();
            h.g.b.x.e(carContext10, "getCarContext(...)");
            CarContext carContext11 = carContext10;
            Lifecycle lifecycle5 = getLifecycle();
            h.g.b.x.e(lifecycle5, "<get-lifecycle>(...)");
            h.g.b.x.f(carContext11, "context");
            h.g.b.x.f(lifecycle5, "lifecycle");
            lifecycle5.addObserver(new bg(bhVar, carContext11));
            NativeManager.runOnNativeManagerReady(new be(bhVar, 1));
            NativeManager.runOnUserLoggedIn(new be(bhVar, 0));
        }
        if (z) {
            bVarC12 = blVar.l();
            mVar12 = new h.g.b.m(com.waze.sound.u.class);
        } else {
            bVarC12 = blVar.getKoin().a().c();
            mVar12 = new h.g.b.m(com.waze.sound.u.class);
        }
        com.waze.sound.u uVar2 = (com.waze.sound.u) bVarC12.a(mVar12, null, null);
        if (z) {
            bVarC13 = blVar.l();
            mVar13 = new h.g.b.m(l.class);
        } else {
            bVarC13 = blVar.getKoin().a().c();
            mVar13 = new h.g.b.m(l.class);
        }
        CarContext carContext12 = getCarContext();
        h.g.b.x.e(carContext12, "getCarContext(...)");
        h.g.b.x.f(carContext12, "context");
        uVar2.a(new k(carContext12));
        getLifecycle().addObserver(new bk(uVar2, this, 1));
        CarContext carContext13 = getCarContext();
        h.g.b.x.e(carContext13, "getCarContext(...)");
        o oVar = new o(carContext13, LifecycleOwnerKt.getLifecycleScope(blVar2), this.f19192a);
        bm bmVar = (bm) oVar.b().a(new h.g.b.m(com.waze.car_lib.f.am.class), null, null);
        bmVar.d(oVar.a());
        bmVar.e(oVar.b());
        bmVar.E(new br());
        com.waze.car_lib.f.am amVar = (com.waze.car_lib.f.am) bmVar;
        int i4 = kotlinx.coroutines.av.f51370a;
        kotlinx.coroutines.aj.z(kotlinx.coroutines.aj.e(kotlinx.coroutines.e.ac.f51860a), null, null, new bi(amVar, (h.c.e) null, 2), 3);
        if (z) {
            bVarC14 = blVar.l();
            mVar14 = new h.g.b.m(i.class);
        } else {
            bVarC14 = blVar.getKoin().a().c();
            mVar14 = new h.g.b.m(i.class);
        }
        i iVar = (i) bVarC14.a(mVar14, null, null);
        Lifecycle lifecycle6 = getLifecycle();
        h.g.b.x.e(lifecycle6, "<get-lifecycle>(...)");
        h.g.b.x.f(lifecycle6, "lifecycle");
        lifecycle6.addObserver(new h(iVar));
        d(intent);
        return amVar.f();
    }

    @Override // androidx.car.app.Session
    public final void onNewIntent(Intent intent) {
        h.g.b.x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
        d(intent);
    }
}
