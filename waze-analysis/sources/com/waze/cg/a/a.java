package com.waze.cg.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class a extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f22249a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f22250b;

    /* renamed from: c, reason: collision with root package name */
    int f22251c;

    /* renamed from: d, reason: collision with root package name */
    c f22252d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(c cVar, h.c.e eVar) {
        super(eVar);
        this.f22250b = cVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f22249a = obj;
        this.f22251c |= Integer.MIN_VALUE;
        return c.b(this.f22250b, this);
    }
}
