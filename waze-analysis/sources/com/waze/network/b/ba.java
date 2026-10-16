package com.waze.network.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ba extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f31986a;

    /* renamed from: b, reason: collision with root package name */
    long f31987b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f31988c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ bc f31989d;

    /* renamed from: e, reason: collision with root package name */
    int f31990e;

    /* renamed from: f, reason: collision with root package name */
    h.g.b.ap f31991f;

    /* renamed from: g, reason: collision with root package name */
    h.g.b.am f31992g;

    /* renamed from: h, reason: collision with root package name */
    com.waze.network.g.a f31993h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ba(bc bcVar, h.c.e eVar) {
        super(eVar);
        this.f31989d = bcVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f31988c = obj;
        this.f31990e |= Integer.MIN_VALUE;
        return bc.d(this.f31989d, null, this);
    }
}
