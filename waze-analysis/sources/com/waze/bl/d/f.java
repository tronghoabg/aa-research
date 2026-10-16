package com.waze.bl.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class f extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f17080a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f17081b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ l f17082c;

    /* renamed from: d, reason: collision with root package name */
    int f17083d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(l lVar, h.c.e eVar) {
        super(eVar);
        this.f17082c = lVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f17081b = obj;
        this.f17083d |= Integer.MIN_VALUE;
        return l.c(this.f17082c, null, this);
    }
}
