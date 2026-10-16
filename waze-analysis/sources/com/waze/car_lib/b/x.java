package com.waze.car_lib.b;

/* loaded from: classes5.dex */
public final class x extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f19145a;

    /* renamed from: b, reason: collision with root package name */
    int f19146b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ah f19147c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(ah ahVar, h.c.e eVar) {
        super(eVar);
        this.f19147c = ahVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f19145a = obj;
        this.f19146b |= Integer.MIN_VALUE;
        return this.f19147c.emit(null, this);
    }
}
