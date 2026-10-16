package com.waze.car_lib.r;

/* loaded from: classes5.dex */
public final class ci extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f21208a;

    /* renamed from: b, reason: collision with root package name */
    int f21209b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bf f21210c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci(bf bfVar, h.c.e eVar) {
        super(eVar);
        this.f21210c = bfVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f21208a = obj;
        this.f21209b |= Integer.MIN_VALUE;
        return this.f21210c.emit(null, this);
    }
}
