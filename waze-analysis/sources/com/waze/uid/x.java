package com.waze.uid;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class x extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f44803a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aa f44804b;

    /* renamed from: c, reason: collision with root package name */
    int f44805c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(aa aaVar, h.c.e eVar) {
        super(eVar);
        this.f44804b = aaVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f44803a = obj;
        this.f44805c |= Integer.MIN_VALUE;
        return this.f44804b.g(null, this);
    }
}
