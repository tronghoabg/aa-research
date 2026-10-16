package com.waze.c.e;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class au extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f18550a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bc f18551b;

    /* renamed from: c, reason: collision with root package name */
    int f18552c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    au(bc bcVar, h.c.e eVar) {
        super(eVar);
        this.f18551b = bcVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f18550a = obj;
        this.f18552c |= Integer.MIN_VALUE;
        return bc.g(this.f18551b, this);
    }
}
