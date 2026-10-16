package com.waze.an.b;

/* loaded from: classes4.dex */
public final class a extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f14619a;

    /* renamed from: b, reason: collision with root package name */
    int f14620b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ b f14621c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, h.c.e eVar) {
        super(eVar);
        this.f14621c = bVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f14619a = obj;
        this.f14620b |= Integer.MIN_VALUE;
        return this.f14621c.emit(null, this);
    }
}
