package com.waze.car_lib.n;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ab extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f20346a;

    /* renamed from: b, reason: collision with root package name */
    long f20347b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f20348c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ac f20349d;

    /* renamed from: e, reason: collision with root package name */
    int f20350e;

    /* renamed from: f, reason: collision with root package name */
    com.waze.search.v2.c f20351f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ab(ac acVar, h.c.e eVar) {
        super(eVar);
        this.f20349d = acVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f20348c = obj;
        this.f20350e |= Integer.MIN_VALUE;
        return this.f20349d.b(null, this);
    }
}
