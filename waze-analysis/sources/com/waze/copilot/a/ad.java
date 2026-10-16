package com.waze.copilot.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ad extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f22677a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ae f22678b;

    /* renamed from: c, reason: collision with root package name */
    int f22679c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ad(ae aeVar, h.c.e eVar) {
        super(eVar);
        this.f22678b = aeVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f22677a = obj;
        this.f22679c |= Integer.MIN_VALUE;
        Object objA = this.f22678b.a(null, null, null, this);
        return objA == h.c.a.a.f48038a ? objA : h.m.d(objA);
    }
}
