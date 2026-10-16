package com.waze.bw.c.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class au extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f17830a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ax f17831b;

    /* renamed from: c, reason: collision with root package name */
    int f17832c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    au(ax axVar, h.c.e eVar) {
        super(eVar);
        this.f17831b = axVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f17830a = obj;
        this.f17832c |= Integer.MIN_VALUE;
        return this.f17831b.s(null, 0L, null, this);
    }
}
