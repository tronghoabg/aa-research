package com.waze.search.a.c;

/* loaded from: classes7.dex */
public final class d extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f35459a;

    /* renamed from: b, reason: collision with root package name */
    int f35460b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f35461c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, h.c.e eVar2) {
        super(eVar2);
        this.f35461c = eVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f35459a = obj;
        this.f35460b |= Integer.MIN_VALUE;
        return this.f35461c.emit(null, this);
    }
}
