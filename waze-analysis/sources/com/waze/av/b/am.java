package com.waze.av.b;

/* loaded from: classes6.dex */
public final class am extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f15865a;

    /* renamed from: b, reason: collision with root package name */
    int f15866b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ak f15867c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am(ak akVar, h.c.e eVar) {
        super(eVar);
        this.f15867c = akVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f15865a = obj;
        this.f15866b |= Integer.MIN_VALUE;
        return this.f15867c.emit(null, this);
    }
}
