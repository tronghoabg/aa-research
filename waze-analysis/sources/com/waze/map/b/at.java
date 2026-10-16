package com.waze.map.b;

/* loaded from: classes6.dex */
public final class at extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28023a;

    /* renamed from: b, reason: collision with root package name */
    int f28024b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ av f28025c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at(av avVar, h.c.e eVar) {
        super(eVar);
        this.f28025c = avVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f28023a = obj;
        this.f28024b |= Integer.MIN_VALUE;
        return this.f28025c.emit(null, this);
    }
}
