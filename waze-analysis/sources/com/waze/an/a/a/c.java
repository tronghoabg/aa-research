package com.waze.an.a.a;

/* loaded from: classes4.dex */
public final class c extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f14466a;

    /* renamed from: b, reason: collision with root package name */
    int f14467b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f14468c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, h.c.e eVar) {
        super(eVar);
        this.f14468c = dVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f14466a = obj;
        this.f14467b |= Integer.MIN_VALUE;
        return this.f14468c.emit(null, this);
    }
}
