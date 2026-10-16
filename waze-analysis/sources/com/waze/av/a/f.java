package com.waze.av.a;

/* loaded from: classes6.dex */
public final class f extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f15799a;

    /* renamed from: b, reason: collision with root package name */
    int f15800b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ g f15801c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, h.c.e eVar) {
        super(eVar);
        this.f15801c = gVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f15799a = obj;
        this.f15800b |= Integer.MIN_VALUE;
        return this.f15801c.emit(null, this);
    }
}
