package com.waze.copilot.data;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class p extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f23044a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ w f23045b;

    /* renamed from: c, reason: collision with root package name */
    int f23046c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(w wVar, h.c.e eVar) {
        super(eVar);
        this.f23045b = wVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f23044a = obj;
        this.f23046c |= Integer.MIN_VALUE;
        Object objI = this.f23045b.i(null, null, this);
        return objI == h.c.a.a.f48038a ? objI : h.m.d(objI);
    }
}
