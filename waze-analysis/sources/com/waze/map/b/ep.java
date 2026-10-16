package com.waze.map.b;

/* loaded from: classes6.dex */
public final class ep extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28271a;

    /* renamed from: b, reason: collision with root package name */
    int f28272b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ av f28273c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep(av avVar, h.c.e eVar) {
        super(eVar);
        this.f28273c = avVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f28271a = obj;
        this.f28272b |= Integer.MIN_VALUE;
        return this.f28273c.emit(null, this);
    }
}
