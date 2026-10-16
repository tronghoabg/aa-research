package com.waze.o.b.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class b extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f32717a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f32718b;

    /* renamed from: c, reason: collision with root package name */
    int f32719c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar, h.c.e eVar) {
        super(eVar);
        this.f32718b = cVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f32717a = obj;
        this.f32719c |= Integer.MIN_VALUE;
        return this.f32718b.b(null, null, this);
    }
}
