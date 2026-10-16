package com.waze.bw.c.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class at extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f17827a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ax f17828b;

    /* renamed from: c, reason: collision with root package name */
    int f17829c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    at(ax axVar, h.c.e eVar) {
        super(eVar);
        this.f17828b = axVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f17827a = obj;
        this.f17829c |= Integer.MIN_VALUE;
        return this.f17828b.r(null, null, this);
    }
}
