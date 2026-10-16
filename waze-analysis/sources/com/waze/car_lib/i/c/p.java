package com.waze.car_lib.i.c;

/* loaded from: classes5.dex */
public final class p extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f20117a;

    /* renamed from: b, reason: collision with root package name */
    int f20118b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ r f20119c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, h.c.e eVar) {
        super(eVar);
        this.f20119c = rVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f20117a = obj;
        this.f20118b |= Integer.MIN_VALUE;
        return this.f20119c.emit(null, this);
    }
}
