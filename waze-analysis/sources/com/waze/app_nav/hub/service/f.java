package com.waze.app_nav.hub.service;

/* loaded from: classes5.dex */
public final class f extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f15381a;

    /* renamed from: b, reason: collision with root package name */
    int f15382b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ g f15383c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, h.c.e eVar) {
        super(eVar);
        this.f15383c = gVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f15381a = obj;
        this.f15382b |= Integer.MIN_VALUE;
        return this.f15383c.emit(null, this);
    }
}
