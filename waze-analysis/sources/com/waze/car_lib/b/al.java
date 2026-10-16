package com.waze.car_lib.b;

/* loaded from: classes5.dex */
public final class al extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f18968a;

    /* renamed from: b, reason: collision with root package name */
    int f18969b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ah f18970c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(ah ahVar, h.c.e eVar) {
        super(eVar);
        this.f18970c = ahVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f18968a = obj;
        this.f18969b |= Integer.MIN_VALUE;
        return this.f18970c.emit(null, this);
    }
}
