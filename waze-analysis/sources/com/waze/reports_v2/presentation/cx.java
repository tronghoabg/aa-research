package com.waze.reports_v2.presentation;

import java.util.Objects;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cx extends h.c.a implements CoroutineExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cz f34993a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx(kotlinx.coroutines.ac acVar, cz czVar) {
        super(acVar);
        this.f34993a = czVar;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(h.c.j jVar, Throwable th) {
        com.waze.shared_infra.i.e eVar = this.f34993a.f35008l;
        Objects.toString(th);
        eVar.a("timer job threw exception: ".concat(String.valueOf(th)));
    }
}
