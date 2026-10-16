package com.waze.car_lib.r;

import java.util.Objects;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class fn extends h.c.a implements CoroutineExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fp f21649a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn(kotlinx.coroutines.ac acVar, fp fpVar) {
        super(acVar);
        this.f21649a = fpVar;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(h.c.j jVar, Throwable th) {
        com.waze.shared_infra.i.e eVar = this.f21649a.f21659e;
        Objects.toString(th);
        eVar.a("timer job threw exception: ".concat(String.valueOf(th)));
    }
}
