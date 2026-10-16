package com.waze.shared_infra.r;

/* loaded from: classes7.dex */
public final class j extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f37972a;

    /* renamed from: b, reason: collision with root package name */
    int f37973b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ g f37974c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g gVar, h.c.e eVar) {
        super(eVar);
        this.f37974c = gVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f37972a = obj;
        this.f37973b |= Integer.MIN_VALUE;
        return this.f37974c.emit(null, this);
    }
}
