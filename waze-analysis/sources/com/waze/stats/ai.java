package com.waze.stats;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ai extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f40510a;

    /* renamed from: b, reason: collision with root package name */
    Object f40511b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f40512c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ an f40513d;

    /* renamed from: e, reason: collision with root package name */
    int f40514e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ai(an anVar, h.c.e eVar) {
        super(eVar);
        this.f40513d = anVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40512c = obj;
        this.f40514e |= Integer.MIN_VALUE;
        Object objO = this.f40513d.o(this);
        return objO == h.c.a.a.f48038a ? objO : h.m.d(objO);
    }
}
