package com.waze.search.v2;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class fv extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f36558a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ fx f36559b;

    /* renamed from: c, reason: collision with root package name */
    int f36560c;

    /* renamed from: d, reason: collision with root package name */
    com.waze.av.d.k f36561d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fv(fx fxVar, h.c.e eVar) {
        super(eVar);
        this.f36559b = fxVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f36558a = obj;
        this.f36560c |= Integer.MIN_VALUE;
        return this.f36559b.d(null, this);
    }
}
