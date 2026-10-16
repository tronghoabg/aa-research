package com.waze.car_lib.i.b;

/* loaded from: classes5.dex */
public final class k extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f19999a;

    /* renamed from: b, reason: collision with root package name */
    int f20000b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ i f20001c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, h.c.e eVar) {
        super(eVar);
        this.f20001c = iVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f19999a = obj;
        this.f20000b |= Integer.MIN_VALUE;
        return this.f20001c.emit(null, this);
    }
}
