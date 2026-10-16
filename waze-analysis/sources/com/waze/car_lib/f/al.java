package com.waze.car_lib.f;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class al extends h.c.a implements CoroutineExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ am f19368a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(kotlinx.coroutines.ac acVar, am amVar) {
        super(acVar);
        this.f19368a = amVar;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(h.c.j jVar, Throwable th) {
        this.f19368a.l().c("Exception thrown when trying to startApp()", th);
    }
}
