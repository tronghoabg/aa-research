package com.waze.map.main;

/* loaded from: classes6.dex */
public final class be extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29365a;

    /* renamed from: b, reason: collision with root package name */
    int f29366b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ t f29367c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(t tVar, h.c.e eVar) {
        super(eVar);
        this.f29367c = tVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29365a = obj;
        this.f29366b |= Integer.MIN_VALUE;
        return this.f29367c.emit(null, this);
    }
}
