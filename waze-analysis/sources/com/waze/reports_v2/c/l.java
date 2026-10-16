package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class l extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f34516a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f34517b;

    /* renamed from: c, reason: collision with root package name */
    int f34518c;

    /* renamed from: d, reason: collision with root package name */
    n f34519d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(n nVar, h.c.e eVar) {
        super(eVar);
        this.f34517b = nVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f34516a = obj;
        this.f34518c |= Integer.MIN_VALUE;
        return n.b(this.f34517b, this);
    }
}
