package com.waze.av.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ay extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f15909a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f15910b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ be f15911c;

    /* renamed from: d, reason: collision with root package name */
    int f15912d;

    /* renamed from: e, reason: collision with root package name */
    aa f15913e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ay(be beVar, h.c.e eVar) {
        super(eVar);
        this.f15911c = beVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f15910b = obj;
        this.f15912d |= Integer.MIN_VALUE;
        return this.f15911c.b(null, null, this);
    }
}
