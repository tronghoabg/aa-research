package com.waze.sharedrive.e;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ce extends h.c.a implements CoroutineExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ch f38480a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce(kotlinx.coroutines.ac acVar, ch chVar) {
        super(acVar);
        this.f38480a = chVar;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(h.c.j jVar, Throwable th) {
        this.f38480a.f38489b.c("Error in ShareDriveStateHolder", th);
    }
}
