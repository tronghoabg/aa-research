package com.waze.car_lib.r;

import android.util.Size;
import androidx.car.app.CarContext;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private final Object f21728a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f21729b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f21730c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f21731d;

    public x(com.waze.shared_infra.o.a aVar, com.waze.ao aoVar, com.waze.install.a.a aVar2, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(aoVar, "carManager");
        h.g.b.x.f(aVar2, "forceUpgradeStatsSender");
        h.g.b.x.f(eVar, "logger");
        this.f21728a = aVar;
        this.f21729b = aoVar;
        this.f21730c = aVar2;
        this.f21731d = eVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.waze.shared_infra.o.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.waze.ao, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.waze.install.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.waze.shared_infra.i.e, java.lang.Object] */
    public final w a(boolean z, String str, CarContext carContext) {
        h.g.b.x.f(str, "appDownloadUrl");
        h.g.b.x.f(carContext, "carContext");
        ?? r8 = this.f21731d;
        ?? r2 = this.f21728a;
        ?? r3 = this.f21729b;
        ?? r4 = this.f21730c;
        w wVar = new w(r2, r3, r4, z, str, carContext, r8);
        r4.c(z);
        return wVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.waze.car_lib.i.a.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.waze.map.isolated.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlinx.coroutines.af] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlinx.coroutines.b.ch] */
    public final com.waze.car_lib.i.a.j b(Size size, String str, com.waze.map.ec ecVar) {
        h.g.b.x.f(size, "surfaceSize");
        h.g.b.x.f(str, "canvasId");
        h.g.b.x.f(ecVar, "touchNotifier");
        ?? r0 = this.f21729b;
        return new com.waze.car_lib.i.a.j(this.f21731d, this.f21730c.a(str), size, ecVar, r0.c(), this.f21728a, r0.b() / 100.0f, r0.a() / 100.0f);
    }

    public x(kotlinx.coroutines.af afVar, com.waze.map.isolated.b bVar, com.waze.car_lib.i.a.k kVar, kotlinx.coroutines.b.ch chVar) {
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(bVar, "canvasTouchControllerBuilder");
        h.g.b.x.f(kVar, "config");
        h.g.b.x.f(chVar, "visibleAreaFlow");
        this.f21731d = afVar;
        this.f21730c = bVar;
        this.f21729b = kVar;
        this.f21728a = chVar;
    }
}
