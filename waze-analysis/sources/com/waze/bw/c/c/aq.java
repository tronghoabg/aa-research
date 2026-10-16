package com.waze.bw.c.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class aq extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f17818a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ax f17819b;

    /* renamed from: c, reason: collision with root package name */
    int f17820c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aq(ax axVar, h.c.e eVar) {
        super(eVar);
        this.f17819b = axVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f17818a = obj;
        this.f17820c |= Integer.MIN_VALUE;
        return this.f17819b.o(null, null, this);
    }
}
