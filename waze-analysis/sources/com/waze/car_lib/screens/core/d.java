package com.waze.car_lib.screens.core;

import androidx.car.app.CarContext;
import androidx.car.app.Screen;
import androidx.car.app.ScreenManager;
import h.ab;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private final ScreenManager f21946a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f21947b;

    public d(ScreenManager screenManager, com.waze.shared_infra.i.e eVar) {
        x.f(screenManager, "screenManager");
        x.f(eVar, "logger");
        this.f21946a = screenManager;
        this.f21947b = eVar;
    }

    public final Screen a() {
        Object objA;
        Object objA2;
        try {
            objA = Integer.valueOf(this.f21946a.getStackSize());
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        Throwable thC = h.m.c(objA);
        if (thC != null) {
            this.f21947b.c("Failed to fetch screenManager stack size", thC);
        }
        if (true == (objA instanceof h.l)) {
            objA = null;
        }
        Integer num = (Integer) objA;
        if (num == null) {
            return null;
        }
        if (num.intValue() == 0) {
            this.f21947b.d("getTop - current stack size is zero!!!!");
            return null;
        }
        try {
            objA2 = this.f21946a.getTop();
        } catch (Throwable th2) {
            objA2 = e.b.c.a(th2);
        }
        Throwable thC2 = h.m.c(objA2);
        if (thC2 != null) {
            this.f21947b.c("Failed to fetch screenManager top", thC2);
        }
        return (Screen) (true != (objA2 instanceof h.l) ? objA2 : null);
    }

    public final void b(String str) {
        Object objA;
        x.f(str, "marker");
        try {
            this.f21946a.popTo(str);
            objA = ab.f48028a;
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        Throwable thC = h.m.c(objA);
        if (thC != null) {
            this.f21947b.c("Failed to popTo ".concat(String.valueOf(str)), thC);
        }
    }

    public final void c(Screen screen) {
        Object objA;
        x.f(screen, CarContext.SCREEN_SERVICE);
        try {
            this.f21946a.push(screen);
            objA = ab.f48028a;
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        Throwable thC = h.m.c(objA);
        if (thC != null) {
            this.f21947b.c("Failed to push screen", thC);
        }
    }

    public final void d(Screen screen) {
        Object objA;
        x.f(screen, CarContext.SCREEN_SERVICE);
        try {
            this.f21946a.remove(screen);
            objA = ab.f48028a;
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        Throwable thC = h.m.c(objA);
        if (thC != null) {
            this.f21947b.c("Failed to remove screen", thC);
        }
    }
}
