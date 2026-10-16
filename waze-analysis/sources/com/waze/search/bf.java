package com.waze.search;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bf extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f35547a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f35548b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bl f35549c;

    /* renamed from: d, reason: collision with root package name */
    int f35550d;

    /* renamed from: e, reason: collision with root package name */
    Integer f35551e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bf(bl blVar, h.c.e eVar) {
        super(eVar);
        this.f35549c = blVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f35548b = obj;
        this.f35550d |= Integer.MIN_VALUE;
        return this.f35549c.o(null, this);
    }
}
