package com.waze.av.a;

/* loaded from: classes6.dex */
public final class e extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f15796a;

    /* renamed from: b, reason: collision with root package name */
    int f15797b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ g f15798c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, h.c.e eVar) {
        super(eVar);
        this.f15798c = gVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f15796a = obj;
        this.f15797b |= Integer.MIN_VALUE;
        return this.f15798c.emit(null, this);
    }
}
