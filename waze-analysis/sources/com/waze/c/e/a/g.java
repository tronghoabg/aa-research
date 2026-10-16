package com.waze.c.e.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class g extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f18432a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f18433b;

    /* renamed from: c, reason: collision with root package name */
    int f18434c;

    /* renamed from: d, reason: collision with root package name */
    t f18435d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(t tVar, h.c.e eVar) {
        super(eVar);
        this.f18433b = tVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f18432a = obj;
        this.f18434c |= Integer.MIN_VALUE;
        return t.i(this.f18433b, this);
    }
}
