package com.waze.app_nav;

/* loaded from: classes5.dex */
public final class ad extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f15173a;

    /* renamed from: b, reason: collision with root package name */
    int f15174b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ae f15175c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad(ae aeVar, h.c.e eVar) {
        super(eVar);
        this.f15175c = aeVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f15173a = obj;
        this.f15174b |= Integer.MIN_VALUE;
        return this.f15175c.emit(null, this);
    }
}
