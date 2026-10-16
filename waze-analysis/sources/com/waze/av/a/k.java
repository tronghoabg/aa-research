package com.waze.av.a;

/* loaded from: classes6.dex */
public final class k extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f15812a;

    /* renamed from: b, reason: collision with root package name */
    int f15813b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ g f15814c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(g gVar, h.c.e eVar) {
        super(eVar);
        this.f15814c = gVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f15812a = obj;
        this.f15813b |= Integer.MIN_VALUE;
        return this.f15814c.emit(null, this);
    }
}
