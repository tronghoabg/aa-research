package com.waze.bl.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class j extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    int f16948a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f16949b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ n f16950c;

    /* renamed from: d, reason: collision with root package name */
    int f16951d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(n nVar, h.c.e eVar) {
        super(eVar);
        this.f16950c = nVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f16949b = obj;
        this.f16951d |= Integer.MIN_VALUE;
        return this.f16950c.g(this);
    }
}
