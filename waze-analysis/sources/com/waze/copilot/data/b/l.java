package com.waze.copilot.data.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class l extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f22998a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f22999b;

    /* renamed from: c, reason: collision with root package name */
    int f23000c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(n nVar, h.c.e eVar) {
        super(eVar);
        this.f22999b = nVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f22998a = obj;
        this.f23000c |= Integer.MIN_VALUE;
        Object objA = this.f22999b.a(null, null, null, this);
        return objA == h.c.a.a.f48038a ? objA : h.m.d(objA);
    }
}
