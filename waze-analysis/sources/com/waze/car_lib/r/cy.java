package com.waze.car_lib.r;

/* loaded from: classes5.dex */
public final class cy extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f21248a;

    /* renamed from: b, reason: collision with root package name */
    int f21249b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ fd f21250c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy(fd fdVar, h.c.e eVar) {
        super(eVar);
        this.f21250c = fdVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f21248a = obj;
        this.f21249b |= Integer.MIN_VALUE;
        return this.f21250c.emit(null, this);
    }
}
