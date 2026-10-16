package com.waze.car_lib.screens.core;

import h.ab;
import h.g.a.p;
import h.g.b.w;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class g extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f21956a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ScreenPresentable f21957b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(ScreenPresentable screenPresentable, h.c.e eVar) {
        super(2, eVar);
        this.f21957b = screenPresentable;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new g(this.f21957b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((g) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f21956a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f21956a = 1;
            if (w.b(this) == aVar) {
                return aVar;
            }
        }
        ScreenPresentable screenPresentable = this.f21957b;
        screenPresentable.logger.a("screen template called. ".concat(String.valueOf(screenPresentable.screenName)));
        CompletableDeferred<ab> getTemplateCompletableDeferred = screenPresentable.getGetTemplateCompletableDeferred();
        ab abVar = ab.f48028a;
        getTemplateCompletableDeferred.a(abVar);
        return abVar;
    }
}
