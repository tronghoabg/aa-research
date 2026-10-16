package com.waze.map.b;

/* loaded from: classes6.dex */
public final class fc extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28311a;

    /* renamed from: b, reason: collision with root package name */
    int f28312b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ av f28313c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc(av avVar, h.c.e eVar) {
        super(eVar);
        this.f28313c = avVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f28311a = obj;
        this.f28312b |= Integer.MIN_VALUE;
        return this.f28313c.emit(null, this);
    }
}
