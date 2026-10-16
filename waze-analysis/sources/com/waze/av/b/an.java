package com.waze.av.b;

/* loaded from: classes6.dex */
public final class an extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f15868a;

    /* renamed from: b, reason: collision with root package name */
    int f15869b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ao f15870c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an(ao aoVar, h.c.e eVar) {
        super(eVar);
        this.f15870c = aoVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f15868a = obj;
        this.f15869b |= Integer.MIN_VALUE;
        return this.f15870c.emit(null, this);
    }
}
