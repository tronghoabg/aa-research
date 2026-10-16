package com.waze.t.b;

/* loaded from: classes5.dex */
public final class ay extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f40704a;

    /* renamed from: b, reason: collision with root package name */
    int f40705b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ av f40706c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay(av avVar, h.c.e eVar) {
        super(eVar);
        this.f40706c = avVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40704a = obj;
        this.f40705b |= Integer.MIN_VALUE;
        return this.f40706c.emit(null, this);
    }
}
