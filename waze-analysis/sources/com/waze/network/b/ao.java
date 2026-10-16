package com.waze.network.b;

/* loaded from: classes6.dex */
public final class ao extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f31948a;

    /* renamed from: b, reason: collision with root package name */
    int f31949b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ap f31950c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao(ap apVar, h.c.e eVar) {
        super(eVar);
        this.f31950c = apVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f31948a = obj;
        this.f31949b |= Integer.MIN_VALUE;
        return this.f31950c.emit(null, this);
    }
}
