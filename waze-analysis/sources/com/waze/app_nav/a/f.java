package com.waze.app_nav.a;

/* loaded from: classes5.dex */
public final class f extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f15142a;

    /* renamed from: b, reason: collision with root package name */
    int f15143b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ g f15144c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, h.c.e eVar) {
        super(eVar);
        this.f15144c = gVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f15142a = obj;
        this.f15143b |= Integer.MIN_VALUE;
        return this.f15144c.emit(null, this);
    }
}
