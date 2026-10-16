package com.waze.car_lib.r;

/* loaded from: classes5.dex */
public final class bt extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f21086a;

    /* renamed from: b, reason: collision with root package name */
    int f21087b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bf f21088c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt(bf bfVar, h.c.e eVar) {
        super(eVar);
        this.f21088c = bfVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f21086a = obj;
        this.f21087b |= Integer.MIN_VALUE;
        return this.f21088c.emit(null, this);
    }
}
