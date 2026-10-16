package com.waze.map.b;

/* loaded from: classes6.dex */
public final class en extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28265a;

    /* renamed from: b, reason: collision with root package name */
    int f28266b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ av f28267c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en(av avVar, h.c.e eVar) {
        super(eVar);
        this.f28267c = avVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f28265a = obj;
        this.f28266b |= Integer.MIN_VALUE;
        return this.f28267c.emit(null, this);
    }
}
