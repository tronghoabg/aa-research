package com.waze.map.canvas;

/* loaded from: classes6.dex */
public final class bs extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28628a;

    /* renamed from: b, reason: collision with root package name */
    int f28629b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ah f28630c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs(ah ahVar, h.c.e eVar) {
        super(eVar);
        this.f28630c = ahVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f28628a = obj;
        this.f28629b |= Integer.MIN_VALUE;
        return this.f28630c.emit(null, this);
    }
}
