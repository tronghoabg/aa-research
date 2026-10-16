package com.waze.map.g;

/* loaded from: classes6.dex */
public final class m extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29075a;

    /* renamed from: b, reason: collision with root package name */
    int f29076b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ n f29077c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, h.c.e eVar) {
        super(eVar);
        this.f29077c = nVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29075a = obj;
        this.f29076b |= Integer.MIN_VALUE;
        return this.f29077c.emit(null, this);
    }
}
