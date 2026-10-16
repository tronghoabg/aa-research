package com.waze.install;

/* loaded from: classes6.dex */
public final class an extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f24758a;

    /* renamed from: b, reason: collision with root package name */
    int f24759b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ao f24760c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an(ao aoVar, h.c.e eVar) {
        super(eVar);
        this.f24760c = aoVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f24758a = obj;
        this.f24759b |= Integer.MIN_VALUE;
        return this.f24760c.emit(null, this);
    }
}
