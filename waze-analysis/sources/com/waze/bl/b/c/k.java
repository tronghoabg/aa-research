package com.waze.bl.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class k extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f16952a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f16953b;

    /* renamed from: c, reason: collision with root package name */
    int f16954c;

    /* renamed from: d, reason: collision with root package name */
    com.waze.bl.c.b.c f16955d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(n nVar, h.c.e eVar) {
        super(eVar);
        this.f16953b = nVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f16952a = obj;
        this.f16954c |= Integer.MIN_VALUE;
        return this.f16953b.h(null, null, this);
    }
}
