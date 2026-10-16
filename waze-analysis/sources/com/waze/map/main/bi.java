package com.waze.map.main;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class bi extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29377a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bm f29378b;

    /* renamed from: c, reason: collision with root package name */
    int f29379c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bi(bm bmVar, h.c.e eVar) {
        super(eVar);
        this.f29378b = bmVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29377a = obj;
        this.f29379c |= Integer.MIN_VALUE;
        return bm.m(this.f29378b, this);
    }
}
