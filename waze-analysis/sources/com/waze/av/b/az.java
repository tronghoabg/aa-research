package com.waze.av.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class az extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f15914a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ be f15915b;

    /* renamed from: c, reason: collision with root package name */
    int f15916c;

    /* renamed from: d, reason: collision with root package name */
    y f15917d;

    /* renamed from: e, reason: collision with root package name */
    aa f15918e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    az(be beVar, h.c.e eVar) {
        super(eVar);
        this.f15915b = beVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f15914a = obj;
        this.f15916c |= Integer.MIN_VALUE;
        return this.f15915b.c(null, null, this);
    }
}
