package com.waze.bl.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class l extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f16956a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f16957b;

    /* renamed from: c, reason: collision with root package name */
    int f16958c;

    /* renamed from: d, reason: collision with root package name */
    com.waze.bl.c.b.d f16959d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(n nVar, h.c.e eVar) {
        super(eVar);
        this.f16957b = nVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f16956a = obj;
        this.f16958c |= Integer.MIN_VALUE;
        return this.f16957b.i(null, this);
    }
}
