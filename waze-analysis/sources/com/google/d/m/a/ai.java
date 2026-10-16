package com.google.d.m.a;

import j$.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ai extends aj {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ak f7984a;

    /* renamed from: c, reason: collision with root package name */
    private final Callable f7985c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ai(ak akVar, Callable callable, Executor executor) {
        super(akVar, executor);
        Objects.requireNonNull(akVar);
        this.f7984a = akVar;
        this.f7985c = callable;
    }

    @Override // com.google.d.m.a.bk
    final Object a() {
        return this.f7985c.call();
    }

    @Override // com.google.d.m.a.bk
    final String b() {
        return this.f7985c.toString();
    }

    @Override // com.google.d.m.a.aj
    final void c(Object obj) {
        this.f7984a.c(obj);
    }
}
