package com.waze.reports;

/* loaded from: classes7.dex */
public final class s extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f33964a;

    /* renamed from: b, reason: collision with root package name */
    int f33965b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ t f33966c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, h.c.e eVar) {
        super(eVar);
        this.f33966c = tVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f33964a = obj;
        this.f33965b |= Integer.MIN_VALUE;
        return this.f33966c.emit(null, this);
    }
}
