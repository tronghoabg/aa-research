package com.waze.map.b;

/* loaded from: classes6.dex */
public final class ax extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28033a;

    /* renamed from: b, reason: collision with root package name */
    int f28034b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ av f28035c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(av avVar, h.c.e eVar) {
        super(eVar);
        this.f28035c = avVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f28033a = obj;
        this.f28034b |= Integer.MIN_VALUE;
        return this.f28035c.emit(null, this);
    }
}
