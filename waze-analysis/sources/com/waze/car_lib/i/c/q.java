package com.waze.car_lib.i.c;

/* loaded from: classes5.dex */
public final class q extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f20120a;

    /* renamed from: b, reason: collision with root package name */
    int f20121b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ r f20122c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, h.c.e eVar) {
        super(eVar);
        this.f20122c = rVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f20120a = obj;
        this.f20121b |= Integer.MIN_VALUE;
        return this.f20122c.emit(null, this);
    }
}
