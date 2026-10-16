package com.waze.network.b;

/* loaded from: classes6.dex */
public final class at extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f31961a;

    /* renamed from: b, reason: collision with root package name */
    int f31962b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ap f31963c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at(ap apVar, h.c.e eVar) {
        super(eVar);
        this.f31963c = apVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f31961a = obj;
        this.f31962b |= Integer.MIN_VALUE;
        return this.f31963c.emit(null, this);
    }
}
