package com.waze.reports_v2.c;

import java.util.Objects;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bi extends h.c.a implements CoroutineExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bj f34241a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(kotlinx.coroutines.ac acVar, bj bjVar) {
        super(acVar);
        this.f34241a = bjVar;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(h.c.j jVar, Throwable th) {
        com.waze.shared_infra.i.e eVar = this.f34241a.f34245d;
        Objects.toString(th);
        eVar.g("timer job threw exception: ".concat(String.valueOf(th)));
    }
}
