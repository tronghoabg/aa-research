package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cn extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f39696a;

    /* renamed from: b, reason: collision with root package name */
    Object f39697b;

    /* renamed from: c, reason: collision with root package name */
    int f39698c;

    /* renamed from: d, reason: collision with root package name */
    int f39699d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f39700e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ co f39701f;

    /* renamed from: g, reason: collision with root package name */
    int f39702g;

    /* renamed from: h, reason: collision with root package name */
    co f39703h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cn(co coVar, h.c.e eVar) {
        super(eVar);
        this.f39701f = coVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f39700e = obj;
        this.f39702g |= Integer.MIN_VALUE;
        return co.b(this.f39701f, null, null, this);
    }
}
