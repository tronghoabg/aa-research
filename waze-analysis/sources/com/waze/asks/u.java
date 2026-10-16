package com.waze.asks;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class u extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f15636a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ v f15637b;

    /* renamed from: c, reason: collision with root package name */
    int f15638c;

    /* renamed from: d, reason: collision with root package name */
    v f15639d;

    /* renamed from: e, reason: collision with root package name */
    v f15640e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(v vVar, h.c.e eVar) {
        super(eVar);
        this.f15637b = vVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f15636a = obj;
        this.f15638c |= Integer.MIN_VALUE;
        return v.b(this.f15637b, null, this);
    }
}
