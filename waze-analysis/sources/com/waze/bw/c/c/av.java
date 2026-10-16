package com.waze.bw.c.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class av extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f17833a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ax f17834b;

    /* renamed from: c, reason: collision with root package name */
    int f17835c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    av(ax axVar, h.c.e eVar) {
        super(eVar);
        this.f17834b = axVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f17833a = obj;
        this.f17835c |= Integer.MIN_VALUE;
        return this.f17834b.t(null, 0L, null, this);
    }
}
