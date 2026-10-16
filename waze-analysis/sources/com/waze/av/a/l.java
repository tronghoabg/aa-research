package com.waze.av.a;

/* loaded from: classes6.dex */
public final class l extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f15815a;

    /* renamed from: b, reason: collision with root package name */
    int f15816b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ g f15817c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(g gVar, h.c.e eVar) {
        super(eVar);
        this.f15817c = gVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f15815a = obj;
        this.f15816b |= Integer.MIN_VALUE;
        return this.f15817c.emit(null, this);
    }
}
