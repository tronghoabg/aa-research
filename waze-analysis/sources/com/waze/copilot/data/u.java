package com.waze.copilot.data;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class u extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f23067a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ w f23068b;

    /* renamed from: c, reason: collision with root package name */
    int f23069c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(w wVar, h.c.e eVar) {
        super(eVar);
        this.f23068b = wVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f23067a = obj;
        this.f23069c |= Integer.MIN_VALUE;
        Object objH = this.f23068b.h(null, null, this);
        return objH == h.c.a.a.f48038a ? objH : h.m.d(objH);
    }
}
