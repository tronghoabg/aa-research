package com.waze.car_lib.n;

/* loaded from: classes5.dex */
public final class g extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f20401a;

    /* renamed from: b, reason: collision with root package name */
    int f20402b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h f20403c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, h.c.e eVar) {
        super(eVar);
        this.f20403c = hVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f20401a = obj;
        this.f20402b |= Integer.MIN_VALUE;
        return this.f20403c.emit(null, this);
    }
}
