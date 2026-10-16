package com.waze.bh.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class f extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f16762a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f16763b;

    /* renamed from: c, reason: collision with root package name */
    int f16764c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(g gVar, h.c.e eVar) {
        super(eVar);
        this.f16763b = gVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f16762a = obj;
        this.f16764c |= Integer.MIN_VALUE;
        return this.f16763b.c(null, this);
    }
}
