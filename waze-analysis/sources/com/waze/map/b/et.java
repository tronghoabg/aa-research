package com.waze.map.b;

/* loaded from: classes6.dex */
public final class et extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28283a;

    /* renamed from: b, reason: collision with root package name */
    int f28284b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ av f28285c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et(av avVar, h.c.e eVar) {
        super(eVar);
        this.f28285c = avVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f28283a = obj;
        this.f28284b |= Integer.MIN_VALUE;
        return this.f28285c.emit(null, this);
    }
}
