package com.waze.reports_v2.presentation;

/* loaded from: classes7.dex */
public final class bm extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f34882a;

    /* renamed from: b, reason: collision with root package name */
    int f34883b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f34884c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm(bn bnVar, h.c.e eVar) {
        super(eVar);
        this.f34884c = bnVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f34882a = obj;
        this.f34883b |= Integer.MIN_VALUE;
        return this.f34884c.emit(null, this);
    }
}
