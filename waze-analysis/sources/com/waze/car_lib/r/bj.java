package com.waze.car_lib.r;

/* loaded from: classes5.dex */
public final class bj extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f21043a;

    /* renamed from: b, reason: collision with root package name */
    int f21044b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bf f21045c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(bf bfVar, h.c.e eVar) {
        super(eVar);
        this.f21045c = bfVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f21043a = obj;
        this.f21044b |= Integer.MIN_VALUE;
        return this.f21045c.emit(null, this);
    }
}
