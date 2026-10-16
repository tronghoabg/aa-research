package com.waze.asks;

import java.util.Objects;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bh extends h.c.a implements CoroutineExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bj f15569a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(kotlinx.coroutines.ac acVar, bj bjVar) {
        super(acVar);
        this.f15569a = bjVar;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(h.c.j jVar, Throwable th) {
        com.waze.shared_infra.i.e eVar = this.f15569a.f15575c;
        Objects.toString(th);
        eVar.a("timer job threw exception: ".concat(String.valueOf(th)));
    }
}
