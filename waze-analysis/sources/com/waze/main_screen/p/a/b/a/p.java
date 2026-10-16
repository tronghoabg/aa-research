package com.waze.main_screen.p.a.b.a;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class p extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f26811a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f26812b;

    /* renamed from: c, reason: collision with root package name */
    int f26813c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(t tVar, h.c.e eVar) {
        super(eVar);
        this.f26812b = tVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f26811a = obj;
        this.f26813c |= Integer.MIN_VALUE;
        return this.f26812b.F(this);
    }
}
