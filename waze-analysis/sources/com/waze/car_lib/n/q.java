package com.waze.car_lib.n;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class q extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f20423a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f20424b;

    /* renamed from: c, reason: collision with root package name */
    int f20425c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(r rVar, h.c.e eVar) {
        super(eVar);
        this.f20424b = rVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f20423a = obj;
        this.f20425c |= Integer.MIN_VALUE;
        return this.f20424b.f(null, this);
    }
}
