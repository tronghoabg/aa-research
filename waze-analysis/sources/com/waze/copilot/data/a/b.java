package com.waze.copilot.data.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class b extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f22913a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f22914b;

    /* renamed from: c, reason: collision with root package name */
    int f22915c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar, h.c.e eVar) {
        super(eVar);
        this.f22914b = cVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f22913a = obj;
        this.f22915c |= Integer.MIN_VALUE;
        Object objA = this.f22914b.a(this);
        return objA == h.c.a.a.f48038a ? objA : h.m.d(objA);
    }
}
