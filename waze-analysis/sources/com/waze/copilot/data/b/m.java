package com.waze.copilot.data.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class m extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f23001a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f23002b;

    /* renamed from: c, reason: collision with root package name */
    int f23003c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(n nVar, h.c.e eVar) {
        super(eVar);
        this.f23002b = nVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f23001a = obj;
        this.f23003c |= Integer.MIN_VALUE;
        Object objB = this.f23002b.b(this);
        return objB == h.c.a.a.f48038a ? objB : h.m.d(objB);
    }
}
