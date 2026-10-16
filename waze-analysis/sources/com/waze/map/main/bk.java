package com.waze.map.main;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class bk extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29383a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bm f29384b;

    /* renamed from: c, reason: collision with root package name */
    int f29385c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bk(bm bmVar, h.c.e eVar) {
        super(eVar);
        this.f29384b = bmVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29383a = obj;
        this.f29385c |= Integer.MIN_VALUE;
        return bm.o(this.f29384b, this);
    }
}
