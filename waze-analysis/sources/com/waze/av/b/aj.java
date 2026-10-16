package com.waze.av.b;

/* loaded from: classes6.dex */
public final class aj extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f15858a;

    /* renamed from: b, reason: collision with root package name */
    int f15859b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ak f15860c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(ak akVar, h.c.e eVar) {
        super(eVar);
        this.f15860c = akVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f15858a = obj;
        this.f15859b |= Integer.MIN_VALUE;
        return this.f15860c.emit(null, this);
    }
}
