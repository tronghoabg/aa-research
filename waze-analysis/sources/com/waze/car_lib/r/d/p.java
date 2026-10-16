package com.waze.car_lib.r.d;

/* loaded from: classes5.dex */
public final class p extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f21315a;

    /* renamed from: b, reason: collision with root package name */
    int f21316b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ q f21317c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, h.c.e eVar) {
        super(eVar);
        this.f21317c = qVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f21315a = obj;
        this.f21316b |= Integer.MIN_VALUE;
        return this.f21317c.emit(null, this);
    }
}
