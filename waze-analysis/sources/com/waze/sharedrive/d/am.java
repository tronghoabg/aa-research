package com.waze.sharedrive.d;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class am extends h.c.a implements CoroutineExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aq f38199a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am(kotlinx.coroutines.ac acVar, aq aqVar) {
        super(acVar);
        this.f38199a = aqVar;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(h.c.j jVar, Throwable th) {
        this.f38199a.f38219g.c("Exception in ShareDrive observation flow", th);
    }
}
