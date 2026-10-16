package com.waze.car_lib.q;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class f extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f20850a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f20851b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ g f20852c;

    /* renamed from: d, reason: collision with root package name */
    int f20853d;

    /* renamed from: e, reason: collision with root package name */
    g f20854e;

    /* renamed from: f, reason: collision with root package name */
    String f20855f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(g gVar, h.c.e eVar) {
        super(eVar);
        this.f20852c = gVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f20851b = obj;
        this.f20853d |= Integer.MIN_VALUE;
        return g.c(this.f20852c, null, this);
    }
}
