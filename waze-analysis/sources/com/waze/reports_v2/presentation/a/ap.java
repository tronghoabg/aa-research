package com.waze.reports_v2.presentation.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ap extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f34651a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ as f34652b;

    /* renamed from: c, reason: collision with root package name */
    int f34653c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ap(as asVar, h.c.e eVar) {
        super(eVar);
        this.f34652b = asVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f34651a = obj;
        this.f34653c |= Integer.MIN_VALUE;
        return this.f34652b.n(null, this);
    }
}
