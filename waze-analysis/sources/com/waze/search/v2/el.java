package com.waze.search.v2;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class el extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f36441a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f36442b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ fi f36443c;

    /* renamed from: d, reason: collision with root package name */
    int f36444d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    el(fi fiVar, h.c.e eVar) {
        super(eVar);
        this.f36443c = fiVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f36442b = obj;
        this.f36444d |= Integer.MIN_VALUE;
        return this.f36443c.aj(null, this);
    }
}
