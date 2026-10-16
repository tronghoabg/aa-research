package com.waze.bh.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class d extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f16756a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f16757b;

    /* renamed from: c, reason: collision with root package name */
    int f16758c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(g gVar, h.c.e eVar) {
        super(eVar);
        this.f16757b = gVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f16756a = obj;
        this.f16758c |= Integer.MIN_VALUE;
        return this.f16757b.a(null, this);
    }
}
