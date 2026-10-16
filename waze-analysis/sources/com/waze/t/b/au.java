package com.waze.t.b;

/* loaded from: classes5.dex */
public final class au extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f40695a;

    /* renamed from: b, reason: collision with root package name */
    int f40696b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ av f40697c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au(av avVar, h.c.e eVar) {
        super(eVar);
        this.f40697c = avVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40695a = obj;
        this.f40696b |= Integer.MIN_VALUE;
        return this.f40697c.emit(null, this);
    }
}
