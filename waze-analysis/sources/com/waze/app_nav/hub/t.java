package com.waze.app_nav.hub;

/* loaded from: classes5.dex */
public final class t extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f15397a;

    /* renamed from: b, reason: collision with root package name */
    int f15398b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ y f15399c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(y yVar, h.c.e eVar) {
        super(eVar);
        this.f15399c = yVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f15397a = obj;
        this.f15398b |= Integer.MIN_VALUE;
        return this.f15399c.emit(null, this);
    }
}
