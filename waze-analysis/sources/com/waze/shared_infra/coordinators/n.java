package com.waze.shared_infra.coordinators;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class n extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f37821a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f37822b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ o f37823c;

    /* renamed from: d, reason: collision with root package name */
    int f37824d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(o oVar, h.c.e eVar) {
        super(eVar);
        this.f37823c = oVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f37822b = obj;
        this.f37824d |= Integer.MIN_VALUE;
        return this.f37823c.x(null, null, this);
    }
}
