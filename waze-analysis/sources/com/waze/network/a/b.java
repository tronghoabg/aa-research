package com.waze.network.a;

import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class b extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f31855a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f31856b;

    /* renamed from: c, reason: collision with root package name */
    int f31857c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar, e eVar) {
        super(eVar);
        this.f31856b = cVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f31855a = obj;
        this.f31857c |= Integer.MIN_VALUE;
        return this.f31856b.b(null, null, this);
    }
}
