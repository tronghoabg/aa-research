package com.waze.car_lib.r;

/* loaded from: classes5.dex */
public final class da extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f21349a;

    /* renamed from: b, reason: collision with root package name */
    int f21350b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bf f21351c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(bf bfVar, h.c.e eVar) {
        super(eVar);
        this.f21351c = bfVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f21349a = obj;
        this.f21350b |= Integer.MIN_VALUE;
        return this.f21351c.emit(null, this);
    }
}
