package com.waze.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class d extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f13615a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f13616b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h f13617c;

    /* renamed from: d, reason: collision with root package name */
    int f13618d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(h hVar, h.c.e eVar) {
        super(eVar);
        this.f13617c = hVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f13616b = obj;
        this.f13618d |= Integer.MIN_VALUE;
        return this.f13617c.f(null, null, null, null, false, false, this);
    }
}
