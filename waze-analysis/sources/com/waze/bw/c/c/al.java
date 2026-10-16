package com.waze.bw.c.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class al extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f17793a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f17794b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ am f17795c;

    /* renamed from: d, reason: collision with root package name */
    int f17796d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    al(am amVar, h.c.e eVar) {
        super(eVar);
        this.f17795c = amVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f17794b = obj;
        this.f17796d |= Integer.MIN_VALUE;
        return am.r(this.f17795c, null, this);
    }
}
