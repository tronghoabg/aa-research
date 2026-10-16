package com.waze.c.e.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class f extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f18429a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f18430b;

    /* renamed from: c, reason: collision with root package name */
    int f18431c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(t tVar, h.c.e eVar) {
        super(eVar);
        this.f18430b = tVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f18429a = obj;
        this.f18431c |= Integer.MIN_VALUE;
        return t.d(this.f18430b, this);
    }
}
