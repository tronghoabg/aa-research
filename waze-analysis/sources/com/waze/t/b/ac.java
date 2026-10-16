package com.waze.t.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ac extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f40657a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f40658b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ag f40659c;

    /* renamed from: d, reason: collision with root package name */
    int f40660d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(ag agVar, h.c.e eVar) {
        super(eVar);
        this.f40659c = agVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40658b = obj;
        this.f40660d |= Integer.MIN_VALUE;
        return ag.m(this.f40659c, this);
    }
}
