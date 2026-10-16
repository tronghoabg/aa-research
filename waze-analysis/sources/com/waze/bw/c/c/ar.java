package com.waze.bw.c.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ar extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f17821a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ax f17822b;

    /* renamed from: c, reason: collision with root package name */
    int f17823c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ar(ax axVar, h.c.e eVar) {
        super(eVar);
        this.f17822b = axVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f17821a = obj;
        this.f17823c |= Integer.MIN_VALUE;
        return this.f17822b.p(null, null, this);
    }
}
