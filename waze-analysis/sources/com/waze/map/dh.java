package com.waze.map;

/* loaded from: classes6.dex */
public final class dh extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28752a;

    /* renamed from: b, reason: collision with root package name */
    int f28753b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ fx f28754c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh(fx fxVar, h.c.e eVar) {
        super(eVar);
        this.f28754c = fxVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f28752a = obj;
        this.f28753b |= Integer.MIN_VALUE;
        return this.f28754c.emit(null, this);
    }
}
