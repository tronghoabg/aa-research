package com.waze.map.canvas;

/* loaded from: classes6.dex */
public final class ab extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28500a;

    /* renamed from: b, reason: collision with root package name */
    int f28501b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ah f28502c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(ah ahVar, h.c.e eVar) {
        super(eVar);
        this.f28502c = ahVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f28500a = obj;
        this.f28501b |= Integer.MIN_VALUE;
        return this.f28502c.emit(null, this);
    }
}
