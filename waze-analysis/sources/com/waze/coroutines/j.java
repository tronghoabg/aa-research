package com.waze.coroutines;

import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.ac;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class j extends h.c.a implements CoroutineExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f23191a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ RuntimeException f23192b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ac acVar, k kVar, RuntimeException runtimeException) {
        super(acVar);
        this.f23191a = kVar;
        this.f23192b = runtimeException;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(h.c.j jVar, Throwable th) {
        k kVar = this.f23191a;
        kVar.f23193a.c("uncaught exception killed a scope\n(context:" + jVar + ")", th);
        kVar.f23193a.h("scope was created here:", this.f23192b);
    }
}
