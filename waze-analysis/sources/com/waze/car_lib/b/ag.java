package com.waze.car_lib.b;

/* loaded from: classes5.dex */
public final class ag extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f18956a;

    /* renamed from: b, reason: collision with root package name */
    int f18957b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ah f18958c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(ah ahVar, h.c.e eVar) {
        super(eVar);
        this.f18958c = ahVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f18956a = obj;
        this.f18957b |= Integer.MIN_VALUE;
        return this.f18958c.emit(null, this);
    }
}
