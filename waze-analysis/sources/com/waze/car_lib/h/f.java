package com.waze.car_lib.h;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class f extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f19824a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f19825b;

    /* renamed from: c, reason: collision with root package name */
    int f19826c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(g gVar, h.c.e eVar) {
        super(eVar);
        this.f19825b = gVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f19824a = obj;
        this.f19826c |= Integer.MIN_VALUE;
        return g.b(this.f19825b, null, this);
    }
}
