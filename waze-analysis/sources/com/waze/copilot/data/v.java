package com.waze.copilot.data;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class v extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f23070a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ w f23071b;

    /* renamed from: c, reason: collision with root package name */
    int f23072c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(w wVar, h.c.e eVar) {
        super(eVar);
        this.f23071b = wVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f23070a = obj;
        this.f23072c |= Integer.MIN_VALUE;
        Object objA = this.f23071b.a(null, false, this);
        return objA == h.c.a.a.f48038a ? objA : h.m.d(objA);
    }
}
