package com.waze.reports_v2.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class an extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f34062a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ao f34063b;

    /* renamed from: c, reason: collision with root package name */
    int f34064c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    an(ao aoVar, h.c.e eVar) {
        super(eVar);
        this.f34063b = aoVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f34062a = obj;
        this.f34064c |= Integer.MIN_VALUE;
        return this.f34063b.a(null, this);
    }
}
