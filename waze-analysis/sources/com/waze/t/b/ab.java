package com.waze.t.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ab extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f40653a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ag f40654b;

    /* renamed from: c, reason: collision with root package name */
    int f40655c;

    /* renamed from: d, reason: collision with root package name */
    com.waze.h.a.i f40656d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ab(ag agVar, h.c.e eVar) {
        super(eVar);
        this.f40654b = agVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40653a = obj;
        this.f40655c |= Integer.MIN_VALUE;
        return ag.l(this.f40654b, null, this);
    }
}
