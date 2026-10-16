package com.waze.map.b;

/* loaded from: classes6.dex */
public final class ew extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28292a;

    /* renamed from: b, reason: collision with root package name */
    int f28293b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ av f28294c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew(av avVar, h.c.e eVar) {
        super(eVar);
        this.f28294c = avVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f28292a = obj;
        this.f28293b |= Integer.MIN_VALUE;
        return this.f28294c.emit(null, this);
    }
}
