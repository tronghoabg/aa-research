package com.waze.main_screen;

/* loaded from: classes6.dex */
public final class bb extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f25899a;

    /* renamed from: b, reason: collision with root package name */
    int f25900b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bc f25901c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb(bc bcVar, h.c.e eVar) {
        super(eVar);
        this.f25901c = bcVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f25899a = obj;
        this.f25900b |= Integer.MIN_VALUE;
        return this.f25901c.emit(null, this);
    }
}
