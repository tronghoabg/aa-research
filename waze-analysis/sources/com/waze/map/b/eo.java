package com.waze.map.b;

/* loaded from: classes6.dex */
public final class eo extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28268a;

    /* renamed from: b, reason: collision with root package name */
    int f28269b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ av f28270c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo(av avVar, h.c.e eVar) {
        super(eVar);
        this.f28270c = avVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f28268a = obj;
        this.f28269b |= Integer.MIN_VALUE;
        return this.f28270c.emit(null, this);
    }
}
