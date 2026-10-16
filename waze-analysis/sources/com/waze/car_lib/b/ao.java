package com.waze.car_lib.b;

/* loaded from: classes5.dex */
public final class ao extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f18978a;

    /* renamed from: b, reason: collision with root package name */
    int f18979b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ah f18980c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao(ah ahVar, h.c.e eVar) {
        super(eVar);
        this.f18980c = ahVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f18978a = obj;
        this.f18979b |= Integer.MIN_VALUE;
        return this.f18980c.emit(null, this);
    }
}
