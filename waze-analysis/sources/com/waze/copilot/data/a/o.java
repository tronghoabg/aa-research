package com.waze.copilot.data.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class o extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f22932a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f22933b;

    /* renamed from: c, reason: collision with root package name */
    int f22934c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(p pVar, h.c.e eVar) {
        super(eVar);
        this.f22933b = pVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f22932a = obj;
        this.f22934c |= Integer.MIN_VALUE;
        Object objA = this.f22933b.a(this);
        return objA == h.c.a.a.f48038a ? objA : h.m.d(objA);
    }
}
