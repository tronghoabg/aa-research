package com.waze.network.b;

/* loaded from: classes6.dex */
public final class ar extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f31955a;

    /* renamed from: b, reason: collision with root package name */
    int f31956b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ap f31957c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar(ap apVar, h.c.e eVar) {
        super(eVar);
        this.f31957c = apVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f31955a = obj;
        this.f31956b |= Integer.MIN_VALUE;
        return this.f31957c.emit(null, this);
    }
}
