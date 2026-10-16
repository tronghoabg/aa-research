package com.waze.map.canvas;

/* loaded from: classes6.dex */
public final class am extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28530a;

    /* renamed from: b, reason: collision with root package name */
    int f28531b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ah f28532c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am(ah ahVar, h.c.e eVar) {
        super(eVar);
        this.f28532c = ahVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f28530a = obj;
        this.f28531b |= Integer.MIN_VALUE;
        return this.f28532c.emit(null, this);
    }
}
