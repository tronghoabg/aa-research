package com.waze.car_lib.i.c;

/* loaded from: classes5.dex */
public final class x extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f20148a;

    /* renamed from: b, reason: collision with root package name */
    int f20149b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ad f20150c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(ad adVar, h.c.e eVar) {
        super(eVar);
        this.f20150c = adVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f20148a = obj;
        this.f20149b |= Integer.MIN_VALUE;
        return this.f20150c.emit(null, this);
    }
}
