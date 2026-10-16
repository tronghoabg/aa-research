package com.waze.cg.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class d extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f22256a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f22257b;

    /* renamed from: c, reason: collision with root package name */
    int f22258c;

    /* renamed from: d, reason: collision with root package name */
    e f22259d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(e eVar, h.c.e eVar2) {
        super(eVar2);
        this.f22257b = eVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f22256a = obj;
        this.f22258c |= Integer.MIN_VALUE;
        return e.b(this.f22257b, this);
    }
}
