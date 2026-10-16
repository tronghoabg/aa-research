package com.waze.main_screen.o;

/* loaded from: classes6.dex */
public final class m extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f26706a;

    /* renamed from: b, reason: collision with root package name */
    int f26707b;

    /* renamed from: c, reason: collision with root package name */
    Object f26708c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ n f26709d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, h.c.e eVar) {
        super(eVar);
        this.f26709d = nVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f26706a = obj;
        this.f26707b |= Integer.MIN_VALUE;
        return this.f26709d.emit(null, this);
    }
}
