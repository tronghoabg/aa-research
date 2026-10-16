package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class nd extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f31842a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ne f31843b;

    /* renamed from: c, reason: collision with root package name */
    int f31844c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    nd(ne neVar, h.c.e eVar) {
        super(eVar);
        this.f31843b = neVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f31842a = obj;
        this.f31844c |= Integer.MIN_VALUE;
        return this.f31843b.a(this);
    }
}
