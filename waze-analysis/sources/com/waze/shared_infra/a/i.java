package com.waze.shared_infra.a;

import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.ac;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i extends h.c.a implements CoroutineExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f37784a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f37785b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ac acVar, f fVar, int i2) {
        super(acVar);
        this.f37785b = i2;
        this.f37784a = fVar;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(h.c.j jVar, Throwable th) {
        int i2 = this.f37785b;
        Object obj = this.f37784a;
        if (i2 != 0) {
            ((f) obj).f37771d.c("coroutineExceptionHandler", th);
        } else {
            ((k) obj).f37789a.c("coroutine exception", th);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ac acVar, k kVar, int i2) {
        super(acVar);
        this.f37785b = i2;
        this.f37784a = kVar;
    }
}
