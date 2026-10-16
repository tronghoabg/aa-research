package com.waze.network.d;

import e.a.ee;
import java.util.Objects;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.ac;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class k extends h.c.a implements CoroutineExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f32207a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e.a.d f32208b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ac acVar, l lVar, e.a.d dVar) {
        super(acVar);
        this.f32207a = lVar;
        this.f32208b = dVar;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(h.c.j jVar, Throwable th) {
        com.waze.shared_infra.i.e eVar = this.f32207a.f32211c;
        Objects.toString(th);
        eVar.b("failed to apply credentials ".concat(String.valueOf(th)));
        this.f32208b.b(ee.f47410j.f(th));
    }
}
