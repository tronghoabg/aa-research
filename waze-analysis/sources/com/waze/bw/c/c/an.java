package com.waze.bw.c.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class an extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f17809a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ax f17810b;

    /* renamed from: c, reason: collision with root package name */
    int f17811c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    an(ax axVar, h.c.e eVar) {
        super(eVar);
        this.f17810b = axVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f17809a = obj;
        this.f17811c |= Integer.MIN_VALUE;
        return this.f17810b.l(null, null, this);
    }
}
