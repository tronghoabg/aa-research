package com.waze.av.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class av extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f15894a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f15895b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ be f15896c;

    /* renamed from: d, reason: collision with root package name */
    int f15897d;

    /* renamed from: e, reason: collision with root package name */
    com.waze.av.a.p f15898e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    av(be beVar, h.c.e eVar) {
        super(eVar);
        this.f15896c = beVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f15895b = obj;
        this.f15897d |= Integer.MIN_VALUE;
        return this.f15896c.n(null, null, this);
    }
}
