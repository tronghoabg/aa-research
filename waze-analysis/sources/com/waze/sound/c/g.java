package com.waze.sound.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class g extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f39588a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f39589b;

    /* renamed from: c, reason: collision with root package name */
    int f39590c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(n nVar, h.c.e eVar) {
        super(eVar);
        this.f39589b = nVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f39588a = obj;
        this.f39590c |= Integer.MIN_VALUE;
        Object objA = this.f39589b.a(null, null, this);
        return objA == h.c.a.a.f48038a ? objA : h.m.d(objA);
    }
}
