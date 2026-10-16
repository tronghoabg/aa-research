package com.waze.app_nav.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class d extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f15133a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f15134b;

    /* renamed from: c, reason: collision with root package name */
    int f15135c;

    /* renamed from: d, reason: collision with root package name */
    p f15136d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(e eVar, h.c.e eVar2) {
        super(eVar2);
        this.f15134b = eVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f15133a = obj;
        this.f15135c |= Integer.MIN_VALUE;
        return e.c(this.f15134b, null, this);
    }
}
