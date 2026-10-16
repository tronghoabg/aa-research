package com.waze.closure.c;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class e extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f22463a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f22464b;

    /* renamed from: c, reason: collision with root package name */
    int f22465c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(i iVar, h.c.e eVar) {
        super(eVar);
        this.f22464b = iVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f22463a = obj;
        this.f22465c |= Integer.MIN_VALUE;
        return i.a(this.f22464b, this);
    }
}
