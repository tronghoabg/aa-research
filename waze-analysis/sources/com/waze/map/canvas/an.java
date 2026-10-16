package com.waze.map.canvas;

/* loaded from: classes6.dex */
public final class an extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28533a;

    /* renamed from: b, reason: collision with root package name */
    int f28534b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ah f28535c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an(ah ahVar, h.c.e eVar) {
        super(eVar);
        this.f28535c = ahVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f28533a = obj;
        this.f28534b |= Integer.MIN_VALUE;
        return this.f28535c.emit(null, this);
    }
}
