package com.waze.navigate;

/* loaded from: classes6.dex */
public final class dv extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f31265a;

    /* renamed from: b, reason: collision with root package name */
    int f31266b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ eq f31267c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv(eq eqVar, h.c.e eVar) {
        super(eVar);
        this.f31267c = eqVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f31265a = obj;
        this.f31266b |= Integer.MIN_VALUE;
        return this.f31267c.emit(null, this);
    }
}
