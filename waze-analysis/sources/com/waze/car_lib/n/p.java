package com.waze.car_lib.n;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class p extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f20419a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f20420b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ r f20421c;

    /* renamed from: d, reason: collision with root package name */
    int f20422d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(r rVar, h.c.e eVar) {
        super(eVar);
        this.f20421c = rVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f20420b = obj;
        this.f20422d |= Integer.MIN_VALUE;
        return r.a(this.f20421c, null, this);
    }
}
