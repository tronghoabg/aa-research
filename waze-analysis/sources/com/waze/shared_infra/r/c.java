package com.waze.shared_infra.r;

/* loaded from: classes7.dex */
public final class c extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f37956a;

    /* renamed from: b, reason: collision with root package name */
    int f37957b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ g f37958c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, h.c.e eVar) {
        super(eVar);
        this.f37958c = gVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f37956a = obj;
        this.f37957b |= Integer.MIN_VALUE;
        return this.f37958c.emit(null, this);
    }
}
