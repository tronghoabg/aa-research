package com.waze.map.a;

/* loaded from: classes6.dex */
public final class b extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f27915a;

    /* renamed from: b, reason: collision with root package name */
    int f27916b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f27917c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, h.c.e eVar) {
        super(eVar);
        this.f27917c = cVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f27915a = obj;
        this.f27916b |= Integer.MIN_VALUE;
        return this.f27917c.emit(null, this);
    }
}
