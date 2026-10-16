package com.waze.j.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class d extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f24879a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f24880b;

    /* renamed from: c, reason: collision with root package name */
    int f24881c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(e eVar, h.c.e eVar2) {
        super(eVar2);
        this.f24880b = eVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f24879a = obj;
        this.f24881c |= Integer.MIN_VALUE;
        return e.d(this.f24880b, this);
    }
}
