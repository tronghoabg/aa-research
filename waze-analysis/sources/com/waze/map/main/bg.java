package com.waze.map.main;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class bg extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29371a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bm f29372b;

    /* renamed from: c, reason: collision with root package name */
    int f29373c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bg(bm bmVar, h.c.e eVar) {
        super(eVar);
        this.f29372b = bmVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29371a = obj;
        this.f29373c |= Integer.MIN_VALUE;
        return bm.l(this.f29372b, this);
    }
}
