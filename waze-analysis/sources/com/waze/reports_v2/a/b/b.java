package com.waze.reports_v2.a.b;

/* loaded from: classes7.dex */
public final class b extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f33994a;

    /* renamed from: b, reason: collision with root package name */
    int f33995b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f33996c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, h.c.e eVar) {
        super(eVar);
        this.f33996c = cVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f33994a = obj;
        this.f33995b |= Integer.MIN_VALUE;
        return this.f33996c.emit(null, this);
    }
}
