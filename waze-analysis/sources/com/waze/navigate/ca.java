package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ca extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f31156a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cb f31157b;

    /* renamed from: c, reason: collision with root package name */
    int f31158c;

    /* renamed from: d, reason: collision with root package name */
    com.waze.av.a.p f31159d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ca(cb cbVar, h.c.e eVar) {
        super(eVar);
        this.f31157b = cbVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f31156a = obj;
        this.f31158c |= Integer.MIN_VALUE;
        return this.f31157b.a(null, this);
    }
}
