package com.waze.copilot.data;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class q extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f23047a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ w f23048b;

    /* renamed from: c, reason: collision with root package name */
    int f23049c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(w wVar, h.c.e eVar) {
        super(eVar);
        this.f23048b = wVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f23047a = obj;
        this.f23049c |= Integer.MIN_VALUE;
        Object objC = this.f23048b.c(null, this);
        return objC == h.c.a.a.f48038a ? objC : h.m.d(objC);
    }
}
