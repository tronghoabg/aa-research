package com.waze.ui.z;

/* loaded from: classes7.dex */
public final class u extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f44017a;

    /* renamed from: b, reason: collision with root package name */
    int f44018b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ y f44019c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(y yVar, h.c.e eVar) {
        super(eVar);
        this.f44019c = yVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f44017a = obj;
        this.f44018b |= Integer.MIN_VALUE;
        return this.f44019c.emit(null, this);
    }
}
