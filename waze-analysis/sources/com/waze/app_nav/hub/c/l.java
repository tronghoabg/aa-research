package com.waze.app_nav.hub.c;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class l extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f15312a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f15313b;

    /* renamed from: c, reason: collision with root package name */
    int f15314c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(p pVar, h.c.e eVar) {
        super(eVar);
        this.f15313b = pVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f15312a = obj;
        this.f15314c |= Integer.MIN_VALUE;
        return p.d(this.f15313b, this);
    }
}
