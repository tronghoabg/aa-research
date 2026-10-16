package com.waze.network.f;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class t extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f32340a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f32341b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ w f32342c;

    /* renamed from: d, reason: collision with root package name */
    int f32343d;

    /* renamed from: e, reason: collision with root package name */
    com.waze.network.g.a f32344e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(w wVar, h.c.e eVar) {
        super(eVar);
        this.f32342c = wVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f32341b = obj;
        this.f32343d |= Integer.MIN_VALUE;
        return w.i(this.f32342c, null, null, this);
    }
}
