package com.waze.car_lib.r.d;

/* loaded from: classes5.dex */
public final class o extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f21312a;

    /* renamed from: b, reason: collision with root package name */
    int f21313b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ q f21314c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, h.c.e eVar) {
        super(eVar);
        this.f21314c = qVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f21312a = obj;
        this.f21313b |= Integer.MIN_VALUE;
        return this.f21314c.emit(null, this);
    }
}
