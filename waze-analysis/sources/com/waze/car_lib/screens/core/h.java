package com.waze.car_lib.screens.core;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class h extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f21958a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ScreenPresentable f21959b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f21960c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(ScreenPresentable screenPresentable, h.c.e eVar) {
        super(2, eVar);
        this.f21959b = screenPresentable;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        h hVar = new h(this.f21959b, eVar);
        hVar.f21960c = obj;
        return hVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((h) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        af afVar;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f21958a != 0) {
            afVar = (af) this.f21960c;
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            af afVar2 = (af) this.f21960c;
            this.f21960c = afVar2;
            this.f21958a = 1;
            if (this.f21959b.awaitTopScreen(this) == aVar) {
                return aVar;
            }
            afVar = afVar2;
        }
        boolean zJ = aj.j(afVar);
        ScreenPresentable screenPresentable = this.f21959b;
        if (zJ) {
            screenPresentable.loggerWithBreadcrumbs.e("pushing ".concat(String.valueOf(screenPresentable.screenName)));
            screenPresentable.safeScreenManager.c(screenPresentable);
        } else {
            screenPresentable.loggerWithBreadcrumbs.e("push canceled ".concat(String.valueOf(screenPresentable.screenName)));
        }
        this.f21959b.pushingScreenJob = null;
        return ab.f48028a;
    }
}
