package com.waze.copilot.data.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class e extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f22918a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f22919b;

    /* renamed from: c, reason: collision with root package name */
    int f22920c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(f fVar, h.c.e eVar) {
        super(eVar);
        this.f22919b = fVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f22918a = obj;
        this.f22920c |= Integer.MIN_VALUE;
        Object objA = this.f22919b.a(null, null, null, this);
        return objA == h.c.a.a.f48038a ? objA : h.m.d(objA);
    }
}
