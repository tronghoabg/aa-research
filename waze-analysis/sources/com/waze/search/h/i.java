package com.waze.search.h;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class i extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f35925a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f35926b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ o f35927c;

    /* renamed from: d, reason: collision with root package name */
    int f35928d;

    /* renamed from: e, reason: collision with root package name */
    String f35929e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(o oVar, h.c.e eVar) {
        super(eVar);
        this.f35927c = oVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f35926b = obj;
        this.f35928d |= Integer.MIN_VALUE;
        return this.f35927c.s(null, null, 0, this);
    }
}
