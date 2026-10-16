package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class m extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f34520a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f34521b;

    /* renamed from: c, reason: collision with root package name */
    int f34522c;

    /* renamed from: d, reason: collision with root package name */
    n f34523d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(n nVar, h.c.e eVar) {
        super(eVar);
        this.f34521b = nVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f34520a = obj;
        this.f34522c |= Integer.MIN_VALUE;
        return n.d(this.f34521b, this);
    }
}
