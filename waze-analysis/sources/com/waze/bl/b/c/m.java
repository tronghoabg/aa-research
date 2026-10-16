package com.waze.bl.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class m extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f16960a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f16961b;

    /* renamed from: c, reason: collision with root package name */
    int f16962c;

    /* renamed from: d, reason: collision with root package name */
    com.waze.bl.c.b.e f16963d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(n nVar, h.c.e eVar) {
        super(eVar);
        this.f16961b = nVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f16960a = obj;
        this.f16962c |= Integer.MIN_VALUE;
        return this.f16961b.j(null, this);
    }
}
