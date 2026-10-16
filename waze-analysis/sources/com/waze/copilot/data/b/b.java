package com.waze.copilot.data.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class b extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f22969a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f22970b;

    /* renamed from: c, reason: collision with root package name */
    int f22971c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(f fVar, h.c.e eVar) {
        super(eVar);
        this.f22970b = fVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f22969a = obj;
        this.f22971c |= Integer.MIN_VALUE;
        Object objB = this.f22970b.b(this);
        return objB == h.c.a.a.f48038a ? objB : h.m.d(objB);
    }
}
