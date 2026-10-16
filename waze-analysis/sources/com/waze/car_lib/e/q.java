package com.waze.car_lib.e;

import android.content.Intent;
import androidx.car.app.CarContext;
import androidx.car.app.Screen;
import androidx.car.app.Session;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.waze.ao;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class q extends Session implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final h.f f19311a;

    /* renamed from: b, reason: collision with root package name */
    private final h.f f19312b;

    /* renamed from: c, reason: collision with root package name */
    private final h.f f19313c;

    /* renamed from: d, reason: collision with root package name */
    private final h.f f19314d;

    /* renamed from: e, reason: collision with root package name */
    private final h.f f19315e;

    /* renamed from: f, reason: collision with root package name */
    private final h.f f19316f;

    public q() {
        q qVar = this;
        h.h hVar = h.h.f48130a;
        this.f19311a = h.g.b(hVar, new e((org.a.d.a.a) qVar, 4));
        this.f19312b = h.g.b(hVar, new e((org.a.d.a.a) qVar, 5));
        this.f19313c = h.g.b(hVar, new e((org.a.d.a.a) qVar, 6));
        this.f19314d = h.g.b(hVar, new e((org.a.d.a.a) qVar, 7));
        this.f19315e = h.g.b(hVar, new e((org.a.d.a.a) qVar, 8));
        this.f19316f = h.g.b(hVar, new e((org.a.d.a.a) qVar, 9));
    }

    private final a a() {
        return (a) this.f19311a.getValue();
    }

    private final i b() {
        return (i) this.f19314d.getValue();
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }

    @Override // androidx.car.app.Session
    public final Screen onCreateScreen(Intent intent) {
        x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
        ((ao) this.f19316f.getValue()).b();
        if (!a().d()) {
            CarContext carContext = getCarContext();
            x.e(carContext, "getCarContext(...)");
            return new c(carContext);
        }
        ((r) this.f19315e.getValue()).a();
        com.waze.car_lib.i.a.b bVar = (com.waze.car_lib.i.a.b) this.f19312b.getValue();
        CarContext carContext2 = getCarContext();
        x.e(carContext2, "getCarContext(...)");
        Lifecycle lifecycle = getLifecycle();
        x.e(lifecycle, "<get-lifecycle>(...)");
        com.waze.car_lib.i.a.a aVarA = bVar.a(carContext2, lifecycle);
        com.waze.car_lib.i.f fVar = (com.waze.car_lib.i.f) this.f19313c.getValue();
        i iVarB = b();
        Lifecycle lifecycle2 = getLifecycle();
        x.e(lifecycle2, "<get-lifecycle>(...)");
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        CarContext carContext3 = getCarContext();
        x.e(carContext3, "getCarContext(...)");
        fVar.b(iVarB, lifecycle2, aVarA, lifecycleScope, carContext3);
        CarContext carContext4 = getCarContext();
        x.e(carContext4, "getCarContext(...)");
        return new p(carContext4, a(), b());
    }
}
