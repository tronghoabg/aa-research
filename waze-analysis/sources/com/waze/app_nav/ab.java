package com.waze.app_nav;

/* loaded from: classes5.dex */
public final class ab extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f15168a;

    /* renamed from: b, reason: collision with root package name */
    int f15169b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ae f15170c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(ae aeVar, h.c.e eVar) {
        super(eVar);
        this.f15170c = aeVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f15168a = obj;
        this.f15169b |= Integer.MIN_VALUE;
        return this.f15170c.emit(null, this);
    }
}
