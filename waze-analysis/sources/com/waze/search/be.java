package com.waze.search;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class be extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f35543a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bl f35544b;

    /* renamed from: c, reason: collision with root package name */
    int f35545c;

    /* renamed from: d, reason: collision with root package name */
    bc f35546d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    be(bl blVar, h.c.e eVar) {
        super(eVar);
        this.f35544b = blVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f35543a = obj;
        this.f35545c |= Integer.MIN_VALUE;
        return this.f35544b.a(null, this);
    }
}
