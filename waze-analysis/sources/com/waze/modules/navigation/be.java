package com.waze.modules.navigation;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class be extends h.c.a implements CoroutineExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bk f30378a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(kotlinx.coroutines.ac acVar, bk bkVar) {
        super(acVar);
        this.f30378a = bkVar;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(h.c.j jVar, Throwable th) {
        this.f30378a.f30397a.h("Scope was canceled", th);
    }
}
