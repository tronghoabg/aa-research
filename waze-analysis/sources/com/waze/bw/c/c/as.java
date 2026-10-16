package com.waze.bw.c.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class as extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f17824a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ax f17825b;

    /* renamed from: c, reason: collision with root package name */
    int f17826c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    as(ax axVar, h.c.e eVar) {
        super(eVar);
        this.f17825b = axVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f17824a = obj;
        this.f17826c |= Integer.MIN_VALUE;
        return this.f17825b.q(null, null, this);
    }
}
