package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class b extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28042a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f28043b;

    /* renamed from: c, reason: collision with root package name */
    int f28044c;

    /* renamed from: d, reason: collision with root package name */
    c f28045d;

    /* renamed from: e, reason: collision with root package name */
    com.waze.map.canvas.bm f28046e;

    /* renamed from: f, reason: collision with root package name */
    com.waze.map.ag f28047f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar, h.c.e eVar) {
        super(eVar);
        this.f28043b = cVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f28042a = obj;
        this.f28044c |= Integer.MIN_VALUE;
        return c.a(this.f28043b, null, this);
    }
}
