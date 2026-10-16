package com.waze.sharedrive.e;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bu extends h.c.a implements CoroutineExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bv f38461a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu(kotlinx.coroutines.ac acVar, bv bvVar) {
        super(acVar);
        this.f38461a = bvVar;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(h.c.j jVar, Throwable th) {
        this.f38461a.f38463b.c("State observation failed", th);
    }
}
