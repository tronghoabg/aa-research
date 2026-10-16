package com.waze.av.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class au extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f15889a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f15890b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ be f15891c;

    /* renamed from: d, reason: collision with root package name */
    int f15892d;

    /* renamed from: e, reason: collision with root package name */
    com.waze.av.a.p f15893e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    au(be beVar, h.c.e eVar) {
        super(eVar);
        this.f15891c = beVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f15890b = obj;
        this.f15892d |= Integer.MIN_VALUE;
        return this.f15891c.f(null, null, this);
    }
}
