package com.waze.map.g;

/* loaded from: classes6.dex */
public final class b extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29043a;

    /* renamed from: b, reason: collision with root package name */
    int f29044b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ n f29045c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n nVar, h.c.e eVar) {
        super(eVar);
        this.f29045c = nVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29043a = obj;
        this.f29044b |= Integer.MIN_VALUE;
        return this.f29045c.emit(null, this);
    }
}
