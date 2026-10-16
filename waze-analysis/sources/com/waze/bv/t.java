package com.waze.bv;

/* loaded from: classes7.dex */
public final class t extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f17553a;

    /* renamed from: b, reason: collision with root package name */
    int f17554b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ u f17555c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, h.c.e eVar) {
        super(eVar);
        this.f17555c = uVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f17553a = obj;
        this.f17554b |= Integer.MIN_VALUE;
        return this.f17555c.emit(null, this);
    }
}
