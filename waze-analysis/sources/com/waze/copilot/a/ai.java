package com.waze.copilot.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ai extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f22683a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aj f22684b;

    /* renamed from: c, reason: collision with root package name */
    int f22685c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ai(aj ajVar, h.c.e eVar) {
        super(eVar);
        this.f22684b = ajVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f22683a = obj;
        this.f22685c |= Integer.MIN_VALUE;
        Object objB = aj.b(this.f22684b, this);
        return objB == h.c.a.a.f48038a ? objB : h.m.d(objB);
    }
}
