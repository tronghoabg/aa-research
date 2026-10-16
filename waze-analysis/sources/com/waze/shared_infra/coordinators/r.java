package com.waze.shared_infra.coordinators;

import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.ac;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class r extends h.c.a implements CoroutineExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f37839a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ac acVar, s sVar) {
        super(acVar);
        this.f37839a = sVar;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(h.c.j jVar, Throwable th) {
        this.f37839a.f37840a.c("Exception caught in scope", th);
    }
}
