package com.waze.search.h;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class h extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f35922a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ o f35923b;

    /* renamed from: c, reason: collision with root package name */
    int f35924c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(o oVar, h.c.e eVar) {
        super(eVar);
        this.f35923b = oVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f35922a = obj;
        this.f35924c |= Integer.MIN_VALUE;
        return o.f(this.f35923b, null, null, 0, this);
    }
}
